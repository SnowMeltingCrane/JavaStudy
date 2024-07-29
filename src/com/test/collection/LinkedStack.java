package com.test.collection;

import java.util.NoSuchElementException;

public class LinkedStack<E> {
    private final Node<E> head = new Node<E>(null);
    private int size;

    public static class Node<E>{
        public E data;
        public Node<E> next;
        public Node(E data){
            this.data = data;
        }
    }

    public void push(E e){
        Node<E> node = new Node<>(e);
        node.next = head.next;
        head.next = node;
        size++;
    }
    public E pop(){
        if(isEmpty()){
            throw new NoSuchElementException("栈空");
        }
        E data = head.next.data;
        head.next = head.next.next;
        size--;
        return data;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return head.next == null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<E> node = head.next;
        while(node != null){
            sb.append(node.data).append("->");
            node = node.next;
        }
        return sb.toString();
    }
}
