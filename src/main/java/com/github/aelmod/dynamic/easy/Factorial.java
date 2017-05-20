package com.github.aelmod.dynamic.easy;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(fac(5));
    }

//    public static int fac(int n) {
//        int counter = n;
//
//        int res = 1;
//
//        while (counter != 1) {
//            if (counter == n) {
//                int prev = counter;
//                int i = prev * --counter;
//                res *= i;
//            } else {
//                res *= --counter;
//            }
//
//        }
//        return res;
//    }

    public static int fac(int n) {
        int counter = n;
        int res = n;
        while (counter != 1) {
            res *= --counter;
        }
        return res;
    }
}
