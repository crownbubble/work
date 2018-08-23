package problem14;
/**
 * 调整数组顺序使奇数位于偶数前面
 * 测试用例[1,2,3,4,5],输出结果应该是[1,3,5,2,4]
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		Solution s=new Solution();
		s.oddBeforeEven(array);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
}

	private int oddBeforeEven(int[] array) {
		int len=array.length;
		int p=0;
		int q=len-1;
		while(p<=q) {//分别从两端开始比较，如果p和q相遇，则数组扫描完毕
			if(array[p]%2!=0 &&array[q]%2==0) {
				p++;
				q--;
			}
			else if(array[p]%2!=0 &&array[q]%2!=0)
				p++;
			else if(array[p]%2==0 &&array[q]%2==0)
				q--;
			//if(array[p]%2==0 && array[q]%2!=0)
			else
				swap(array,p,q);
		}	
		for(int i=0;i<p;i++) {
			for(int j=i;j>0;j--) {
				if(array[j]<array[j-1])
					swap(array,j,j-1);
			}
		}
		for(int i=q+1;i<len;i++) {
			for(int j=i;j>q+1;j--) {
				if(array[j]<array[j-1])
					swap(array,j,j-1);
			}
		}
		return p;
	}

	private void swap(int[] array, int p, int q) {
		int temp=array[p];
		array[p]=array[q];
		array[q]=temp;
	}
}
