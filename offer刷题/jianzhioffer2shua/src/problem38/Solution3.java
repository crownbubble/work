package problem38;
/**
 * 数组中数值和下标相等的元素
 * @author Administrator
 *
 */
public class Solution3 {
	public static void main(String[] args) {
		Solution3 s3=new Solution3();
		int[] arr= {-3,-2,1,3,5};
		int[] arr1= {-1,-2,-3,-4};
		int result=s3.findNumber(arr,0,arr.length-1);
		int result1=s3.findNumber(arr1,0,arr1.length-1);
		System.out.println("数组中数值和下标相等的元素是:"+result);
		System.out.println("数组中数值和下标相等的元素是:"+result1);
	}

	private int findNumber(int[] arr, int start, int end) {
		if(start>end)
			return -1;
		int middleIndex=(start+end)/2;
		int middleData=arr[middleIndex];
		if(middleIndex==middleData) {
			return middleIndex;
		}
		else if(middleIndex>middleData){
			start=middleIndex+1;
		}
		else {
			end=middleIndex-1;
		}
		return findNumber(arr, start, end);
	}
}
