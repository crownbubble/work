package problen11;
/**
 *��ֵ��n�η�
 *��Ŀ��ʵ�ֺ���double Power(double base,int exponent),��base��exponent
 *�η�������ʹ�ÿ⺯����ͬʱ����Ҫ���Ǵ�������
 * @author Administrator
 *
 */
public class Solution {
/*
 * �����������������������
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
