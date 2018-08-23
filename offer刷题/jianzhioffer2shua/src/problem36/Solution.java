package problem36;
/**
 * ������ת�����ַ���
 * ˼·�����ö�̬�滮�����¶��ϵĽ������
 * @author Administrator
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.GetTranslationCount(12258));
	}

	private int GetTranslationCount(int i) {
		if(i<0)
			return 0;
		if(i==1)
			return 1;
		return GetTranslationCount(Integer.toString(i));
	}
	//��̬�滮�����ҵ������
	//f(r-2)=f(r-1)+g(r-2,r-1)*f(r);
	//���r-2,r-1�ܹ�������ַ��������Ǵ�С��0~25,��g(r-2,r-1)=1,���������Χ��Ϊ0
	private int GetTranslationCount(String numbers) {
		int f1=0,f2=1,g=0;
		int temp;
		for(int i=numbers.length()-2;i>=0;i--) {
			if(Integer.parseInt(numbers.charAt(i)+""+numbers.charAt(i+1))<26) 
				g=1;//�����0~25�����Χ�ڣ���g��Ϊ1
			g=0;
			temp=f2;
			f2=f2+g*f1;
			f1=temp;
		}
		return f2;
	}
}
