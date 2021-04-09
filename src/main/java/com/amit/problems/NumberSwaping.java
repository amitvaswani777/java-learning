package com.amit.problems;

public class NumberSwaping {

    public String swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return String.valueOf(a) + String.valueOf(b);
    }

    public String swapWithoutTemp(int a, int b) {
        a = a + b; //a contains both
        b = a - b; //b now contains a
        a = a - b; //a now contains b

        return String.valueOf(a) + String.valueOf(b);
    }
}
