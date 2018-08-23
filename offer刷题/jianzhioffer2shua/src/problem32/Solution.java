package problem32;
/**
 * 32.连续子数组的最大和
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] array= {1,-2,3,10,-4,7,2,-5};
		//int[] array= {1,2,3,4};
		//int[] array= {-1,-2,-3,-4,-5};
		//int[] array= {};
		System.out.println(s.FindGreatestSumOfSubArray(array));
	}

	private int FindGreatestSumOfSubArray(int[] array) {
		if(array==null||array.length<0)
			return -1;
		int len=array.length;
		int curNum=0;
		int greatSum=0x80000000;
		
		for(int i=0;i<len;i++) {
			if(curNum<=0) {
				curNum=array[i];
			}
			else {
				curNum+=array[i];
			}
			if(greatSum<curNum)
				greatSum=curNum;
		}
		return greatSum;
	}
}
