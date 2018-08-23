package com.shuzu;

public class MaxMinDemo1 {
	static int max;
	static int min;
	public static void GetMaxMindemo1(int[] arr) {
		max=arr[0];
		min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {45,23,89,46,12,8,120};
		GetMaxMindemo1(arr);
		System.out.println("max= "+max);
		System.out.println("min= "+min);
	}

}
