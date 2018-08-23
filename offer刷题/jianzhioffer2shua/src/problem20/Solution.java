package problem20;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题20：顺序打印一个矩阵
 * @author Administrator
 *
 */
public class Solution {
	static List<Integer> list= new ArrayList<Integer>();
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Solution s=new Solution();
		s.printMatrixClockwisely(matrix);
		for(Integer i:list) {
			System.out.println(i);
		}
	}


	public void  printMatrixClockwisely(int[][] matrix) {
		//ArrayList<Integer> list=new ArrayList<Integer>();
		if(matrix==null)
			return;
		int startX=0;//起始列
		//int startY=0;//起始行
		while(matrix[0].length>startX*2 &&matrix.length>startX*2) {
			printOneCircle(matrix,startX);
			startX++;
			//startY++;
		}
	}

	private void printOneCircle(int[][] matrix, int startX) {
		int endX=matrix[0].length-1-startX;//终止列
		int endY=matrix.length-1-startX;//终止行
		//从左到右打印第列
		for(int i=startX;i<=endX;i++) {
			int number=matrix[startX][i];
			list.add(number);
		}
		if(endY>startX) {
			//从上到下打印最后一列
			for(int j=startX+1;j<=endY;j++) {
				int number=matrix[j][endX];
				list.add(number);
			}
		}
		//从右到左打印列
		if(endY>startX && endX>startX) {
			for(int i=endX-1;i>=startX;i--) {
				int number=matrix[endY][i];
				list.add(number);
			}
		}
		//从下向上打印行
		if(endX>startX && endY>startX+1) {
			for(int j=endY-1;j>startX;j--) {
				int number=matrix[j][startX];
				list.add(number);
			}
		}
	}
}
