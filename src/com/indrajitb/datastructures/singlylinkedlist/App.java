package com.indrajitb.datastructures.singlylinkedlist;

/***
 Created by Indrajit Bhattacharya on 15/09/21
 **
 ***/

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(new Node<>(1));
        list.insert(new Node<>(2));
        list.insert(new Node<>(3));
        list.insert(new Node<>(4));
        list.insert(new Node<>(5));

        System.out.println("Original: ");
        list.traverse();
        list.remove(3);
        System.out.println("\nLater: ");
        list.traverse();
        System.out.println("\nSize: " + list.size());

    }
}
