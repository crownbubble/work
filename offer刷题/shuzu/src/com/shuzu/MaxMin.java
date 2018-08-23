package com.shuzu;

public class MaxMin {
	static int max;
	static int min;
	public static void GetMaxMin(int arr[]) {
		max=arr[0];
		min=arr[0];
		int len=arr.length;
		for(int i=1;i<len-1;i=i+2) {
			if(i+1>len) {
				if(arr[i]>max)
					max=arr[i];
				if(arr[i]<min)
					min=arr[i];
			}
			if(arr[i]<arr[i+1]) {
				if(arr[i]<min)
					min=arr[i];
				if(arr[i+1]>max)
					max=arr[i+1];
			}
			if(arr[i]>arr[i+1]) {
				if(arr[i]>max)
					max=arr[i];
				if(arr[i+1]<min)
					min=arr[i+1];
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {45,23,89,46,12,8,120};
		GetMaxMin(arr);
		System.out.println("max= "+max);
		System.out.println("min= "+min);
	}

}
