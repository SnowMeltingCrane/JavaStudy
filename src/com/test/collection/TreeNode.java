package com.test.collection;

public class TreeNode<E> {
    public E element;
    public TreeNode<E> left;
    public TreeNode<E> right;
    public TreeNode(E element) {
        this.element = element;
    }
}
