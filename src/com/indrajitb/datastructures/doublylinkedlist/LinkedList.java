package com.indrajitb.datastructures.doublylinkedlist;

/***
 Created by Indrajit Bhattacharya on 15/09/21
 ***/

public class LinkedList<T extends Comparable<T>> implements List<T> {

    Node<T> head;
    Node<T> tail;
    int numOfItems = 0;

    public LinkedList(T data) {
        this.head = new Node<>(data);
        this.head.setPrev(null);
        this.head.setNext(null);
        this.tail = null;
        ++numOfItems;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setHead(Node<T> head) {
        head.setPrev(null);
        this.head = head;
    }

    public void setTail(Node<T> tail) {
        tail.setNext(null);
        this.tail = tail;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public LinkedList() {

    }


    @Override
    public void insert(T data) {

        Node<T> head1 = this.getHead();
        Node newHead = new Node<>(data);
        newHead.setNext(head1);
        newHead.setPrev(null);
        this.tail = head1;
        this.head = newHead;
        ++numOfItems;
    }

    @Override
    public void remove(T data) {
        if(head == null) return;

        if(data == head.getData()) {
            head = head.next;
            --numOfItems;
            return;
        }

        Node actual = head;
        Node current = head.getNext();
        while(current != null) {
            if(current.getData().compareTo(data) == 0) {
                actual.setNext(current.getNext());
                actual = null;
                --numOfItems;
                return;
            }
            actual = current;
            current = current.next;
        }
    }

    @Override
    public void traverse() {
        Node n = head;
        while(n != null) {
            System.out.print(n.getData().toString() + " -> ");
            n = n.next;
        }

    }

    @Override
    public int size() {
        return numOfItems;
    }


}
