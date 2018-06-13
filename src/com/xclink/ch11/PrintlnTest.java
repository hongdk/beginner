package com.xclink.ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintlnTest {
	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			ps = new PrintStream(new File("E:\\FileTest\\print.txt"));
			System.setOut(ps);
			System.out.println("hello");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ps.close();
		}
	}
}
