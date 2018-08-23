package problem43and44;
/**
 * 翻转字符串之:翻转单词的顺序
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		Solution s=new Solution();
		String str="I am a student.";
		String str1="student";
		String str2=" ";
		System.out.println(s.ReverseSentence(str));
		System.out.println(s.ReverseSentence(str1));
		System.out.println(s.ReverseSentence(str2));
	}

	private String ReverseSentence(String str) {
		if(str==null)
			return null;
		char[] c=str.toCharArray();//将字符创转化成字符数组
		//对整个字符串进行字符反转操作
		Reverse(c,0,c.length-1);
		int begin=0;
		//对每个单词进行字符反转操作
		for(int i=1;i<c.length;i++) {
			if(c[i]==' ') {
				Reverse(c,begin,i-1);
				begin=i+1;
			}
		}
		Reverse(c,begin,c.length-1);
		return new String(c);
	}

	private void Reverse(char[] c, int front, int end) {
		while(front<end) {
			char temp=c[end];
			c[end]=c[front];
			c[front]=temp;
			front++;
			end--;
		}
	}
}
