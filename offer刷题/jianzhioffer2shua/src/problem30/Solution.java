package problem30;
public class Solution {
	/**
	 * ˼·����������������ԣ�����������е�Ԫ���ź�����ô����������λ���м��Ԫ��һ���ǳ��ִ�����������Ԫ������һ���Ԫ��
	 * �ÿ����㷨��ʵ�֣�ʵ��ʹ�ÿ��������㷨���������е���λ��
	 * �����������ѡ��һ�����֣�Ȼ��������������ֵ�˳��ʹ�ñ�ѡ�е�����С�Ķ�����������ߣ���ѡ�����������ֶ����������ұ�
	 * ���ѡ�е������±�պ���n/2,��ô������־����������λ��������±����n/2����ô��λ��Ӧ��λ���������
	 * ���ž���������벿�������в��ң���֮�����Ұ벿�������в��ң�����һ�����͵ĵݹ��˼·
	 * @param result
	 * @param arr
	 * @return
	 */
	public int moreThanHalfNums(int[] arr) {
		if(arr==null||arr.length<0)
			return -1;
		int l=0;
		int r=arr.length-1;
		int n=arr.length;
		int middle=n/2;
	    int index=Partition(arr,l,r);
	    //����֮��λ�������м��Ԫ��һ���������ǳ��ִ����������鳤��һ���Ԫ�أ������ͳ��ѧ�ϵ���λ����������Ϊn�������е�n/2���Ԫ��
	    while(index!=middle) {
	    	if(index>middle) {//����ִ�������һ���Ԫ����index�����
	    		r=index-1;
	    		index=Partition(arr,l,r);
	    	}
	    	else {//���ִ�������һ���Ԫ����index���ұ�
				l=index+1;
				index=Partition(arr,l,r);
			}
	    }
	    int result=arr[index];
	    if(checkValidArray(arr,result))
			return result;
		else
			return -1;
	}
	private int Partition(int[] arr, int l, int r) {
		if(arr==null||l<0||r>arr.length-1)
			return -1;
		swap(arr,l,(int)(Math.random()*(r-l+1)+l));
		int v=arr[l];
		//������ʵ�v��������ֳ�С��v�ʹ���v�������֣�arr[l+1,...j],arr[j+1,...r]
		int j=l;//����j��ʾС��v�������һ������
		for(int i=l;i<=r;i++) {
			if(arr[i]<v) {
				swap(arr, j+1, i);
				j++;
			}
		}
		swap(arr, l, j);
		return j;
	}
	private void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	private boolean checkValidArray(int[] arr,int result) {
		// TODO Auto-generated method stub
		int time=0;
		for(int k=0;k<arr.length;k++) {
			arr[k]=result;
			time++;
		}
		if(time*2>arr.length)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int[] arr= {1,2,3,2,2,2,5,4,2};
		System.out.println(s.moreThanHalfNums(arr));
	}
}
