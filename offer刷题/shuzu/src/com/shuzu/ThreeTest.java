package com.shuzu;
/*
 * ����������һ����n��Ԫ�ص����飬��n��Ԫ�ؿ���������Ҳ�����Ǹ���������������
 * һ������Ԫ�ؿ������һ�����������飬һ����������ж����������������飬
 * ��������͵����ֵ
 * ��һ������������
 * �㷨���Ӷ���O(n^3)����ȻЧ��̫�ͣ�������������鶼�ظ������ˣ�Ч��
 * ̫����
 */
public class ThreeTest {
	public static int maxSubArray(int[] arr) {
		int n=arr.length;
		int ThisSum=0,maxSum=0,i,j,k;
		for(i=0;i<n;i++) {
			for(j=i;j<n;j++) {
				ThisSum=0;
				for(k=i;k<j;k++)
					ThisSum+=arr[k];
				if(ThisSum>maxSum)
					maxSum=ThisSum;
			}
		}
		return maxSum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-1,45,23,-9,12,0,-2,78};
		System.out.println(maxSubArray(arr));
	}

}
