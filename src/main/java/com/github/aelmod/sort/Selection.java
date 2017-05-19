package com.github.aelmod.sort;

public class Selection {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 10, 23, 1, 2, 3, 54, 23, 123, 34, 123, 0, -4, 324, 1, 32, 23};

        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[maxIndex]) maxIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
