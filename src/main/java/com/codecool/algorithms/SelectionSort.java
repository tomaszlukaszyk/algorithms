package com.codecool.algorithms;

public class SelectionSort {

    public static void sort(int[] array) {

        for (int i=0; i<array.length; i++) {
            int min = i;

            for (int j=i+1; j<array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            if (min != i)
                swap(array, i, min);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
