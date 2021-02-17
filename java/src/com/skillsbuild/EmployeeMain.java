package com.skillsbuild;

import java.util.Arrays;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        Employee obj1 = new Employee(1, "alex", 34, 50000);
        Employee obj2 = new Employee(2, "cody", 33, 40000);
        Employee obj3 = new Employee(3, "alan", 39, 30000);
        employees[0] = obj1;
        employees[1] = obj2;
        employees[2] = obj3;

        System.out.println(employees[1].compareTo(obj1));

        Arrays.sort(employees,Employee.SalaryComparator);
        System.out.println("employee list sorted by salary:\n" +
                Arrays.toString(employees));
        Arrays.sort(employees,Employee.AgeComparator);
        System.out.println("employee list sorted by age:\n" +
                Arrays.toString(employees));
    }
}
