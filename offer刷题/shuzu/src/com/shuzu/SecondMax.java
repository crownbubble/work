package com.shuzu;
//ʵ�ֹ��ܣ��ҳ������еڶ������
/*
 * ��ͨ��һ��ɨ�������õڶ����������ͨ����������������ʵ�֣��ȶ�����������
 * ��һ�����������洢����������������ʼֵΪ��һ��Ԫ�أ���һ����������
 * �洢�����еڶ����������ʼֵΪ��С�ĸ�����Ȼ������������飬��������Ԫ�ر����ֵ
 * ��ֵ��Ҫ���򽫵ڶ����ֵ����Ϊ֮ǰ�������ֵ����������Ԫ��ֵ���������ֵС�����ж�
 * �������Ԫ��ֵ�Ƿ�ȵڶ��������ֵҪ�����������Ϊ����Ԫ��ֵΪ�ڶ����ֵ
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
