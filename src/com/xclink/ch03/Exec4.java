package com.xclink.ch03;

/***
 * ���������µ�һ�����飺
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
	Ҫ������������ֵΪ0����ȥ��������Ϊ0��ֵ����һ���µ����飬���ɵ�������Ϊ��
		int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5} ;
	
	//
	int[] a = {};
	System.out.print(a[0]); //a���鲢δ���ٿռ�
	
 * @author Administrator
 *
 */
public class Exec4 {
	
	public static void main(String[] args) {
		
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		
		int cnt = 0;
		for(int i=0;i<oldArr.length;i++){
			if(oldArr[i]!=0)
				cnt++;
		}
		int newArr[] = new int[cnt];
		
		
		for(int i=0,j=0;i<oldArr.length;i++){
			
			if(oldArr[i]!=0){
				
				newArr[j++] = oldArr[i];
		
			}
			
		}
		
		for(int i=0;i<newArr.length;i++){
			System.out.print(newArr[i]+"\t");
		}
		
	}
	

	
}
