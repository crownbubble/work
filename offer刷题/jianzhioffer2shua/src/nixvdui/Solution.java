package nixvdui;

import java.util.Arrays;

/**
 * �������е������
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] array1= {7,5,6,4};//δ�����������
		int[] array2= {1,2,3,4,5,6,7,8};//ȫ���������������
		int[] array3= {7,6,5,4,3,2,1};//ȫ�����ǽ��������
		int[] array4= {2,1};//�߽���ԣ�ֻ��������
		int[] array5= {1};//�߽���ԣ�ֻ��һ������
		Solution s=new Solution();
		System.out.println("�����е�����Եĸ�����:"+s.InversePairs(array1));
		System.out.println("�����е�����Եĸ�����:"+s.InversePairs(array2));
		System.out.println("�����е�����Եĸ�����:"+s.InversePairs(array3));
		System.out.println("�����е�����Եĸ�����:"+s.InversePairs(array4));
		System.out.println("�����е�����Եĸ�����:"+s.InversePairs(array5));
	}
	public int  InversePairs(int[] array) {
		if(array==null)
			return 0;
		return mergeSort(array);
	}

	private int mergeSort(int[] array) {
		int n=array.length-1;
		return mergeSort(array,0,n);
	}

	private int mergeSort(int[] array, int l, int r) {
		if(l>=r)
			return 0;
		 int mid=(r-l)/2+l;
		 int count1=mergeSort(array, l, mid);
		 int count2=mergeSort(array, mid+1, r);
		 int count3=mergeSort(array,l,mid,r);
		 int count=count1+count2+count3;
		return count;
	}

	private int mergeSort(int[] array, int l, int mid, int r) {
		int[] arr1=Arrays.copyOfRange(array, l, r+1);//����һ���µĴ洢�ռ�
		int i=l;//����i��j��������
		int j=mid+1;
		int count0=0;
		for(int k=l;k<=r;k++) {
			if(i>mid) {//��벿�ִ������
				array[k]=arr1[j-l];
				j++;
			}
			else if (j>r) {//�Ұ벿�ִ������
				array[k]=arr1[i-l];
				i++;
			}
			else if (arr1[i-l]>arr1[j-l]) {//��ʱ���������
				array[k]=arr1[j-l];
				j++;
				count0+=(mid-i+1);
				if(count0>1000000007)
					count0=count0%1000000007;
			}
			else {
				array[k]=arr1[i-l];
				i++;
			}
		}
		return count0;
	}
}
