package problem28;

/**
 * 8皇后问题
 * @author Administrator
 *
 */
public class Solution2 {
	int max=8;//记录一共有多少个皇后
	int[] array=new int[max];//该数组保存结果，第一个皇后摆在array[0]，第二个个摆在array[1]列
	static int count=0;
	public static void main(String[] args) {
		Solution2 s2=new Solution2();
		s2.find(0);
		System.out.println("八皇后问题的解法数为:"+count);
	}
	/**
	 * n代表当前是第几个皇后，皇后n在array[n]列
	 * @param i
	 */
	private void find(int n) {
		//终止条件是最后一行已经摆完，由于每一步摆都会校验是都有冲突，所以只要最后一行摆完，说明得到了一个正确的解
		if(n==max) {
			print();
			return;
		}
		//从第一列开始放值，然后判断是否和本行本列本斜线有冲突，如果OK，就进入下一行的逻辑
		for(int i=0;i<max;i++) {
			array[n]=i;
			if(judge(n)) {
				find(n+1);
			}
		}
	}
	private boolean judge(int n) {
		for(int i=0;i<n;i++) {
			if(array[i]==array[n]||Math.abs(n-i)==Math.abs(array[n]-array[i])) {
				return false;
			}
		}
		return true;
	}
	private void print() {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+1+" ");
		}
		count++;
		System.out.println();	
	}
}
