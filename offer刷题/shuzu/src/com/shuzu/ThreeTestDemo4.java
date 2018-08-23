package com.shuzu;
/*
 * 如何求最大子数组之和
 * 在前面三的基础上年，因为其时间复杂度是O(n),同样的也开辟的另外的两个数组其空间复杂度是O（n）
 * 为了解决空间复杂度的问题，采用的解决方式是利用两个变量来存储这两个数组
 */
public class ThreeTestDemo4 {
	public static int max(int m,int n) {
		return m>n?m:n;
	}
	
	public static int maxSubMaxDemo4(int[] arr) {
		int n=arr.length;
		int nAll=arr[0];//有n个数字数组的最大子数组之和
		int nEnd=arr[0];//有n个数字数组包含最后一个元素的子数组的最大和
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
