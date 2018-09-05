package com.company;


public class EmployeeLinkedList{

    private EmployeeNode head;
    private int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFromFront(){
        if(this.isEmpty()){
            return null;
        }
        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public void append(Employee employee){
        EmployeeNode node= new EmployeeNode(employee);
        if(head == null){
            head = node;
            size++;
            return;
        }
        EmployeeNode current = head;
        while(current.getNext() !=null){
            current = current.getNext();
        }
        current.setNext(node);
        size++;
        return;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }



}
