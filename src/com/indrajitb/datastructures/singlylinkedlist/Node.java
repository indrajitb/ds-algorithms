package com.indrajitb.datastructures.singlylinkedlist;

/***
 Created by Indrajit Bhattacharya on 15/09/21
 **
 ***/

public class Node<T extends Comparable>  {
    T data;
    Node<T> next;

    public Node<T> getNext() {
        return next;
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
