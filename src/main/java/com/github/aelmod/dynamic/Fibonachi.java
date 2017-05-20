package com.github.aelmod.dynamic;

public class Fibonachi {

    public static void main(String[] args) {
        System.out.println(calc(10));
    }

    public static int calc(int i) {
        if (i <= 1) return i;
        return calc(i - 1) + calc(i - 2);
    }
}
