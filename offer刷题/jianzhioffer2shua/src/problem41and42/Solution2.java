package problem41and42;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 s2=new Solution2();
		s2.FindContinousSequence(15);
	}

	private void FindContinousSequence(int sum) {
		if(sum<3)
			return;
		int small=1;
		int big=2;
		int middle=(1+sum)/2;
		int curSum=small+big;
		while(small<big) {
			if(curSum==sum)
				PrintContinuousSequence(small,big);
			while(curSum>sum && small<middle) {
				curSum-=small;
				small++;
				
				if(curSum==sum)
					PrintContinuousSequence(small, big);
			}
			big++;
			curSum+=big;
		}
	}

	private void PrintContinuousSequence(int small, int big) {
		for(int i=small;i<=big;i++) {
			System.out.print(i+" ");
		}
		System.out.println('\n');
	}
}
