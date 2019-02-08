package com.search;

public class BinarySearch {

    public static void main(String[] args) {
        DataSet data = new DataSet(1000000);
        int search = 700;
        Boolean isFound = false;

        int lowIndex = 0;
        int highIndex = data.data.length;
        int midIndex = 0;

        while (!isFound) {

            if (lowIndex > highIndex) {
                System.out.println("number is not found");
                break;

            }

            midIndex = lowIndex+((highIndex-lowIndex)*2);
            if (data.data[midIndex] == search) {
                System.out.println("number found in tries: " + data.numberTry);
                isFound = true;
                break;
            }
            if (data.data[midIndex] > search) {
                lowIndex = midIndex + 1;
            }
            if (data.data[midIndex] < search) {
                highIndex = midIndex - 1;
            }
        }
    }
}
