package problem20;

import java.util.ArrayList;
import java.util.List;

/**
 * ������20��˳���ӡһ������
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
		int startX=0;//��ʼ��
		//int startY=0;//��ʼ��
		while(matrix[0].length>startX*2 &&matrix.length>startX*2) {
			printOneCircle(matrix,startX);
			startX++;
			//startY++;
		}
	}

	private void printOneCircle(int[][] matrix, int startX) {
		int endX=matrix[0].length-1-startX;//��ֹ��
		int endY=matrix.length-1-startX;//��ֹ��
		//�����Ҵ�ӡ����
		for(int i=startX;i<=endX;i++) {
			int number=matrix[startX][i];
			list.add(number);
		}
		if(endY>startX) {
			//���ϵ��´�ӡ���һ��
			for(int j=startX+1;j<=endY;j++) {
				int number=matrix[j][endX];
				list.add(number);
			}
		}
		//���ҵ����ӡ��
		if(endY>startX && endX>startX) {
			for(int i=endX-1;i>=startX;i--) {
				int number=matrix[endY][i];
				list.add(number);
			}
		}
		//�������ϴ�ӡ��
		if(endX>startX && endY>startX+1) {
			for(int j=endY-1;j>startX;j--) {
				int number=matrix[j][startX];
				list.add(number);
			}
		}
	}
}
