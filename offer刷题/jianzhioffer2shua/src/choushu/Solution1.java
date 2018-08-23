package choushu;
/**
 * 求丑数
 * 按照从小到大的顺序的第1500个丑数
 * @author Administrator
 *
 */
public class Solution1 {
	public static void main(String[] args) {
		Solution1 s1=new Solution1();
		System.out.println(s1.getUglyNumber(1));
		System.out.println(s1.getUglyNumber(0));
		System.out.println(s1.getUglyNumber(2));
		System.out.println(s1.getUglyNumber(5));
		System.out.println(s1.getUglyNumber(1500));
	}
	public int getUglyNumber(int index) {
		if(index<=0)
			return 0;
		int[] pUglyNumbers=new int[index];
		pUglyNumbers[0]=1;
		int nextUglyIndex=1;
		int p2=0;
		int p3=0;
		int p5=0;
		while(nextUglyIndex<index) {
			int min=min(pUglyNumbers[p2]*2,pUglyNumbers[p3]*3,pUglyNumbers[p5]*5);
			pUglyNumbers[nextUglyIndex]=min;
			while(pUglyNumbers[p2]*2<=pUglyNumbers[nextUglyIndex]) {
				p2++;
			}
			while(pUglyNumbers[p3]*3<=pUglyNumbers[nextUglyIndex]) {
				p3++;
			}
			while(pUglyNumbers[p5]*5<=pUglyNumbers[nextUglyIndex]) {
				p5++;
			}
			nextUglyIndex++;
		}
		return pUglyNumbers[nextUglyIndex-1];
	}
	private int min(int n1, int n2, int n3) {
		int min=n1<n2?n1:n2;
		return min<n3?min:n3;
	}
}
