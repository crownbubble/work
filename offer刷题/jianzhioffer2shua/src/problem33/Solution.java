package problem33;

import java.util.Scanner;

/**
 * 33.1~n��������1���ֵĴ���
 * ��Ŀ������һ������n����1~n��n��������Ӧ��ʮ���Ʊ�ʾ��1���ֵĴ���
 * ˼·���ڷ��������зֳ�һλ������λ����3λ��������,�������
 * @author Administrator
 *
 */

public class Solution {
	public static void main(String[] args) {
		System.out.println("������һ������:");
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		Solution s=new Solution();
		System.out.println("1-N��Χ�ڵ�������1���ֵĴ���Ϊ:"+s.NumberOf1Between1andN(n));
	}
	private long NumberOf1Between1andN(long n) {
		//���ҵ����ʾλ����������
		long count=0;//���ڴ���1�ĸ���
		long i=1;//��ʾ��λ������
		long current=0;//��ʾ��λ����
		long before=0;//��ʾ���ڰ�λ������
		long after=0;//��ʾ�����ڰ�λ������
		while((n/i)!=0) {//һֱ�������λ����Ϊֹ
			current=(n/i)%10;
			before=n/(i*10);
			after=n-(n/i)*i;
			if(current>1)//��ǰλ����1,���͸�λ�й�
				count=count+(before+1)*i;
			else if (current==0) //���͸�λ�й�
				count=count+before*i;
			else if(current==1)
				count=count+before*i+after+1;
			i=i*10;
			}
		return count;
	}
}
