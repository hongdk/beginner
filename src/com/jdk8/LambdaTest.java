package com.jdk8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

import org.junit.Test;

/**
 */
public class LambdaTest {
    private List<Employee> data = EmployeeData.getEmployees();

    //举例三：由一个具体的问题，展开对Lambda表达式和 Stream api的使用的理解

    //解决层次六：使用Stream API
    public void test11(){
        //查询员工中年龄大于30岁的员工的信息
        data.stream().filter(e -> e.getAge() > 30).forEach(System.out::println);

        System.out.println();

        //查询员工中工资大于5000的员工的信息
        data.stream().filter(e -> e.getSalary() > 5000).forEach(System.out::println);
    }

    //解决层次五：使用Lambda表达式的进一步优化
    @Test
    public void test10(){
        //查询员工中年龄大于30岁的员工的信息
        List<Employee> list = filterData(data, e -> e.getAge()>10);
        list.forEach(System.out::println);

        System.out.println("*****************");

        //查询员工中工资大于5000的员工的信息
        List<Employee> list1 = filterData(data,e -> e.getSalary() > 5000);
        list1.forEach(System.out::println);
    }

    //解决层次四：使用Lambda表达式
    @Test
    public void test9(){
        //查询员工中年龄大于30岁的员工的信息
        List<Employee> list = filterData(data, e -> e.getAge() > 30);
        for (Employee emp : list) {
            System.out.println(emp);
        }

        System.out.println("*****************");

        //查询员工中工资大于5000的员工的信息
        List<Employee> list1 = filterData(data,e -> e.getSalary() > 5000);
        for (Employee emp : list1) {
            System.out.println(emp);
        }

    }

    //解决层次三：使用FilterData接口的匿名实现类
    @Test
    public void test8(){
        //查询员工中年龄大于30岁的员工的信息
        List<Employee> list = filterData(data, new FilterData<Employee>() {
            @Override
            public boolean filter(Employee employee) {
                return employee.getAge() > 30;
            }
        });
        for (Employee emp : list) {
            System.out.println(emp);
        }

        System.out.println("*****************");

        //查询员工中工资大于5000的员工的信息
        List<Employee> list1 = filterData(data, new FilterData<Employee>() {
            @Override
            public boolean filter(Employee employee) {
                return employee.getSalary() > 5000;
            }
        });
        
        
        for (Employee emp : list1) {
            System.out.println(emp);
        }

    }


    //解决层次二：策略的设计模式
    @Test
    public void test7(){
        //查询员工中年龄大于30岁的员工的信息
        List<Employee> list = filterData(data, new FilterByAge());
        for (Employee emp : list) {
            System.out.println(emp);
        }

        System.out.println("*****************");

        //查询员工中工资大于5000的员工的信息
        List<Employee> list1 = filterData(data, new FilterBySalary());
        for (Employee emp : list1) {
            System.out.println(emp);
        }

    }

    public List<Employee> filterData(List<Employee> list,FilterData<Employee> filter){

        ArrayList<Employee> data = new ArrayList<>();
        for (Employee emp : list) {
            if(filter.filter(emp)){
                data.add(emp);
            }
        }
        return data;

    }



    //解决层次一：
    @Test
    public void test6(){
        List<Employee> list = filterEmployeesBySalary(data);
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }

    //问题二：查询员工中工资大于5000的员工的信息
    public List<Employee> filterEmployeesBySalary(List<Employee> list){
        ArrayList<Employee> data = new ArrayList<>();
        for (Employee emp : list) {
            if(emp.getSalary() > 5000){
                data.add(emp);
            }
        }
        return data;

    }

    @Test
    public void test5(){
        List<Employee> list = filterEmployeesByAge(data);
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    //问题一：查询员工中年龄大于30岁的员工的信息
    public List<Employee> filterEmployeesByAge(List<Employee> list){

        ArrayList<Employee> data = new ArrayList<>();

        for (Employee emp : list) {
            if(emp.getAge() > 30){
                data.add(emp);
            }
        }

        return data;

    }

    //***************************************************************************

    //举例二：Thread中的Runnable的使用
    //使用Lambda之后
    @Test
    public void test4(){
    	int num =100;
        Runnable r = () -> {
            for (int i = 0; i <= 100; i++) {
                System.out.println(i+num);
            }
        };


        Thread t = new Thread(r);
        t.start();
    }
    
    public void test41(){
    	Consumer<String> com =(x)->System.out.println(x);
    	
    	com.accept("测试");
      
    }

    //使用Lambda之前
    @Test
    public void test3(){
    	
    	int num = 100;
        //提供实现接口的匿名实现类的对象
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                	//num++;
                    System.out.println(i+num);
                }
            }
        };


        Thread t = new Thread(r);
        t.start();
    }


    //***************************************************************************

    //举例一：TreeSet中使用Comparator的使用
    //使用Lambda之后
    @Test
    public void test2(){

        Comparator<String> com = (o1,o2) -> o1.compareTo(o2);

        TreeSet<String> set = new TreeSet<String>(com);

        set.add("HH");
        set.add("MM");
        set.add("GG");
        set.add("JJ");
        set.add("DD");

        for (String s : set) {
            System.out.println(s);
        }
    }
    //使用Lambda之前
    public void test1(){
//        System.out.println("hello");

        //提供匿名实现类的对象
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        TreeSet<String> set = new TreeSet<String>(com);

        set.add("HH");
        set.add("MM");
        set.add("GG");
        set.add("JJ");
        set.add("DD");

        for (String s : set) {
            System.out.println(s);
        }



    }


}
