package com.yunji.common;

/**
 * Create by matth on 2018/3/18
 */
public class Stack<E> {

    public int size = 0;

    private Node<E> first;

    private class Node<T> {
        private T item;
        private Node<T> next;

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public E push(E item) {
        if (size == 0) {
            first = new Node<E>();
            first.setItem(item);
            size++;
        } else {
            Node<E> newNode = new Node<E>();
            newNode.setItem(item);
            size++;
            newNode.setNext(first);
            first = newNode;
        }
        return item;
    }

    public E pop() throws Exception {
        if (size == 0) {
            throw new Exception("越界");
        }
        E item = first.getItem();
        first = first.getNext();
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
