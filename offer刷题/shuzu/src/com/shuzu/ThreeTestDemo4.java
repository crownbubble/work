package com.shuzu;
/*
 * ��������������֮��
 * ��ǰ�����Ļ������꣬��Ϊ��ʱ�临�Ӷ���O(n),ͬ����Ҳ���ٵ����������������ռ临�Ӷ���O��n��
 * Ϊ�˽���ռ临�Ӷȵ����⣬���õĽ����ʽ�����������������洢����������
 */
public class ThreeTestDemo4 {
	public static int max(int m,int n) {
		return m>n?m:n;
	}
	
	public static int maxSubMaxDemo4(int[] arr) {
		int n=arr.length;
		int nAll=arr[0];//��n��������������������֮��
		int nEnd=arr[0];//��n����������������һ��Ԫ�ص������������
		for(int i=1;i<n;i++) {
			nEnd=max(nEnd+arr[i],arr[i]);
			nAll=max(nEnd,nAll);
		}
		return nAll;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-1,23,56,89,-45,-56};
		System.out.println(maxSubMaxDemo4(arr));
	}

}
