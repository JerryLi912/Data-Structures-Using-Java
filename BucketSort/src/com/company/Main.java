package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int a[] = {54, 46, 83, 66, 95, 92, 43};
        bucketSort(a);
        for (int i : a)
            System.out.print(i + "  ");

    }

    public static void bucketSort(int input[]) {

        List<Integer> buckets[] = new List[10];

        for (int i = 0; i < buckets.length; i++) {
//            using linked list for the buckets
//            buckets[i] = new LinkedList<Integer>();

//            using arraylist for the buckets
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket : buckets)
            Collections.sort(bucket);

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int bucket : buckets[i]) {
                input[j++] = bucket;
            }
        }
    }

    private static int hash(int value) {
        return value / (int) 10;
    }
}
