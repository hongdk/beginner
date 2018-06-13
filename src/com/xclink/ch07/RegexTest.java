package com.xclink.ch07;


/***
 * 字符集合 []
 * 		[abc]:表示该字符只能是a或者b或者c
 * 		\d：表示任意一个数字 [0-9]
 * 
 *       "+"：表示内容可以连续出现至少1次以上
		 "*"：表示内容出现0-若干次
	     "?"：表示内容出现0-1次
		
		{n}、{n,}{n,m}
			133[0-9]{8}
 * 		
 * 		开始添加"^"以及末尾添加"$"
 * 		/** 
	     * 大陆手机号码11位数，匹配格式：前三位固定格式+后8位任意数 
	     * 此方法中前三位格式有： 
	     * 13+任意数 
	     * 15+除4的任意数 
	     * 18+除1和4的任意数 
	     * 17+除9的任意数 
	     * 147 
	     * ^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$
     
 * @author Administrator
 *
 */
public class RegexTest {
	
	public static void main(String[] args) {
		
		String emailRegEx ="^[a-zA-Z0-9_.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,4}$"; 
		String email1 = "bjliyi@tarena.com.cn";
		
		String emailRegEx1 ="[0-9]"; 
		
		
		String emailRegEx2 ="[张三丰]+";  //[字符范围]  +表示内容可以连续出现至少1次以上
		String email2 = "张三丰张张三张丰三";
		System.out.println(email2.matches(emailRegEx2));
		
		String email3 = "13393702988";
		String emailRegEx3 ="133[0-9]{8}"; 
		
		String dig = "\\d{5,11}";//"[0,9]{5,11}"
		System.out.println(email3.matches(emailRegEx3));
		
		String email4 = "abcfg@gggdddwe111rftyyacaaabaccc";
		String emailRegEx4 ="[a-z0-9]+"; 
		System.out.println(email4.matches(emailRegEx4));
		
		String email5 ="19456898911";
		String phoneExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";  
		System.out.println(email5.matches(phoneExp));

	}
	
	
	 
    public static void isChinaPhoneLegal(String str)  {  
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";  
        
    }  
  
}
