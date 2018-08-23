package problem43and44;
/**
 * ��ת�ַ���֮:��ת���ʵ�˳��
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
		char[] c=str.toCharArray();//���ַ���ת�����ַ�����
		//�������ַ��������ַ���ת����
		Reverse(c,0,c.length-1);
		int begin=0;
		//��ÿ�����ʽ����ַ���ת����
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
