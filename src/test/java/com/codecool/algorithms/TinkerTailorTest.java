package com.codecool.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TinkerTailorTest {

    private TinkerTailor tinkerTailor;

    @BeforeEach
    void init() {
        tinkerTailor = new TinkerTailor();
    }

    @Test
    void testForCountOf3InSequenceOf5() {
        List<Integer> expected = Arrays.asList(3, 1, 5, 2, 4);
        List<Integer> actual = tinkerTailor.getResultSequence(5, 3);

        for (int i=0; i<expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

}