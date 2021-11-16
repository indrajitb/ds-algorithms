package com.indrajitb.datastructures.doublylinkedlist;

/***
 Created by Indrajit Bhattacharya on 15/09/21
 ***/

public class Node<T extends Comparable>  {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
