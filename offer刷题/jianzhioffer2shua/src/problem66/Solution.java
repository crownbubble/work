package problem66;

public class Solution {
	public static void main(String[] args) {
		int[] array= {2,4,3,6,3,2,5,5};
		Solution s=new Solution();
		s.FindNumsAppearOnce(array);
	}

	private void FindNumsAppearOnce(int[] array) {
		if(array==null || array.length<2)
			return;
		int resultExclusiveOR=0;
		for(int i=0;i<array.length;i++)
			resultExclusiveOR^=array[i];
		//System.out.println("resultExclusiveOR"+Integer.toBinaryString(resultExclusiveOR));
		/**
		 * resultExclusiveOR中找到第一个为1的位的位置
		 * resultExclusiveOR右移一位，count左移一位，当resultExclusiveOR=1时,
		 * count就是第一位为1的位置
		 */
		int count=1;
		while(true) {
			if((resultExclusiveOR & 1)==1)
				break;
			resultExclusiveOR>>=1;
			count<<=1;
		}
		//System.out.println("count:"+Integer.toBinaryString(count));
		int num1=0;
		int num2=0;
		for(int i=0;i<array.length;i++) {//将数组进行分组
			if((array[i] & count)==0) {
				num1^=array[i];
			}
			else 
				num2^=array[i];
		}
		System.out.println(num1);
		System.out.println(num2);
	}
}
