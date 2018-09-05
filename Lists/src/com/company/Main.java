
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Siddhant", "Pathak", 37));
        employeeList.add(new Employee("Sarthak", "Mittal", 408));
        employeeList.add(new Employee("Pulkit", "Ahuja", 405));
        employeeList.add(new Employee("Divyansh", "Jain", 12));

        employeeList.forEach(employee-> System.out.println(employee));

        System.out.println(employeeList.get(1));

        employeeList.set(1, new Employee("Shiv", "Anand", 35));
        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("Sagar", "Aggarwal", 32));
        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee:employeeArray)
            System.out.println(employee);

        System.out.println(employeeList.contains(new Employee("Siddhant","Pathak",37)));
        System.out.println(employeeList.indexOf(new Employee("Siddhant","Pathak", 37)));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
