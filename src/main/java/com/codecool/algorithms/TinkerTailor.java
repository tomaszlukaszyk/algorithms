package com.codecool.algorithms;

import java.util.ArrayList;
import java.util.List;

public class TinkerTailor {

    public List<Integer> getResultSequence(int n, int k) {
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> ordered = getOrderedSequence(n);
        int currentIndex = 0;

        while (ordered.size() > 0) {
            for (int i=1; i<k; i++) {
                currentIndex++;

                if (currentIndex > ordered.size() - 1)
                    currentIndex = 0;
            }

            result.add(ordered.remove(currentIndex));

            if (currentIndex > ordered.size() - 1)
                currentIndex = 0;
        }

        return result;
    }

    private List<Integer> getOrderedSequence(int n) {
        List<Integer> ordered = new ArrayList<Integer>();

        for (int i=1; i<=n; i++) {
            ordered.add(i);
        }

        return ordered;
    }
}
