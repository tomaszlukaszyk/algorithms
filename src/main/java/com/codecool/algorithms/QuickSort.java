package com.codecool.algorithms;

public class QuickSort {

    public static void sort(int[] array, int left, int right) {
        if (left > right) return;

        int partition = partition(array, left, right);
        sort(array, left, partition-1);
        sort(array,partition+1, right);
    }

    private static int partition(int[] array, int left, int right) {

        int i = left - 1;

        for (int j=left; j< right; j++) {

            if (array[j] <= array[right])
                SelectionSort.swap(array, ++i, j);
        }

        SelectionSort.swap(array, ++i, right);
        return i;
    }
}
