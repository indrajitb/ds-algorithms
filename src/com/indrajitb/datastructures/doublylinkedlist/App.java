package com.indrajitb.datastructures.doublylinkedlist;

/***
 Created by Indrajit Bhattacharya on 15/09/21
 ***/

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        System.out.println("Original: ");
        list.traverse();
        System.out.println("\nOriginsl Size: " + list.size());
        list.remove(4);
        System.out.println("\nLater: ");
        list.traverse();
        System.out.println("\nNew Size: " + list.size());

    }
}
