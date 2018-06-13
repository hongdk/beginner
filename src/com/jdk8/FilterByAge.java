package com.jdk8;

/**
 * 提供FilterData接口的实现类，实现按照年龄过滤数据
 *
 */
public class FilterByAge implements FilterData<Employee> {
    @Override
    public boolean filter(Employee employee) {

        return employee.getAge() > 30;

    }
}
