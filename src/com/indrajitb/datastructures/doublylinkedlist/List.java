package com.indrajitb.datastructures.doublylinkedlist;

/***
 Created by Indrajit Bhattacharya on 15/09/21
 ***/

public interface List<T extends Comparable> {
    void insert(T node);
    void remove(T data);
    void traverse();
    int size();
}
