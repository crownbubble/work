package problen11;
/**
 *数值的n次方
 *题目：实现函数double Power(double base,int exponent),求base的exponent
 *次方。不得使用库函数，同时不需要考虑大数问题
 * @author Administrator
 *
 */
public class Solution {
/*
 * 考虑正数、负数和零的问题
 */
	public double Power(double base,int exponent) {
		double result=1;
		if(exponent==0)
			return 1;
		else if (exponent>0) {
			for(int i=1;i<=exponent;i++)
				result=result*base;
		}
		else {
			for(int i=1;i<=(-exponent);i++)
				result=result*base;
				result=1/result;
		}
		return result;
	}
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.Power(2, -3));
		System.out.println(s.Power(0, 0));
		System.out.println(s.Power(10, 2));

	}

}
