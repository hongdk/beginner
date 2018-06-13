package com.xclink.ch08;

public class TestException {
	
	public static void main(String[] args) {
        try {
            int n = Integer.parseInt("AAA");
            System.out.println("n = " + n);
        } catch (NumberFormatException e) {
           try {
        	   int a = 100/0;
			} catch (Exception e2) {
				e2.printStackTrace();
			}
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获第二个异常：" + e);
        } catch (Exception e) {
            System.out.println("捕获其他可能的所有异常：" + e);
        }finally{
        	System.out.println("final");
        }
        System.out.println("Hello World! -- end");
    }

}
