package com.ds;

public class LinkedListUDemo {

    public static void main(String[] args) {
        LinkedListU<String> ls = new LinkedListU<String>();
        ls.add("Robby");
        ls.add("Steven");
        ls.add("Meya");
        ls.add("Billy");

        ls.display();
        ls.delete();
        System.out.println("After Delete");
        ls.display();
    }
}
