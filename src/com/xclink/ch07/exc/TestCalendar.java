package com.xclink.ch07.exc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
//请你编写一个程序，统计出在在这一年中，既是13号又是星期五的日期。
//说明：（1）一年有365天，闰年有366天，所谓闰年，即能被4整除且不能被100整除的年份，或是既能被100整除也能被400整除的年份；
//（2）已知1998年1月1日是星期四，用户输入的年份肯定大于或等于1998年。
//样例输入
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.xclink.ch06.FinalTest;
import com.xclink.ch06.Person;

/******************************************
 * 异常如果不被捕获:
 *     程序会死掉
 * @author Administrator
 * 
 * 1.编译时异常；
 *    函数主动声明自己有异常
 *    运行时异常:“人祸”--可以避免。需要程序员的逻辑严谨。
 * 2.catch可以有各种例外（异常）
 *    从小到大
 * 3.如果代码抛出的异常不在捕获的范围内，程序依然终止运行。异常未被捕获,它"溜走了"
 *****************************************/


public class TestCalendar {
	
	public static void main(String[] args) {
			Calendar c1 =Calendar.getInstance();
			Scanner sc = new Scanner(System.in);
			
			//编译时异常：
			/*try {
				FileInputStream fs = new FileInputStream(new File("d:\\abc1.txt"));
				fs.read();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (IOException e){
				//
			}*/

			//运行时异常
			System.out.println("please put Year :For example ,1998");
			int year = 1998; //作用域
			
			//year = sc.nextInt(); //abc InputMismatchException
			
			try {
				//认为不安全的代码
				year = sc.nextInt();  //abc
				
				System.out.println("hello1");
				Person[] p = new Person[10];
				/***
				 *..............
				 */
				if(p[0]!=null)
					p[0].getAge();
				
			} 
			/*catch (InputMismatchException e) {
				//e.printStackTrace();
				System.out.println("输入InputMismatchException异常");
			} */
			catch (NullPointerException e) {
				//e.printStackTrace();
				System.out.println("输入NullPointerException异常");
			}
			catch (StringIndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("输入StringIndexOutOfBoundsException异常");
			}
			/*catch (Exception e) {
				//e.printStackTrace();
				System.out.println("输入StringIndexOutOfBoundsException异常");
			}*/
			finally{
				//最终处理  释放空间
				System.out.println("输入finally");
			}
			
			Integer.parseInt("1234a");
			
			System.out.println("hello2");
			int month = 0;
			for (int i = 0; i < 12; i++) {
				month = i;
				c1.set(year, month, 13);
				if(c1.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY) {
					System.out.println(c1.get(Calendar.YEAR)+"-"+(c1.get(Calendar.MONTH)+1)+"-"+c1.get(Calendar.DATE));
				}
			}
	}
}
