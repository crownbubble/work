package problem40;

import java.util.LinkedHashMap;

/**
 * ��һ��ֻ����һ�ε��ַ�
 * ��Ŀһ���ַ����е�һ��ֻ����һ�ε��ַ�
 * ����HashMap�������α�������һ��ɨ���ַ�����ÿɨ�赽һ���ַ�,���ڹ�ϣ���ж�Ӧ�����аѴ�����1
 * �ڶ���,ÿɨ�赽һ���ַ�,���ܵó����ַ����ַ����г��ֵĴ���
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
		char[] ch=str.toCharArray();//���ַ���ת�����ַ�����
		for (char c : ch) {//��һ��ɨ���ַ���,��¼��ÿ���ַ����ֵĴ���
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
