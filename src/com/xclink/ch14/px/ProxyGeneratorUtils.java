package com.xclink.ch14.px;

import java.io.FileOutputStream;  
import java.io.IOException;  
  
import sun.misc.ProxyGenerator;

public class ProxyGeneratorUtils {  
	 
	
	public static void main(String[] args) {
		writeProxyClassToHardDisk("c:/temp/Dog.class");
	}
    /** 
     * �Ѵ�������ֽ���д��Ӳ���� 
     * @param path ����·�� 
     */  
    public static void writeProxyClassToHardDisk(String path) {  
        // ��һ�ַ��������ַ�ʽ�ڸղŷ���ProxyGeneratorʱ�Ѿ�֪����  
        // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", true);  
          
        // �ڶ��ַ���  
          
        // ��ȡ��������ֽ���  
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy11", Dog.class.getInterfaces());  
          
        FileOutputStream out = null;  
          
        try {  
            out = new FileOutputStream(path);  
            out.write(classFile);  
            out.flush();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                out.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}  