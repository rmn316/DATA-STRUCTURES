package com.ds;

public class OneDArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 20;
        numbers[1] = 5;
        numbers[2] = 10;
        numbers[3] = 6;
        numbers[4] = 11;

        for (int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        Student[] students = new Student[4];
        students[0] = new Student("bob", 39);
        students[1] = new Student("billy", 22);
        students[2] = new Student("brian", 55);
        students[3] = new Student("mick", 11);

        for (Student student : students) {
            System.out.println("name: " + student.name + " Age: " + student.age);
        }
    }
}
