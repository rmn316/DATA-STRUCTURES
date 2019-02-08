package com.tree;

public class BinarySearchTreeDemo {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(bst.root, bst.NodeCreate(10));
        bst.add(bst.root, bst.NodeCreate(12));
        bst.add(bst.root, bst.NodeCreate(11));
        bst.add(bst.root, bst.NodeCreate(13));
        bst.add(bst.root, bst.NodeCreate(6));

        bst.search(13, bst.root);

    }
}
