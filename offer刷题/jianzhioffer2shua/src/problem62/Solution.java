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
		LinkedList<Integer> indexDeque=new LinkedList<Integer>();//���ڱ��滬�����ڵ�����
		/**
		 * ���������ڲ��������жϴ��ڵ����ֵ
		 */
		for(int i=0;i<size;i++) {
			while(!indexDeque.isEmpty() && array[i]>array[indexDeque.getLast()]) {//getLast��ʾ�����
				indexDeque.removeLast();//��ǰ���KС��ֱ���Ƴ����У���Ϊ�����ܳ�Ϊ�������ڵ����ֵ
			}
			indexDeque.addLast(i);//�����ִ��뻬������
		}
		/**
		 * ������������
		 */
		for(int i=size-1;i<array.length;i++) {
			while(!indexDeque.isEmpty() && array[i]>array[indexDeque.getLast()]) {//getlast�ǲ���ˣ����Ƕ�β
				indexDeque.removeLast();//��ǰ���KС��ֱ���Ƴ����У���Ϊ�����ܳ�Ϊ�������ڵ����ֵ
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
		System.out.println("������һ�����飺�Կո����");
		String str=scanner.nextLine();
		System.out.println("�����뻬�����ڵĴ�С: ");
		int k=scanner.nextInt();
		String[] tmp=str.split(" ");
		int[] arrays=new int[tmp.length];
		for(int i=0;i<tmp.length;i++) {
			arrays[i]=Integer.parseInt(tmp[i]);
		}
		scanner.close();
		Solution s=new Solution();
		System.out.println("�������ڵ����ֵΪ: ");
		System.out.println(s.maxWindow(arrays,k));
	}

}
