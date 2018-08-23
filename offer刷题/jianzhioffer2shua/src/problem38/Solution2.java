package problem38;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 s2=new Solution2();
		int[] arr= {0,1,2,3,4,5,7,8};
		int[] arr1= {0};
		int[] arr2= {};
		int result=s2.findFirstNumber(arr,0,arr.length-1);
		int result1=s2.findFirstNumber(arr1,0,arr1.length-1);
		int result2=s2.findFirstNumber(arr2,0,arr2.length-1);
		System.out.println("数组中缺失的数字是："+result);
		System.out.println("数组中缺失的数字是："+result1);
		System.out.println("数组中缺失的数字是："+result2);
	}

	public int findFirstNumber(int[] arr,int start,int end) {
		if(start>end)
			return -1;
		int middleIndex=(start+end)/2;
		int middleData=arr[middleIndex];
		if(middleData==middleIndex) {
			start=middleIndex+1;
		}
		if(middleData!=middleIndex) {
			if(arr[middleIndex-1]!=middleIndex-1) {
				end=middleIndex-1;
			}
			else {
				return middleIndex;
			}
		}
		return findFirstNumber(arr, start, end);
	}
}
