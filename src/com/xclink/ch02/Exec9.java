package com.xclink.ch02;

public class Exec9 {
	
	/** 
     * @Title:main 
     * @Description:兔子问题 
     * @param:@param args 
     * @return: void 
     * @throws 
     */  
    public static void main(String[] args)   
    {  
        /** 
         * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子， 
         *          小兔子长到第三个月后每个月又生一对兔子，假如兔子 
         *          都不死，问每个月的兔子总数为多少？  
         */  
          
         //兔子1  
         int oneRabbit = 1;  
         //兔子2  
         int twoRabbit = 1;  
         //兔子总数  
         int rabbit;  
         //月份  
         int month = 120;  
         for(int i=3; i<=month; i++)   
         {  
              rabbit = twoRabbit;  
              twoRabbit = oneRabbit + twoRabbit;  
              oneRabbit = rabbit;  
              System.out.println("第" + i +"个月的兔子对数: "+twoRabbit);  
         }  
    }  
  
}  

