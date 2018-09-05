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

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(siddhant);
        queue.add(shiv);
        queue.add(sagar);
        queue.add(sarthak);
        queue.add(harshit);
        queue.add(divyansh);
        queue.add(rishabh);

        queue.printQueue();

        queue.remove();
        queue.remove();

        queue.printQueue();

        System.out.println(queue.peek());

    }
}
