package com.xclink.ch03;

public class P30 {
	
	public static void main(String[] args) {
		//����һ����Ϊ���飨��һάΪ��:10��
		int[][] a = new int[10][];
		for(int i =0;i<10;i++){
			//��ʼ���ڶ�ά i+1;
			a[i] = new int[i+1]; //������ʱ��ά����Ĵ�Сn,����ʱ�±�Ϊ��0,n-1��
		}
		
		for(int i=0;i<10;i++){
			a[i][0] = 1; //��һ��
			a[i][i] = 1; //���һ�� 
			//ÿ����i+1��
			for(int j=1;j<i;j++){
				a[i][j] = a[i-1][j-1]+a[i-1][j];
			}
		}
		
		for(int i=0;i<10;i++){
			for(int j=0;j<=i;j++){
				//ÿ����i+1��
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
