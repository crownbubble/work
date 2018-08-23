package nixvdui;

import java.util.Arrays;

/**
 * 求数组中的逆序对
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] array1= {7,5,6,4};//未经排序的数组
		int[] array2= {1,2,3,4,5,6,7,8};//全部都是升序的数组
		int[] array3= {7,6,5,4,3,2,1};//全部都是降序的数组
		int[] array4= {2,1};//边界测试，只有两个数
		int[] array5= {1};//边界测试，只有一个数字
		Solution s=new Solution();
		System.out.println("数组中的逆序对的个数是:"+s.InversePairs(array1));
		System.out.println("数组中的逆序对的个数是:"+s.InversePairs(array2));
		System.out.println("数组中的逆序对的个数是:"+s.InversePairs(array3));
		System.out.println("数组中的逆序对的个数是:"+s.InversePairs(array4));
		System.out.println("数组中的逆序对的个数是:"+s.InversePairs(array5));
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
		int[] arr1=Arrays.copyOfRange(array, l, r+1);//开辟一块新的存储空间
		int i=l;//定义i和j两个索引
		int j=mid+1;
		int count0=0;
		for(int k=l;k<=r;k++) {
			if(i>mid) {//左半部分处理结束
				array[k]=arr1[j-l];
				j++;
			}
			else if (j>r) {//右半部分处理结束
				array[k]=arr1[i-l];
				i++;
			}
			else if (arr1[i-l]>arr1[j-l]) {//此时存在逆序对
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
