package com.search;

public class LinearSearch {
    public static void main(String[] args) {
        DataSet data = new DataSet(1000000);
        int search = 700;
        Boolean isFound = false;

        for (int i = 0; i<data.data.length; i++) {
            data.numberTry++;
            if (data.data[i] == search) {
                System.out.println("Number Found after tries: " + data.numberTry);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Number not found");
        }
    }
}
