package com.tree;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node NodeCreate(int value) {
        return new Node(value, null, null);
    }

    public void add(Node startNode, Node newNode) {
        if (root == null) {
            root = newNode;
            return;
        }

        if (startNode.value > root.value) {
            if (startNode.right == null) {
                startNode.right = newNode;
            }
            add(startNode.right, newNode);
        }

        if (startNode.value < root.value) {
            if (startNode.left == null) {
                startNode.left = newNode;
            }
            add(startNode.left, newNode);
        }
    }

    public void delete(int value) {
        // to inplement
    }

    public void search(int value, Node start) {
        if (start == null) {
            System.out.println("Node is not found");
            return;
        }
        if (start.value == value) {
            System.out.println("node is found");
            return;
        }
        if (value > start.value) {
            search(value, start.right);
        }
        if (value < start.value) {
            search(value, start.left);
        }
    }
}
