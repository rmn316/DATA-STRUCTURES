package com.ds;

public class QueueLinkedListDemo {
    public static void main(String[] args) {
        QueueLinkedList<String> q = new QueueLinkedList<String>();

        q.queue("Rob");
        q.queue("Bill");
        q.queue("Will");

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}
