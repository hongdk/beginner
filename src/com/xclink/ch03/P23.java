package com.xclink.ch03;

public class P23 {
	
	public static void main(String[] args) {
		
		//������ά���������
		int[][] b = {{1,2},{3,4}}; //��̬��ʼ��
		int[][] a = new int[4][4]; //��̬��ʼ��
		int[][] c = new int[3][];  //��̬��ʼ��
		//int[][] d = new int[][3]; //����:
		
		//��ά���鸳ֵ
		a[0][0] = 1;
		a[1][1] = 4;
		a[2][2] = 9;
		a[3][3]= 16;
		
		//��ӡ
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}
}
