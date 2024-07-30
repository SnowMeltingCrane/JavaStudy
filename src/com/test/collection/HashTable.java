package com.test.collection;

public class HashTable<E> {
    private final int TABLE_SIZE = 10;
    private final Node<E>[] TABLE = new Node[TABLE_SIZE];

    public HashTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            TABLE[i]= new Node<>(null);
        }
    }

    public void put(E e) {
        int index = hash(e);
        Node<E> node = new Node<>(e);
        node.next=TABLE[index].next;
        TABLE[index].next=node;
    }

    public boolean contains(E e) {
        int index = hash(e);
        Node<E> prev = TABLE[index];
        while (prev!=null) {
            if(prev.element==e) {
                return true;
            }
            prev = prev.next;
        }
        return false;
    }

    public int hash(E e){
        int index=e.hashCode();
        return index%TABLE_SIZE;
    }

    public class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E element) {
            this.element = element;
        }
    }

}
