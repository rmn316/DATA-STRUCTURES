package com.sort;

public class BubbleSorting {

    static void BubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i<n; i++) {
            for (int j = 1; j<(n-1); j++) {
                if (arr[j-1]>arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1, 50, 30, 10, 60, 80};
        System.out.println("Before sort");
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + "\t");
            BubbleSort(arr);
            System.out.println("\nAfter sort");
        }

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
