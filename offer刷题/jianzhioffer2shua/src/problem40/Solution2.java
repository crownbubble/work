package problem40;
/**
 * �ҳ��ַ����е�һ��ֻ����һ�ε��ַ�
 * �ؼ���(1)ֻ����һ�α�ʾ���ظ�
 * (2)��һ����ʾ�ҵ�֮���䷵�ز������������
 * @author Administrator
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Solution2 {
	//HashMap�����ַ�����map��ÿ�ν�������1;ArrayList�������ÿ���ַ����뵽list�У�list����˳��
	//�ش�ţ�����listȥ��map�и����ַ�������ֵĴ���
	HashMap<Character, Integer> map=new HashMap<Character, Integer>();//����ַ�������ֵĴ���
	ArrayList<Character> list=new ArrayList<Character>();//����ַ�
	public void Insert(Character ch) {
		//�ж�map���Ƿ��Ѿ�����Ҫ������ַ�������Ѿ��������������1
		if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);//map.get(ch)�Ǹ���key�õ���valueֵ
		}
		else {
			map.put(ch, 1);//���map��û�а��������ch����map��,������ֵ��Ϊ1
		}
		list.add(ch);//��ch����list,���ڸ���list�б����ch��map�в�ѯ���ֵĴ���
	}
	//����listȥmap��Ѱ�ҳ��ֵĴ���
	public char FirstAppearingOnce() {
		char ch='#';
		for (int i = 0; i < list.size(); i++) {
			if(map.get(list.get(i))==1) {
				ch=list.get(i);
				break;
			}
		}
		return ch;
	}
	public static void main(String[] args) {
		Solution2 s2=new Solution2();
		Scanner input=new Scanner(System.in);
		char c;
		String str=input.nextLine();
		c=str.charAt(0);
		//System.out.println(c);
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
		}
		input.close();
		s2.Insert(c);
		System.out.println(s2.FirstAppearingOnce());
	}

}
