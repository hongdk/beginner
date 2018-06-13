package com.xclink.ch07;

/***
 * Integer 
 * @author Administrator
 *
 */
public class AutoBoxTest {

	public static void main(String[] args) {
		test1();
	}
	
	
	public static void test1(){
		
		Integer it1 = 1;
		Integer it2 = 1;
		
		
		if(it1==it2){
			System.out.println("=======");//1 Integer.valeuOf()  缓存
		}else{
			System.out.println("!!!!!===");//new Integer(1)
		}
		
		/*if(it1.equals(it2)){
			System.out.println("=======");
		}else{
			System.out.println("!!!!====");
		}*/
		
	}
	
	
	public static void test2(){
		// TODO Auto-generated method stub
		
				//String Integer  Doulbe Float
				//123<->"123"
				//123.4<->"123.4"
				
				//禁止转换  10->A->12->00001010
				
				//Integer
				//方法:
					  //toBinaryString  toHexString  toOctalString
					  //parseInt
				      //compareTo
				      //floatValue()  doubleValue()  
		  			  //equals(Object obj)
				
				System.out.println(Integer.toBinaryString(10));
				System.out.println(Integer.toHexString(10));
				System.out.println(Integer.toOctalString(10));
				
				System.out.println(Integer.parseInt("1010",2));
				System.out.println(Integer.parseInt("A",16));
				System.out.println(Integer.parseInt("a",16));
				System.out.println(Integer.parseInt("10",8));
				System.out.println(Integer.parseInt("111",7));
				
				System.out.println(Character.MAX_RADIX);
				
				Integer it1 = new Integer(1000); //自动装箱（基础类型数据->对象）
				Integer it2 = new Integer(1000);
				Integer it3 = new Integer(20000);
				
				Integer.valueOf(100);
				
				//(x < y) ? -1 : ((x == y) ? 0 : 1)
				System.out.println(it1.compareTo(it2));
				System.out.println(it2.compareTo(it3));
				
				//(float)value
				float f1 = it1.floatValue();
				System.out.println(f1);
				double d1 = it1.doubleValue();
				System.out.println(d1);
				
				/**
				 *  if (obj instanceof Integer) {
		            	return value == ((Integer)obj).intValue();
		        	}
				 */
				
				
				
				//Double
				System.out.println(Double.toHexString(1222.5));
				
				Double dd1 = new Double("1.45");
				Double dd2 = new Double("1.55");
				System.out.println(dd1.compareTo(dd2));
				double d = dd1.doubleValue();  //拆箱
	}

}
