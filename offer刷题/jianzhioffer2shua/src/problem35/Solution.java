package problem35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 把数组排成最小的数
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] array= {3,32,312};
		//int[] array= {};
		Solution s=new Solution();
		System.out.println(s.PrintMin(array));
	}

	public String PrintMin(int[] array) {
		String s="";
		ArrayList<Integer> list=new ArrayList<Integer>();
		int n=array.length;
		for(int i=0;i<n;i++) 
			list.add(array[i]);
		Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer str1, Integer str2) {
				String s1=str1+""+str2;
				String s2=str2+""+str1;
				return s1.compareTo(s2);
			}
		});
		for (int j : list) {
			s+=j;
		}
		return s;
	}
}
