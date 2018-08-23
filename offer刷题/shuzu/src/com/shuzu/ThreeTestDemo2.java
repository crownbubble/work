package com.shuzu;
/*
 * 问题描述：如何求最大子数组之和
 * 重复利用方法一种的已经计算的子数组之和，例如
 * Sum[i,j]=Sum[i,j-1]+arr[j]
 * 因此可以提高程序的效率
 * 此时的时间复杂度为:0(n^2)
 */
public class ThreeTestDemo2 {
	public static int maxSubarray2(int[] arr) {
		int size=arr.length;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			int sum=0;
			for(int j=i;j<size;j++) {
				sum=sum+arr[j];
				if(sum>maxSum)
					maxSum=sum;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-12,0,45,46,-123,56};
		System.out.println(maxSubarray2(arr));
	}

}
