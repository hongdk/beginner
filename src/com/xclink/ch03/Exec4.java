package com.xclink.ch03;

/***
 * 现在有如下的一个数组：
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
	要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：
		int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5} ;
	
	//
	int[] a = {};
	System.out.print(a[0]); //a数组并未开辟空间
	
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
