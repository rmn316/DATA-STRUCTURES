package com.graph;

import java.util.Stack;

public class DepthFirstSearchGraph {

    int size;
    AdjList[] array;

    public DepthFirstSearchGraph(int size) {
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

        Stack<Integer> st = new Stack<Integer>();
        st.push(startVertex);
        while (!st.empty()) {
            int n = st.pop();
            st.push(n);
            visited[n] = true;
            Node head = array[n].head;
            Boolean isDone = true;

            while (head!= null) {
                if (visited[head.value] == false) {
                    st.push(head.value);
                    visited[head.value] = true;
                    isDone = false;
                    break;
                } else {
                    head = head.next;
                }
            }
            if (isDone == true) {
                int out = st.pop();
                System.out.println("Visited node: " + out);
            }
        }
    }
}
