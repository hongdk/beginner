package com.xclink.ch07.exc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
//�����дһ������ͳ�Ƴ�������һ���У�����13����������������ڡ�
//˵������1��һ����365�죬������366�죬��ν���꣬���ܱ�4�����Ҳ��ܱ�100��������ݣ����Ǽ��ܱ�100����Ҳ�ܱ�400��������ݣ�
//��2����֪1998��1��1���������ģ��û��������ݿ϶����ڻ����1998�ꡣ
//��������
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.xclink.ch06.FinalTest;
import com.xclink.ch06.Person;

/******************************************
 * �쳣�����������:
 *     ���������
 * @author Administrator
 * 
 * 1.����ʱ�쳣��
 *    �������������Լ����쳣
 *    ����ʱ�쳣:���˻���--���Ա��⡣��Ҫ����Ա���߼��Ͻ���
 * 2.catch�����и������⣨�쳣��
 *    ��С����
 * 3.��������׳����쳣���ڲ���ķ�Χ�ڣ�������Ȼ��ֹ���С��쳣δ������,��"������"
 *****************************************/


public class TestCalendar {
	
	public static void main(String[] args) {
			Calendar c1 =Calendar.getInstance();
			Scanner sc = new Scanner(System.in);
			
			//����ʱ�쳣��
			/*try {
				FileInputStream fs = new FileInputStream(new File("d:\\abc1.txt"));
				fs.read();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (IOException e){
				//
			}*/

			//����ʱ�쳣
			System.out.println("please put Year :For example ,1998");
			int year = 1998; //������
			
			//year = sc.nextInt(); //abc InputMismatchException
			
			try {
				//��Ϊ����ȫ�Ĵ���
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
				System.out.println("����InputMismatchException�쳣");
			} */
			catch (NullPointerException e) {
				//e.printStackTrace();
				System.out.println("����NullPointerException�쳣");
			}
			catch (StringIndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("����StringIndexOutOfBoundsException�쳣");
			}
			/*catch (Exception e) {
				//e.printStackTrace();
				System.out.println("����StringIndexOutOfBoundsException�쳣");
			}*/
			finally{
				//���մ���  �ͷſռ�
				System.out.println("����finally");
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
