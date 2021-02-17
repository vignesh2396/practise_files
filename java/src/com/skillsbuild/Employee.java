package com.skillsbuild;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

    private int employeeId;
    private String employeeName;
    private final int age;
    private final long salary;

    public Employee(int employeeId,String employeeName,int age,long salary){
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee emp) {
        return (this.employeeId - emp.employeeId);
    }

    @Override
    public String toString() {
        return "[id = " + this.employeeId +
                ", name = " + this.employeeName +
                ", age = " + this.age +
                ", salary = " + this.salary + "]";
    }

    public static Comparator<Employee> SalaryComparator = (e1, e2) -> (int) (e1.getSalary() - e2.getSalary());
    public static Comparator<Employee> AgeComparator = Comparator.comparingInt(Employee::getAge);
}

