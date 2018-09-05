package com.company;

public class SortNode {

    private int data;
    private SortNode next;

    public SortNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SortNode getNext() {
        return next;
    }

    public void setNext(SortNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SortNode{" +
                "data=" + data +
                '}';
    }
}