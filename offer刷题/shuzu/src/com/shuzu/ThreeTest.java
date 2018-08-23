package com.shuzu;
/*
 * 问题描述：一个有n个元素的数组，这n个元素可以是正数也可以是负数，数组中连续
 * 一个或多个元素可以组成一个连续的数组，一个数组可能有多少这种连续的数组，
 * 求子数组和的最大值
 * 法一：“蛮力”法
 * 算法复杂度是O(n^3)，显然效率太低，而且许多子数组都重复计算了，效率
 * 太低了
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
