package problem62;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public ArrayList<Integer> maxWindow(int[] array,int size){
		ArrayList<Integer> ret=new ArrayList<Integer>();
		if(array==null) {
			return null;
		}
		if(array.length <size || size<1) {
			return ret;
		}
		LinkedList<Integer> indexDeque=new LinkedList<Integer>();//用于保存滑动窗口的数字
		/**
		 * 滑动窗口内部，用于判断窗口的最大值
		 */
		for(int i=0;i<size;i++) {
			while(!indexDeque.isEmpty() && array[i]>array[indexDeque.getLast()]) {//getLast表示插入端
				indexDeque.removeLast();//将前面比K小的直接移除队列，因为不可能成为滑动窗口的最大值
			}
			indexDeque.addLast(i);//将数字存入滑动窗口
		}
		/**
		 * 滑动整个窗口
		 */
		for(int i=size-1;i<array.length;i++) {
			while(!indexDeque.isEmpty() && array[i]>array[indexDeque.getLast()]) {//getlast是插入端，就是队尾
				indexDeque.removeLast();//将前面比K小的直接移除队列，因为不可能成为滑动窗口的最大值
			}
			indexDeque.addLast(i);
			if(i-indexDeque.getFirst()+1>size) {
				indexDeque.removeFirst();
			}
			ret.add(array[indexDeque.getFirst()]);
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个数组：以空格隔开");
		String str=scanner.nextLine();
		System.out.println("请输入滑动窗口的大小: ");
		int k=scanner.nextInt();
		String[] tmp=str.split(" ");
		int[] arrays=new int[tmp.length];
		for(int i=0;i<tmp.length;i++) {
			arrays[i]=Integer.parseInt(tmp[i]);
		}
		scanner.close();
		Solution s=new Solution();
		System.out.println("滑动窗口的最大值为: ");
		System.out.println(s.maxWindow(arrays,k));
	}

}
