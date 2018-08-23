package problem41and42;

import java.util.ArrayList;

/**
 * 和为S的数字
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] array= {1,2,4,7,11,15};
		System.out.println("和为15的两数为:"+s.FindNumberWithSum(array,15));
	}

	private ArrayList<Integer> FindNumberWithSum(int[] array, int sum) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int i=0;
		int j=array.length-1;
		while(i<j) {
			int currentSum=array[i]+array[j];
			if(currentSum==sum) {
				list.add(array[i]);
				list.add(array[j]);
				break;
			}
			else if (currentSum>sum) {
				j=j-1;
			}
			else {
				i=i+1;
			}
		}
		return list;
	}
}
