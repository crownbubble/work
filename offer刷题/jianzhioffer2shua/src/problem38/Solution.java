package problem38;
/**
 * 在排序数组中找到数字,并计算出该数字出现的次数
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] arr= {1,2,3,3,3,3,4,5};
		System.out.println(s.getNumbersOfArray(arr,3));
	}

	private int getNumbersOfArray(int[] arr, int i) {
		int firstIndex=getFirstIndexOfArray(arr,i,0,arr.length-1);
		int endIndex=getLastIndexOfArray(arr,i,0,arr.length-1);
		return (endIndex-firstIndex+1);
	}
	//找出某数字第一次出现的位置,利用二分查找法
	private int getFirstIndexOfArray(int[] arr, int i,int start,int end) {
		if(start>end)
			return -1;
	
		int middleIndex=(start+end)/2;
		int middleData=arr[middleIndex];
		if(middleData==i) {
			if(middleIndex>0 && arr[middleIndex-1]!=i || middleIndex==0) {
				return middleIndex;
			}
			else {
				end=middleIndex-1;
			}
		}
		else if (middleData>i) {
			end=middleIndex-1;
		}
		else {
			start=middleIndex+1;
		}
		return getFirstIndexOfArray(arr,i,start,end);
	}
	private int getLastIndexOfArray(int[] arr, int i,int start,int end) {
		if(start>end)
			return -1;
		int middleIndex=(start+end)/2;
		int middleData=arr[middleIndex];
		if(middleData==i) {
			if(middleIndex<arr.length && arr[middleIndex+1]!=middleData || middleIndex==arr.length-1) {
				return middleIndex;
			}
			else {
				start=middleIndex+1;
			}
		}
		else if (middleData>=i) {
			end=middleIndex-1;
		}
		else {
			start=middleIndex+1;
		}
		return getLastIndexOfArray(arr,i,start,end);
	}
}
