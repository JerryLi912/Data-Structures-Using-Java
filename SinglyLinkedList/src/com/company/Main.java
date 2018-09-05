package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Employee siddhant = new Employee("Siddhant", "Pathak", 37);
        Employee shiv = new Employee("Shiv", "Anand", 35);
        Employee sagar = new Employee("Sagar", "Aggarwal", 32);
        Employee sarthak = new Employee("Sarthak", "Mittal", 408);
        Employee harshit = new Employee("Harshit", "Jain", 408);


        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        System.out.println(employeeLinkedList.isEmpty());

        employeeLinkedList.addToFront(siddhant);
        employeeLinkedList.addToFront(shiv);
        employeeLinkedList.addToFront(sagar);
        employeeLinkedList.addToFront(sarthak);

        employeeLinkedList.printList();

        employeeLinkedList.removeFromFront();

        employeeLinkedList.printList();

        employeeLinkedList.append(harshit);

        employeeLinkedList.printList();
    }
}
