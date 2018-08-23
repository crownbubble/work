package problem21;

import java.util.Stack;

/**
 * 21.������С������ջ
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��ҵ�ջ����СԪ�ص�min��������ջ�У�
 * ����min��push��pop��ʱ�临�Ӷȶ���O(1)
 * @author Administrator
 *
 */
public class Solution {
		Stack<Integer> dataStack=new Stack<Integer>();
		Stack<Integer> minStack=new Stack<Integer>();
	    public void push(int node) {
	    	dataStack.push(node);
	    	if(minStack.isEmpty()|| node<minStack.peek())
	    		minStack.push(node);
	    	else
	    		minStack.push(minStack.peek());
	    } 
	    public void pop() {
	    	minStack.pop();
	    	dataStack.pop();
	    }
	    public int top() {
	    	return dataStack.peek();
	    }
	    public int min() {
	    	return minStack.peek();
	    }
	    public static void main(String[] args) {
	    	Solution s=new Solution();
	    	s.push(3);
			s.push(2);
			s.push(4);
			s.push(1);
			s.push(0);
			System.out.println(s.min());
	    }
}
