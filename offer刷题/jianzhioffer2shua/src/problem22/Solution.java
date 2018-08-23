package problem22;

import java.util.Stack;

/**
 * 22.输入两个整数序列，第一个序列表示栈的压入序列，请判断第二个序列是不是栈的弹出序列
 * 思路：如果下一个要弹出的数字刚好是栈顶数字 ，那么直接将其弹出；如果不是栈顶数字，则把剩下的数字压入栈中，
 * 直到把下一个栈顶数字压入栈顶为止;如果所有的数字都压入栈中，但是还是没有找到下一个要弹出的数字，则该序列不可能是一个
 * 弹出序列
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		int num1[]= {1,2,3,4,5};
		//int num2[]= {4,5,3,2,1};
		//int num2[]= {4,5,3,1,2};
		int num2[]= {};
		Solution s=new Solution();
		System.out.println(s.isPoporder(num1,num2));
	}

	public boolean isPoporder(int[] num1, int[] num2) {
		//boolean flag=false;
		if(num1==null || num2==null||num1.length<=0 ||num2.length<=0)
			return false;
		Stack<Integer> s=new Stack<Integer>();
		int index=0;
		for(int i=0;i<num1.length;i++) {
			s.push(num1[i]);
			while(!s.isEmpty()&& s.peek()==num2[index]) {//如果栈顶值等于即将出栈序列当前的值则弹出
				s.pop();
				index++;
			}
		}
		return s.isEmpty();
	}
}
