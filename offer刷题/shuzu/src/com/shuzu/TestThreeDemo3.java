package com.shuzu;
/*
 * 问题三: 如何求最大子数组只和
 * 方法三：
 * 首先根据数组的最后一个元素arr[i-1]与最大数组的关系可以分为一下三种
 * 情况：
 * (1)最大子数组包含arr[i-1],即以arr[i-1]结尾
 * (2)arr[i-1]单独构成最大数组
 * (3)最大数组不包括arr[n-1],那么求arr[1,...n-1]的最大子数组就可以
 * 变成求arr[1,...n-2]的最大子数组
 * 假设已经计算出(arr[0],...arr[i-1])的最大一段数组和为All[i-1]
 * 同时也计算出(arr[0],...arr[i-1])中包含arr[i-1]的最大的一段数组
 * 为End[i-1],则可以得出如下关系:All[i-1]=max{arr[i-1],End[i-1],arr[i-1]}
 * 这种算法的时间复杂度是O(n) * 
 * 
 */
public class TestThreeDemo3 {
	public static int max(int m,int n) {
		return m>n?m:n;
	}
	
	public static int maxSubMaxDemo3(int[] arr) {
		int n=arr.length;
		int End[]=new int[n];//初始化这几个数组
		int All[]=new int[n];
		End[n-1]=arr[n-1];
		All[n-1]=arr[n-1];
		End[0]=All[0]=arr[0];
		for(int i=1;i<n;i++) {//注意这里开始i的初始值为1
			End[i]=max(End[i-1]+arr[i],arr[i]);
			All[i]=max(End[i],All[i-1]);
		}
	    return All[n-1];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-1,12,56,0,63,-45};
		System.out.println(maxSubMaxDemo3(arr));
	}

}
