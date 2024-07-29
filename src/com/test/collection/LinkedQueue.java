package com.test.collection;

import java.util.NoSuchElementException;

public class LinkedQueue<E> {
    private final Node<E> head= new Node<E>(null);

    public void offer(E e) {
        Node<E> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new Node<E>(e);
    }

    public E poll(){
        E e= head.next.data;
        if(isEmpty())
            throw new NoSuchElementException("队列为空");
        head.next = head.next.next;
        return e;
    }

    public boolean isEmpty(){
        return head.next == null;
    }

    public E peek(){
        if(isEmpty())
            throw new NoSuchElementException("队列为空");
        return head.next.data;
    }

    private static class Node<E>{
        private E data;
        private Node<E> next;
        public Node(E data) {
            this.data = data;
        }
    }
}
