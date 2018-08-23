package problem66;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 s2=new Solution2();
		int[] array= {3,5,5,3,4,4,10};
		System.out.println(s2.FindNumberAppearOnce(array));
	}
	public int FindNumberAppearOnce(int[] array) {
		if(array==null || array.length<=0)
			return -1;
		int bitSum[]={};
		for(int i=0;i<array.length;i++) {
			int bitMask=1;
			for(int j=31;j>=0;--j) {
				int bit=array[i] & bitMask;
				if(bit!=0)
					bitSum[j]+=1;
				bitMask=bitMask<<1;
			}
		}
		int result=0;
		for(int i=0;i<32;++i) {
			result=result<<1;
			result+=bitSum[i]%3;
		}
		return result;
	}
}
