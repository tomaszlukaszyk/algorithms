package com.codecool.algorithms;

public class BubbleSort {

    public static void sort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i=0; i<--n; i++) {
            swapped = false;

            for (int j=0; j<n; j++) {
                if (array[j+1] < array[j]) {
                    SelectionSort.swap(array, j, j+1);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}
