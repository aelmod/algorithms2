package com.github.aelmod.dynamic.medium;

public class ArrayUtil {

    public int getMaxValueOfArray(int[] arr) {
        int currentMax = arr[0];

        for (int i : arr) {
            if (currentMax < i) currentMax = i;
        }
        return currentMax;
    }

    public int getIndexOfMaxValueOfArray(int[] arr) {
        int currentMaxIndex = 0;
        int currentMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
                currentMaxIndex = i;
            }
        }

        return currentMaxIndex;
    }
}
