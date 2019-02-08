package com.sort;

public class MergeSorting {

    int[] array;
    int[] tempArray;

    void prepareForSort(int[] arr) {
        this.array = arr;
        this.tempArray = new int[arr.length];
        doMergeSort(0, arr.length-1);
    }

    void doMergeSort(int lowerIndex, int heightIndex) {
        if (lowerIndex < heightIndex) {
            int middle = lowerIndex + (heightIndex-lowerIndex)/2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle+1, heightIndex);
            mergePart(lowerIndex, middle, heightIndex);
        }
    }

    void mergePart(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i<=higherIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle+1;
        int k = higherIndex;

        while (i <= middle && j<=higherIndex) {
            if (tempArray[i]  <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {

        int[] arr={1, 50, 30, 10, 60, 80};
        System.out.println("Before sort");
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        new MergeSorting().prepareForSort(arr);
        System.out.println("\nAfter sort");

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
