package com.company;

public class SortLinkedList {

    private SortNode head;
    private int size;

    public void addToFront(int data) {

        SortNode node = new SortNode(data);

        node.setNext(head);
        head = node;
        size++;

    }

    public void sort() {
        SortNode max;
        SortNode current;
        for (int i = 0; i < size; i++) {
            max = head;
            current = head;
            for(int j=0; j <= size-2-i; j++) {
                System.out.println(j+1+" ITERATION THIS IS");
                System.out.println("Before iteration MAX - "+ max.getData()+" CURRENT - "+current.getData());
                System.out.println();
                if(current.getNext() != null) {
                    current = current.getNext();
                    System.out.println(j+1+" Iteration: CURRENT - "+ current.getData());
                    System.out.println();
                }

                if (max.getData() < current.getData()) {
                    max = current;
                    System.out.println(j+1+" Iteration: MAX - "+ max.getData());
                }
            }
            System.out.println("\n\n");
            exchange(max, current);
            printList();
            System.out.println("\n\n");
        }
    }

    public void exchange(SortNode max, SortNode current) {

        int temp = max.getData();
        max.setData(current.getData());
        current.setData(temp);

    }

    public SortNode removeLessThanMax(int max){
        SortNode current = head;
        SortNode prev = head;
        int flag =0;
        while(current != null){
            System.out.println(current.getData());
            flag = 0;
            if(current == head && (current.getData() < max))
                head = head.getNext();

            else if(current.getData() < max){
                flag = 1;
                prev.setNext(current.getNext());
            }

            if(flag == 0){
                prev = current;
            }
            current = current.getNext();
        }
        return head;
    }

    public void printList(){
        SortNode current = head;
        System.out.print("HEAD -> ");
        while(current!=null){
            System.out.print(current +" -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
