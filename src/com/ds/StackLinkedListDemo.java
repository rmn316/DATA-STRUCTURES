package com.ds;

public class StackLinkedListDemo {

    public static void main(String[] args) {
        StackLinkedList<String> st = new StackLinkedList<String>();

        st.pop();
        st.push("Robby");
        st.push("James");
        System.out.println(st.pop());
    }
}
