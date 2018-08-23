package problem29;
/**
 *30.数组中出现次数超过一半的元素
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,2,2,2,2};
		//int[] array= {};
		Solution s=new Solution();
		s.isMoreThanHalf(array);
	}
	private void isMoreThanHalf(int[] array) {
		int result=array[0];
		int time=1;
		int len=array.length;
		if(len==0)
			return;
		for(int i=0;i<len;i++) {
			if(array[i]==result) {
				time++;
			}
			if(time==0) {
				result=array[i];
				time++;
			}
			if(array[i]!=result)
				time--;
		}
		if(checkMoreThanHalf(array,result)) {
			System.out.println("出现次数超过一半的数是:"+result);
		}
	}
	private boolean checkMoreThanHalf(int[] array, int result) {
		int len=array.length;
		int time=0;
		for(int i=0;i<len;i++) {
			if(array[i]==result) {
				time++;
			}
		}
		if(time*2>len)
			return true; 
		return false;
	}
}
