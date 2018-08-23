package problem33;

import java.util.Scanner;

/**
 * 33.1~n的整数中1出现的次数
 * 题目：输入一个整数n，求1~n这n个整数对应的十进制表示中1出现的次数
 * 思路：在分析过程中分成一位数、两位数、3位数及以上,三种情况
 * @author Administrator
 *
 */

public class Solution {
	public static void main(String[] args) {
		System.out.println("请输入一个整数:");
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		Solution s=new Solution();
		System.out.println("1-N范围内的整数中1出现的次数为:"+s.NumberOf1Between1andN(n));
	}
	private long NumberOf1Between1andN(long n) {
		//从右到左表示位数依次升高
		long count=0;//用于储存1的个数
		long i=1;//表示个位的数字
		long current=0;//表示百位数字
		long before=0;//表示高于百位的数字
		long after=0;//表示低于于百位的数字
		while((n/i)!=0) {//一直到比完个位数字为止
			current=(n/i)%10;
			before=n/(i*10);
			after=n-(n/i)*i;
			if(current>1)//当前位大于1,仅和高位有关
				count=count+(before+1)*i;
			else if (current==0) //仅和高位有关
				count=count+before*i;
			else if(current==1)
				count=count+before*i+after+1;
			i=i*10;
			}
		return count;
	}
}
