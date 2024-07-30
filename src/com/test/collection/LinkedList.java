package com.test.collection;

public class LinkedList<E> {

    private final Node<E> head=new Node<E>(null);
    private int size = 0;

    private static class Node<E> {
        private E element;
        Node<E> next;
        public Node(E element) {
            this.element = element;
        }
    }

    public void add(E element,int index) {
        if(index>size||index<0)
            throw new IndexOutOfBoundsException("插入位置非法，合法的插入位置为：0~"+size);
        Node<E> prev=head;
        for (int i = 0; i <index; i++) {
            prev=prev.next;
        }

        Node<E> node=new Node<E>(element);
        node.next=prev.next;
        prev.next=node;
        size++;
    }

    public E remove(int index) {
        if(index>size-1||index<0){
            throw new IndexOutOfBoundsException("删除位置非法，合法的删除位置为：0~"+(size-1));
        }
        Node<E> prev=head;
        for (int i = 0; i <index; i++) {
            prev=prev.next;
        }
        prev.next=prev.next.next;
        size--;
        return prev.next.element;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        Node<E> node=head.next;
        while (node!=null) {
            sb.append(node.element).append(" ");
            node=node.next;
        }
        return sb.toString();
    }

    public E get(int index) {
        if(index>size-1||index<0){
            throw new IndexOutOfBoundsException("查找位置非法，合法的查找位置为：0~"+(size-1));
        }
        Node<E> prev=head;
        for (int i = 0; i <index; i++) {
            prev=prev.next;
        }
        return prev.next.element;
    }

    public int getSize(){
        return size;
    }
}
