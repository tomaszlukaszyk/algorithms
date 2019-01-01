package com.codecool.algorithms;

import java.util.Arrays;

public class MergeSort {

    public static int[] getSorted(int[] array) {
        if (array.length < 2) return array;

        int middleIndex = (int) Math.floor(array.length / 2.0);

        int[] leftArray = getSorted(Arrays.copyOfRange(array, 0, middleIndex));
        int[] rightArray = getSorted(Arrays.copyOfRange(array, middleIndex, array.length));

        return merge(leftArray, rightArray);
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {
        int[] mergedArray = new int[leftArray.length + rightArray.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftArray.length & j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                mergedArray[k] = leftArray[i++];
            } else {
                mergedArray[k] = rightArray[j++];
            }
            k++;
        }

        while (i < leftArray.length) {
            mergedArray[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            mergedArray[k++] = rightArray[j++];
        }

        return mergedArray;
    }
}
