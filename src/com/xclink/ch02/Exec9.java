package com.xclink.ch02;

public class Exec9 {
	
	/** 
     * @Title:main 
     * @Description:�������� 
     * @param:@param args 
     * @return: void 
     * @throws 
     */  
    public static void main(String[] args)   
    {  
        /** 
         * �ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ� 
         *          С���ӳ����������º�ÿ��������һ�����ӣ��������� 
         *          ����������ÿ���µ���������Ϊ���٣�  
         */  
          
         //����1  
         int oneRabbit = 1;  
         //����2  
         int twoRabbit = 1;  
         //��������  
         int rabbit;  
         //�·�  
         int month = 120;  
         for(int i=3; i<=month; i++)   
         {  
              rabbit = twoRabbit;  
              twoRabbit = oneRabbit + twoRabbit;  
              oneRabbit = rabbit;  
              System.out.println("��" + i +"���µ����Ӷ���: "+twoRabbit);  
         }  
    }  
  
}  

