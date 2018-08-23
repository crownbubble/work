package problem21;

import java.util.Stack;

/**
 * 21.包含最小函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够找到栈的最小元素的min函数。在栈中，
 * 调用min、push、pop的时间复杂度都是O(1)
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
