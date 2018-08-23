package problem40;
/**
 * 找出字符流中第一个只出现一次的字符
 * 关键点(1)只出现一次表示不重复
 * (2)第一个表示找到之后将其返回不再找下面的了
 * @author Administrator
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Solution2 {
	//HashMap根据字符放入map中每次将次数加1;ArrayList将插入的每个字符放入到list中，list是有顺序
	//地存放，遍历list去找map中根据字符找其出现的次数
	HashMap<Character, Integer> map=new HashMap<Character, Integer>();//存放字符和其出现的次数
	ArrayList<Character> list=new ArrayList<Character>();//存放字符
	public void Insert(Character ch) {
		//判断map中是否已经包含要插入的字符，如果已经包含则将其次数加1
		if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);//map.get(ch)是根据key得到的value值
		}
		else {
			map.put(ch, 1);//如果map还没有包含，则把ch放入map中,并将其值设为1
		}
		list.add(ch);//将ch放入list,便于根据list中保存的ch到map中查询出现的次数
	}
	//遍历list去map中寻找出现的次数
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
