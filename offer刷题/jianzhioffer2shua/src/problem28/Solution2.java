package problem28;

/**
 * 8�ʺ�����
 * @author Administrator
 *
 */
public class Solution2 {
	int max=8;//��¼һ���ж��ٸ��ʺ�
	int[] array=new int[max];//�����鱣��������һ���ʺ����array[0]���ڶ���������array[1]��
	static int count=0;
	public static void main(String[] args) {
		Solution2 s2=new Solution2();
		s2.find(0);
		System.out.println("�˻ʺ�����Ľⷨ��Ϊ:"+count);
	}
	/**
	 * n����ǰ�ǵڼ����ʺ󣬻ʺ�n��array[n]��
	 * @param i
	 */
	private void find(int n) {
		//��ֹ���������һ���Ѿ����꣬����ÿһ���ڶ���У���Ƕ��г�ͻ������ֻҪ���һ�а��꣬˵���õ���һ����ȷ�Ľ�
		if(n==max) {
			print();
			return;
		}
		//�ӵ�һ�п�ʼ��ֵ��Ȼ���ж��Ƿ�ͱ��б��б�б���г�ͻ�����OK���ͽ�����һ�е��߼�
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
