package com.company;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if(top == stack.length){
            System.out.println("Stack overflow");
            return;
        }
        else{
            stack[++top] = employee;
        }
    }

    public Employee pop(){
        Employee e;
        if(top < 0){
            System.out.println("Stack underflow");
            return null;
        }
        else
            e = stack[top--];
        return e;
    }
}
