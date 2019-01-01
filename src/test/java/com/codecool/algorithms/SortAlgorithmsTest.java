package com.codecool.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortAlgorithmsTest {

    int[] arrayToSort;
    int[] arraySorted;

    @BeforeEach
    void init() {
        arrayToSort = new int[]{14, 33, 27, 10, 35, 19, 44, 42};
        arraySorted = new int[]{10, 14, 19, 27, 33, 35, 42, 44};
    }

    @Test
    void testSelectionSort() {
        SelectionSort.sort(arrayToSort);

        for (int i=0; i<arraySorted.length; i++) {
            assertEquals(arraySorted[i], arrayToSort[i]);
        }
    }

    @Test
    void testBubbleSort() {
        BubbleSort.sort(arrayToSort);

        for (int i=0; i<arraySorted.length; i++) {
            assertEquals(arraySorted[i], arrayToSort[i]);
        }
    }

    @Test
    void testInsertionSort() {
        InsertionSort.sort(arrayToSort);

        for (int i=0; i<arraySorted.length; i++) {
            assertEquals(arraySorted[i], arrayToSort[i]);
        }
    }
}