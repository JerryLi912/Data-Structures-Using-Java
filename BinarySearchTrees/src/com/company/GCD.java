package com.company;

public class GCD {

    public static int gcd(int a, int b){
        int bigger = a > b ? a : b;
        int smaller = a < b ? a : b;

        while((bigger % smaller) > 0){

            int temp = smaller;
            smaller = bigger % smaller;
            bigger = temp;

        }
        return smaller;
    }

    public static void main(String[] args){
        int a = 117;
        int b = 1170;
        System.out.println(gcd(a, b));
    }
}
