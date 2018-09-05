package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employee siddhant = new Employee("Siddhant", "Pathak", 37);
        Employee shiv = new Employee("Shiv", "Anand", 35);
        Employee sagar = new Employee("Sagar", "Aggarwal", 32);
        Employee sarthak = new Employee("Sarthak", "Mittal", 408);
        Employee harshit = new Employee("Harshit", "Jain", 408);

        LinkedList<Employee> list  = new LinkedList<>();

        list.addFirst(siddhant);
        list.addFirst(shiv);
        list.addFirst(sagar);
        list.addFirst(sarthak);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");

        while(iter.hasNext()){
            System.out.print(iter.next()+ " <=> ");
        }

        System.out.println("NULL");

        list.add(harshit);
        iter = list.iterator();
        System.out.print("HEAD -> ");

        while(iter.hasNext()){
            System.out.print(iter.next()+ " <=> ");
        }

    }
}
