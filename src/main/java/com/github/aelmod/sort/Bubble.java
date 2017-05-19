package com.github.aelmod.sort;

public class Bubble {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 10, 23, 1, 2, 3, 54, 23, 123, 34, 123, 0, -4, 324, 1, 32, 23};

        int iterationCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isChanged = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                iterationCount++;
                if (arr[j] > arr[j + 1]) {
                    isChanged = true;
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
            if (!isChanged) break;
        }

        System.out.println("iteration count: " + iterationCount);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
