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

        ArrayStack stack = new ArrayStack(10);

        stack.push(siddhant);
        stack.push(shiv);
        stack.push(sagar);
        stack.push(harshit);
        stack.push(sarthak);
        stack.push(divyansh);

        stack.printStack();

        stack.pop();
        System.out.println("This Employee will be deleted - "+stack.pop());

        stack.printStack();

        System.out.println(stack.peek());
    }
}
