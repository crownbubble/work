package problem40;

import java.util.LinkedHashMap;

/**
 * 第一个只出现一次的字符
 * 题目一：字符串中第一次只出现一次的字符
 * 利用HashMap进行两次遍历：第一次扫描字符串，每扫描到一个字符,就在哈希表中对应的项中把次数加1
 * 第二次,每扫描到一个字符,就能得出该字符在字符串中出现的次数
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		Solution s=new Solution();
		String str1="abcdadc";
		String str2="abcdabcd";
		String str3="";
		String str4="abcd";
		System.out.println(s.FirstNotRepeatChar(str1));
		System.out.println(s.FirstNotRepeatChar(str2));
		System.out.println(s.FirstNotRepeatChar(str3));
		System.out.print(s.FirstNotRepeatChar(str4));
	}

	private Character FirstNotRepeatChar(String str) {
		LinkedHashMap<Character, Integer> hash=new LinkedHashMap<Character, Integer>();
		char[] ch=str.toCharArray();//将字符串转换成字符数组
		for (char c : ch) {//第一次扫面字符串,记录下每个字符出现的次数
			if(hash.containsKey(c))
				hash.put(c,hash.get(c)+1);
			else {
				hash.put(c, 1);
			}
		}
		for (int i=0;i<ch.length;i++) {
			char c=str.charAt(i);
			if(hash.get(c)==1)
				System.out.print(c+" ");
		}
		return null;
	}
}
