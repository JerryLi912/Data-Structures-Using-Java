package com.company;

public class Main {

    public static void main(String[] args) {
        Employee siddhant = new Employee("Siddhant", "Pathak", 37);
        Employee shiv = new Employee("Shiv", "Anand", 35);
        Employee sagar = new Employee("Sagar", "Aggarwal", 32);
        Employee sarthak = new Employee("Sarthak", "Mittal", 408);
        Employee harshit = new Employee("Harshit", "Jain", 408);
        Employee divyansh = new Employee("Divyansh","Jain",12);
        Employee rishabh = new Employee("Rishabh","Aggarwal",34);

        EmployeeDoublyLinkedList obj = new EmployeeDoublyLinkedList();

        obj.addToFront(siddhant);
        obj.addToFront(shiv);
        obj.addToFront(sagar);
        obj.addToFront(sarthak);
        obj.addToEnd(harshit);
        obj.printList();
        System.out.println(obj.getSize());

        obj.removeFromFront();
        obj.printList();
        System.out.println(obj.getSize());

        obj.removeFromEnd();
        obj.printList();
        System.out.println(obj.getSize());

//        obj.addBefore(divyansh, shiv);
//        obj.printList();
//        System.out.println(obj.getSize());

//        obj.addBefore(divyansh, sagar);
//        obj.printList();
//        System.out.println(obj.getSize());

        obj.addBefore(divyansh, rishabh);
        obj.printList();
        System.out.println(obj.getSize());
    }
}
