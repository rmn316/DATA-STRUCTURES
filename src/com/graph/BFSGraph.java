package com.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {

    int size;
    AdjList[] array;

    public BFSGraph(int size) {
        this.size = size;
        array = new AdjList[this.size];

        for (int i = 0; i<this.size; i++) {
            array[i] = new AdjList();
            array[i].head = null;
        }
    }

    public void add(int src, int dest) {
        Node n = new Node(dest, null);
        n.next = array[src].head;
        array[src].head = n;
    }

    public void explore(int startVertex) {
        Boolean[] visited = new Boolean[size];

        for (int i = 0; i< size; i++) {
            visited[i] = false;
        }

        Queue<Integer> queue = new LinkedList<Integer>() {
        };
        queue.add(startVertex);
        while (!queue.isEmpty()) {
            int n = queue.poll();
            System.out.println("Visited node: " + n);
            queue.add(n);
            visited[n] = true;
            Node head = array[n].head;

            while (head!= null) {
                if (visited[head.value] == false) {
                    queue.add(head.value);
                    visited[head.value] = true;
                } else {
                    head = head.next;
                }
            }
        }
    }
}
