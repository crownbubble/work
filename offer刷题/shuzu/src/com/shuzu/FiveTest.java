package com.shuzu;
/*
 * �����壺�����������������ӵ���20�������
 * ����һ������������
 */
public class FiveTest {
	public static void FindTest(int[] arr,int sum) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				if(arr[i]+arr[j]==sum)
					System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,18,45,18,2,14,6};
		FindTest(arr, 20);
	}

}
