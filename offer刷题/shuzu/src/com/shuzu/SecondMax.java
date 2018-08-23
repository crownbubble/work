package com.shuzu;
//实现功能：找出数组中第二大的数
/*
 * 想通过一次扫描数组获得第二大的数，即通过设置两个变量来实现，先定义两个变量
 * ：一个变量用来存储数组中最大的数，初始值为第一个元素；另一个变量用来
 * 存储数组中第二大的数，初始值为最小的负数。然后遍历整个数组，如果数组的元素比最大值
 * 的值还要大，则将第二大的值更新为之前最大数的值；如果数组的元素值比最大数的值小，则判断
 * 该数组的元素值是否比第二大的数的值要大，若大，则更新为数组元素值为第二大的值
*/
public class SecondMax {
	public static int FindSecMax(int data[]) {
		int count=data.length;
		int maxnumber=data[0];
		int secmax=Integer.MIN_VALUE;
		for(int i=0;i<count;i++) {
			if(data[i]>maxnumber) {
				secmax=maxnumber;
			maxnumber=data[i];
			}
			else {
				if(data[i]>secmax)
					secmax=data[i];
			}
		}
		return secmax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {0,12,89,56,48,100,23,76};
		
		System.out.println(FindSecMax(data));
	}

}
