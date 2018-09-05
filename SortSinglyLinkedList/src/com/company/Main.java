package com.company;

public class Main {

    public static void main(String[] args) {

        SortLinkedList list = new SortLinkedList();
        list.addToFront(4);
        list.addToFront(1);
        list.addToFront(2);
        list.addToFront(5);
        list.addToFront(8);
        list.addToFront(20);


        list.removeLessThanMax(8);
        list.printList();
    }
}
