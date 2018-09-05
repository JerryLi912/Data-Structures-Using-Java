package com.company;

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int value){
        if(isFull())
            throw new IndexOutOfBoundsException("Heap is full");

        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }

//    public int delete(int index){
//        if(isEmpty())
//            throw new IndexOutOfBoundsException("Heap is Empty");
//
//    }

    private void fixHeapAbove(int index){
        int newValue = heap[index];
        while(index > 0 && newValue > heap[getParent(index)]){
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;

    }

//    private void fixHeapBelow(int index) {
//        int value = heap[index];
//        while (index <= size && heap[getChild(index, true)] < heap[index] && heap[getChild(index, false)] < heap[index]) {
//            heap[index] = heap[getChild(index, (2 * index + 1) > (2 * index + 2))] ;
//            index = getChild(index, (2 * index + 1) > (2 * index + 2));
//        }
//        heap[index] = value;
//    }

    public int peek(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("Heap is empty");
        return heap[0];
    }

    public int getParent(int index){
        return (index - 1)/2;
    }

    public boolean isFull(){
        return size == heap.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getChild(int index, boolean left){
        return 2 * index + (left ? 1 : 2);
    }
}
