package com.ds;

public class LinkedListDDemo {

    public static void main(String[] args) {
        LinkedListD<String> ls = new LinkedListD<String>();
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
