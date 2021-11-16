package com.indrajitb.algorithms;

/***
 Created by Indrajit Bhattacharya on 16/11/21
 ***/

public class DuplicatesInArray {
    public static void main(String[] args) {
        int array[] = {1,3,6,1,2,3,8,9,5,6,5};

        for (int i = 0; i < array.length; i++) {
            if(array[Math.abs(array[i])] > 0) {
                array[Math.abs(array[i])] = -array[Math.abs(array[i])];
            }
            else {
                System.out.println(Math.abs(array[i]) + " is a duplicate.");
            }
        }

        System.out.println("CPU cores: " + Runtime.getRuntime().availableProcessors() +
                " Total memory: " +  Runtime.getRuntime().totalMemory() / (1024 * 1024) + " MB");
    }
}
