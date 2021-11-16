package com.indrajitb.datastructures.singlylinkedlist;

/***
 Created by Indrajit Bhattacharya on 15/09/21
 **
 ***/

public class LinkedList<T extends Comparable> implements List<T> {

    Node<T> head;
    int numOfItems;

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    public LinkedList() {

    }


    @Override
    public void insert(Node<T> node) {
        if(head == null) {
            head = new Node<>(node.getData());
            head.next = null;
            numOfItems = 1;
        } else {
            Node<T> n = new Node<>(node.getData());
            n.next = head;
            head = n;
            numOfItems++;
        }
    }

    @Override
    public void remove(T data) {
        if(head == null) return;

        if(data == head.getData()) {
            head = head.next;
            return;
        }

        Node actual = head;
        Node current = head.getNext();
        while(current != null) {
            if(current.getData().compareTo(data) == 0) {
                actual.setNext(current.getNext());
                actual = null;
                numOfItems--;
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
            System.out.print(n.getData().toString() + " ");
            n = n.next;
        }

    }

    @Override
    public int size() {
        return numOfItems;
    }

    @Override
    public void reverse() {
        Node<T> prev = null;
        Node<T> next = null;
        Node<T> current = this.head;

        while(current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        this.head = prev;
    }
}
