package com.codecool.algorithms;

public class InsertionSort {

    public static void sort(int[] array) {

        for (int i=0; i<array.length-1; i++) {

            for (int j=i+1; j>0; j--) {
                if (array[j] < array[j-1]) {
                    SelectionSort.swap(array, j, j-1);
                } else break;
            }
        }
    }
}
