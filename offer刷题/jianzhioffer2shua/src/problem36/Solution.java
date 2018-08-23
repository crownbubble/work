package problem36;
/**
 * 将数字转换成字符串
 * 思路：利用动态规划，自下而上的解决问题
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
	//动态规划，从右到左计算
	//f(r-2)=f(r-1)+g(r-2,r-1)*f(r);
	//如果r-2,r-1能够翻译成字符串，就是大小在0~25,则g(r-2,r-1)=1,不在这个范围则为0
	private int GetTranslationCount(String numbers) {
		int f1=0,f2=1,g=0;
		int temp;
		for(int i=numbers.length()-2;i>=0;i--) {
			if(Integer.parseInt(numbers.charAt(i)+""+numbers.charAt(i+1))<26) 
				g=1;//如果在0~25这个范围内，则g就为1
			g=0;
			temp=f2;
			f2=f2+g*f1;
			f1=temp;
		}
		return f2;
	}
}
