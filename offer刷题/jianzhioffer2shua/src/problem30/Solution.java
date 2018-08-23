package problem30;
public class Solution {
	/**
	 * 思路二：利用数组的特性，如果对数组中的元素排好序，那么排序数组中位于中间的元素一定是出现次数超过数组元素总数一半的元素
	 * 用快排算法来实现，实际使用快速排序算法来找数组中的中位数
	 * 在数组中随机选择一个数字，然后调整数组中数字的顺序，使得比选中的数字小的都排在它的左边，比选中数组大的数字都排在他的右边
	 * 如果选中的数字下标刚好是n/2,那么这个数字就是数组的中位数，如果下标大于n/2，那么中位数应该位于它的左边
	 * 接着就在它的左半部分数组中查找，反之，在右半部分数组中查找，这是一个典型的递归的思路
	 * @param result
	 * @param arr
	 * @return
	 */
	public int moreThanHalfNums(int[] arr) {
		if(arr==null||arr.length<0)
			return -1;
		int l=0;
		int r=arr.length-1;
		int n=arr.length;
		int middle=n/2;
	    int index=Partition(arr,l,r);
	    //排序之后位于数组中间的元素一定是数组是出现次数超过数组长度一半的元素，这就是统计学上的中位数，即长度为n的数组中第n/2大的元素
	    while(index!=middle) {
	    	if(index>middle) {//则出现次数超过一半的元素在index的左边
	    		r=index-1;
	    		index=Partition(arr,l,r);
	    	}
	    	else {//出现次数超过一半的元素在index的右边
				l=index+1;
				index=Partition(arr,l,r);
			}
	    }
	    int result=arr[index];
	    if(checkValidArray(arr,result))
			return result;
		else
			return -1;
	}
	private int Partition(int[] arr, int l, int r) {
		if(arr==null||l<0||r>arr.length-1)
			return -1;
		swap(arr,l,(int)(Math.random()*(r-l+1)+l));
		int v=arr[l];
		//定义合适的v，将数组分成小于v和大于v的两部分，arr[l+1,...j],arr[j+1,...r]
		int j=l;//定义j表示小于v部分最后一个索引
		for(int i=l;i<=r;i++) {
			if(arr[i]<v) {
				swap(arr, j+1, i);
				j++;
			}
		}
		swap(arr, l, j);
		return j;
	}
	private void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	private boolean checkValidArray(int[] arr,int result) {
		// TODO Auto-generated method stub
		int time=0;
		for(int k=0;k<arr.length;k++) {
			arr[k]=result;
			time++;
		}
		if(time*2>arr.length)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int[] arr= {1,2,3,2,2,2,5,4,2};
		System.out.println(s.moreThanHalfNums(arr));
	}
}
