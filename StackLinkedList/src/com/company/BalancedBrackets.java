package com.company;

import java.util.LinkedList;

public class BalancedBrackets {
    public static void main(String[] args) {
        String s = "{(([])[])[]]}";

        char a[] = s.toCharArray();

        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            if (list.isEmpty()) {
                list.push(a[i]);
                continue;
            } else if (a[i] == '(') {
                list.push(a[i]);
                continue;
            } else if (a[i] == '[') {
                list.push(a[i]);
                continue;
            } else if (a[i] == '{') {
                list.push(a[i]);
                continue;
            }
            if (a[i] == ')') {
                if (list.peek() == '(') {
                    list.pop();
                }else
                    list.push(a[i]);
                continue;
            }

            if (a[i] == ']') {
                if (list.peek() == '[') {
                    list.pop();
                }else
                    list.push(a[i]);

                continue;
            }
            if (a[i] == '}') {
                if (list.peek() == '{') {
                    list.pop();
                }else
                    list.push(a[i]);
                continue;
            }

        }
        if (list.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
