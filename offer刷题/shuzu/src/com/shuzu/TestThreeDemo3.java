package com.shuzu;
/*
 * ������: ��������������ֻ��
 * ��������
 * ���ȸ�����������һ��Ԫ��arr[i-1]���������Ĺ�ϵ���Է�Ϊһ������
 * �����
 * (1)������������arr[i-1],����arr[i-1]��β
 * (2)arr[i-1]���������������
 * (3)������鲻����arr[n-1],��ô��arr[1,...n-1]�����������Ϳ���
 * �����arr[1,...n-2]�����������
 * �����Ѿ������(arr[0],...arr[i-1])�����һ�������ΪAll[i-1]
 * ͬʱҲ�����(arr[0],...arr[i-1])�а���arr[i-1]������һ������
 * ΪEnd[i-1],����Եó����¹�ϵ:All[i-1]=max{arr[i-1],End[i-1],arr[i-1]}
 * �����㷨��ʱ�临�Ӷ���O(n) * 
 * 
 */
public class TestThreeDemo3 {
	public static int max(int m,int n) {
		return m>n?m:n;
	}
	
	public static int maxSubMaxDemo3(int[] arr) {
		int n=arr.length;
		int End[]=new int[n];//��ʼ���⼸������
		int All[]=new int[n];
		End[n-1]=arr[n-1];
		All[n-1]=arr[n-1];
		End[0]=All[0]=arr[0];
		for(int i=1;i<n;i++) {//ע�����￪ʼi�ĳ�ʼֵΪ1
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
