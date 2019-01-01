package com.codecool.algorithms;

public class BinarySearch {

    private int[] array;

    public BinarySearch() {
    }

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return this.array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public boolean contains(int number) {
        int lowIndex = 0;
        int highIndex = this.array.length - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = (int) Math.floor((lowIndex + highIndex) / 2.0);

            if (this.array[middleIndex] == number) {
                return true;
            } else if (this.array[middleIndex] > number) {
                highIndex = middleIndex - 1;
            } else {
                lowIndex = middleIndex + 1;
            }
        }

        return false;
    }
}
