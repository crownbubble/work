package problem43and44;
/**
 * ��ת�ַ���֮������ת�ַ���
 * @author Administrator
 *
 */
public class Solution2 {
	public static void main(String[] args) {
		Solution2 s2=new Solution2();
		String str="abcdefg";
		s2.leftReverse(str,4);
	}
	private void leftReverse(String str,int n) {
		if(str==null || n>str.length())
			return;
		char[] ch=str.toCharArray();
		int len=ch.length-1;
		if(len>0 && n>0 && n<len) {
			int begin=0;
			int end=n-1;
			int begin1=n;
			int end1=len;
			Reverse(ch,begin,end);//��ת�ַ���ǰ��n���ַ�
			Reverse(ch,begin1,end1);//��ת�ַ����ĺ��沿��
			Reverse(ch,begin,end1);//��ת�����ַ���
			System.out.print(ch);
		}
	}
	private void Reverse(char[] ch, int begin, int end) {
		while(begin<end) {
			char temp=ch[begin];
			ch[begin]=ch[end];
			ch[end]=temp;
			begin++;
			end--;
		}
	}
}
