package problem30;
/**
 * 定义result和出现次数两个变量
 * @author Administrator
 *
 */
public class Solution2 {
	public int moreThanHalfNums(int[] arr) {
		int result=arr[0];
		int time=1;
		for(int i=1;i<arr.length;i++) {
			if(time==0) {
				result=arr[i];
				time++;
			}
			else if(arr[i]==result) 
				time++;
			else 
				time--;
		}
		if(checkMoreThanHalfNum(arr,result))
			return result;
		return -1;
	}
	private boolean checkMoreThanHalfNum(int[] arr,int result) {
		int time=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==result)
				time++;
		}
		if(2*time>arr.length)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Solution2 s=new Solution2();
		int[] arr= {1,8,3,8,8,8,5,4,8};
		System.out.println(s.moreThanHalfNums(arr));
	}
}
