package com.github.aelmod.dynamic.medium;

public class App {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 10, 23, 1, 2, 3, 54, 23, 123, 34, 123, 0, -4, 324, 1, 32, 23};
        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.println(arrayUtil.getIndexOfMaxValueOfArray(arr));
    }


}
