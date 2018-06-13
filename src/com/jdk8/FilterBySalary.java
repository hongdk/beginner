package com.jdk8;

/**
 *
 * 提供FilterData接口的实现类，实现按照工资过滤数据
 *
 */
public class FilterBySalary implements FilterData<Employee> {
    @Override
    public boolean filter(Employee employee) {
        return employee.getSalary() > 5000;
    }
}
