package com.company;

public class Main {

    public static void main(String[] args) {

        Employee siddhant = new Employee("Siddhant", "Pathak", 37);
        Employee shiv = new Employee("Shiv", "Anand", 35);
        Employee sagar = new Employee("Sagar", "Aggarwal", 32);
        Employee sarthak = new Employee("Sarthak", "Mittal", 408);
        Employee harshit = new Employee("Harshit", "Jain", 408);
        Employee divyansh = new Employee("Divyansh", "Jain", 12);

        ChainedHashtable hashtable = new ChainedHashtable();
        hashtable.put("Pathak", siddhant);
        hashtable.put("Anand", shiv);
        hashtable.put("Mittal", sarthak);
        hashtable.put("Jain", harshit);
        hashtable.put("Jain", divyansh);
        hashtable.printHashtable();
        System.out.println(hashtable.get("Mittal"));

        hashtable.remove("Pathak");
        hashtable.remove("Jain");
        System.out.println("After removing....");
        hashtable.printHashtable();
        
    }
}
