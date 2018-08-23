package problem24;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution s=new Solution();
		//int[] nums= {5,7,6,9,11,10,8};
		//int[] nums= {7,4,6,5};
		int[]nums= {1,2,3,0};
		//int[] nums= {3,5,4};
		System.out.println(s.VerifySequenceOfBST(nums));
	}

	public boolean VerifySequenceOfBST(int[] nums) {
		if(nums==null || nums.length==0)
			return false;
		int len=nums.length;
		int root=nums[len-1];
		int cut=0;
		for(int i=0;i<len-1;i++) {
			if(nums[i]>root) {
				cut=i;
				break;
			}
			cut = i;
		}
		if(cut==0)
			VerifySequenceOfBST(Arrays.copyOfRange(nums, 0, len-1));
		for(int j=cut;j<len-1;j++) {
			if(nums[j]<root)
				return false;
		}
		boolean left=true;
		if(cut>0)
			left=VerifySequenceOfBST(Arrays.copyOfRange(nums, 0, cut));
		boolean right=true;
		if(cut<len-1)
			right=VerifySequenceOfBST(Arrays.copyOfRange(nums,cut,len-1));
		return (left && right);
	}

}
