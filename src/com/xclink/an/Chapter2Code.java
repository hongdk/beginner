package com.xclink.an;

import java.lang.annotation.Annotation;  
import java.lang.annotation.ElementType;  
import java.lang.annotation.Repeatable;  
import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;  
import java.lang.annotation.Target;  
import java.util.Arrays;  
  
  
/** 
 * java8 ������@Repeatableע�⣬��ʵֻ���﷨�Ƕ��ѣ� 
 * java8 ע��� {@link RepeatAnn} ���� {@link Annotations}�ǵȼ۵ģ� 
 * ��ע�⽲�﷨��ת��Ϊע��ֵΪ������ʽ�� 
 * @author doctor 
 * 
 * @since 2015��2��3�� ����8:33:43 
 */  
public class Chapter2Code {  
  
    public static void main(String[] args) {  
        Annotation[] annotations = RepeatAnn.class.getAnnotations();  
        System.out.println(annotations.length); //1  
        Arrays.stream(annotations).forEach(System.out::println);//@com.github.jdk8.ebook.java8_recipes2nd_edition.Chapter2Code$Roles(value=[@com.github.jdk8.ebook.java8_recipes2nd_edition.Chapter2Code$Role(name=doctor), @com.github.jdk8.ebook.java8_recipes2nd_edition.Chapter2Code$Role(name=who)])  
  
        Annotation[] annotations2 = Annotations.class.getAnnotations();  
        System.out.println(annotations2.length);//1  
        Arrays.stream(annotations2).forEach(System.out::println);//@com.github.jdk8.ebook.java8_recipes2nd_edition.Chapter2Code$Roles(value=[@com.github.jdk8.ebook.java8_recipes2nd_edition.Chapter2Code$Role(name=doctor), @com.github.jdk8.ebook.java8_recipes2nd_edition.Chapter2Code$Role(name=who)])  
          
    }  
  
  
    @Repeatable(value = Roles.class)  
    public static @interface Role {  
        String name() default "doctor";  
    }  
  
    @Target(ElementType.TYPE)  
    @Retention(RetentionPolicy.RUNTIME)  
    public static @interface Roles {  
        Role[] value();  
    }  
      
    @Role(name = "doctor")  
    @Role(name = "who")  
    public static class RepeatAnn{  
          
    }  
      
    @Roles({@Role(name="doctor"),  
            @Role(name="who")})  
    public static class Annotations{  
          
    }  
    
    
   
}  
