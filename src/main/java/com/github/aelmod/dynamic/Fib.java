package com.github.aelmod.dynamic;

public class Fib {

    public static int calc(int n) {
        int curr = 1;

        int prev = 0;

        int counter = 0;

        while (counter++ < n - 1) {
            int tmp = curr;
            curr += prev;
            prev = tmp;
        }
        return curr;
    }

    public static void main(String args[]) {
        System.out.println(calc(10));
    }
}

