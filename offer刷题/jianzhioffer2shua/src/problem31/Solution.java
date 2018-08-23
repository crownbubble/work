package problem31;
/**
 * �������е���λ��
 * 1. ʹ�ô󶥶�+С���ѵ�����
 * 2. �������е�������Ŀ��ܳ���1����������ʹ��λ��ֻ������������ѵĽ��Ӵ� 
 * 3. �󶥶ѵ��������ݶ�С��С���ѣ�����������������Ҫ��ƽ�������������Ѷ�����֮�С�
 * @author Administrator
 *
 */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
	private int count=0;
	private PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
	private PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(15,new Comparator<Integer>() {
		public int compare(Integer o1,Integer o2) {
			return o2-o1;
		}
	});
	//�����ַ����ŵ����ʵ�λ��
	public void Insert(Integer num) {
		if(count%2==0) {
			maxHeap.offer(num);
			int filteredMaxNum=maxHeap.poll();
			minHeap.offer(filteredMaxNum);
		}else {
			minHeap.offer(num);
			int filteredMinNum=minHeap.poll();
			maxHeap.offer(filteredMinNum);
		}
		count++;
	}
	//����λ��
	public Double GetMedian() {
		if(count%2==0)
			return new Double((minHeap.peek()+maxHeap.peek()))/2;
		else 
			return new Double(minHeap.peek());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Solution s=new Solution();
		s.Insert(sc.nextInt());
		s.Insert(sc.nextInt());
		s.Insert(sc.nextInt());
		Double midValue = s.GetMedian();
		System.out.println(midValue);
	}
}
