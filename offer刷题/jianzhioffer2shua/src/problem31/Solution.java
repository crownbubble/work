package problem31;
/**
 * 数据流中的中位数
 * 1. 使用大顶堆+小顶堆的容器
 * 2. 两个堆中的数据数目差不能超过1，这样可以使中位数只会出现在两个堆的交接处 
 * 3. 大顶堆的所有数据都小于小顶堆，这样就满足了排序要求。平均数就在两个堆顶的数之中。
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
	//读入字符，放到合适的位置
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
	//求中位数
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
