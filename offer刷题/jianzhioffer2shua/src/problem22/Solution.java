package problem22;

import java.util.Stack;

/**
 * 22.���������������У���һ�����б�ʾջ��ѹ�����У����жϵڶ��������ǲ���ջ�ĵ�������
 * ˼·�������һ��Ҫ���������ָպ���ջ������ ����ôֱ�ӽ��䵯�����������ջ�����֣����ʣ�µ�����ѹ��ջ�У�
 * ֱ������һ��ջ������ѹ��ջ��Ϊֹ;������е����ֶ�ѹ��ջ�У����ǻ���û���ҵ���һ��Ҫ���������֣�������в�������һ��
 * ��������
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
			while(!s.isEmpty()&& s.peek()==num2[index]) {//���ջ��ֵ���ڼ�����ջ���е�ǰ��ֵ�򵯳�
				s.pop();
				index++;
			}
		}
		return s.isEmpty();
	}
}
