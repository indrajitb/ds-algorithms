package com.indrajitb.datastructures.singlylinkedlist;

/***
 Created by Indrajit Bhattacharya on 15/09/21
 **
 ***/

public interface List<T extends Comparable> {
    void insert(Node<T> node);
    void remove(T data);
    void traverse();
    int size();
    void reverse();
}
