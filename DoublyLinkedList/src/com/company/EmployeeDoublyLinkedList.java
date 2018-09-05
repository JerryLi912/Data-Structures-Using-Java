package com.company;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null)
            tail = node;
        else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null)
            head = node;
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public void addBefore(Employee newEmployee, Employee existingEmployee){

        EmployeeNode newNode = new EmployeeNode(newEmployee);
        EmployeeNode current = head;

        while(current != null && current.getEmployee() != existingEmployee){
            current = current.getNext();
        }

        if(current == null) {
            System.out.println("Existing Employee not found");
            return;
        }

        else if(current.getPrevious() == null){
            current.setPrevious(newNode);
            newNode.setNext(current);
            head = newNode;
            size++;
        }

        else{
            EmployeeNode temp = current.getPrevious();
            current.getPrevious().setNext(newNode);
            current.setPrevious(newNode);
            newNode.setNext(current);
            newNode.setPrevious(temp);
            size++;
        }

    }

    public EmployeeNode removeFromFront(){
        if(isEmpty())
            return null;

        EmployeeNode removeNode = head;

        if(head.getNext() == null)
            tail = null;
        else
            head.getNext().setPrevious(null);

        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty())
            return null;
        EmployeeNode removeNode = tail;

        if(tail.getPrevious() == null)
            head = null;
        else
            tail.getPrevious().setNext(null);

        tail = tail.getPrevious();
        size--;
        removeNode.setPrevious(null);
        return removeNode;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getEmployee() + " <=> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }
}
