package com.codecool.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private BinarySearch binarySearch;

    @BeforeEach
    void init() {
        int[] array = {1, 2, 3, 4, 5, 10, 13, 36, 47, 108, 500, 1234, 1901};
        this.binarySearch = new BinarySearch(array);
    }

    @Test
    void testContainsReturnsTrueForCorrectElement() {
        assertTrue(this.binarySearch.contains(1));
        assertTrue(this.binarySearch.contains(47));
        assertTrue(this.binarySearch.contains(1234));
    }

    @Test
    void testContainsReturnsFalseForIncorrectElement() {
        assertFalse(this.binarySearch.contains(6));
        assertFalse(this.binarySearch.contains(5000));
        assertFalse(this.binarySearch.contains(-8));
    }

}