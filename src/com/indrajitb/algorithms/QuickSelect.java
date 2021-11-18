package com.indrajitb.algorithms;

/***
 Created by Indrajit Bhattacharya on 16/11/21
 ***/

import java.util.Random;

public class QuickSelect {
    public static void main(String[] args) {
        int array[] = {5,2,1,4,8,3,-1,-2,9};

        // k: k-th lowest or highest number
        // Lowest: "le"
        // Highest: "gt"
        int n = quickSelect(array, 0, array.length - 1, "gt", 2);

        System.out.println(n);
    }

    private static int quickSelect(int[] array, int firstIndex, int lastIndex, String op, int k) {

        return select(array, firstIndex, lastIndex, op, k - 1);

    }

    private static int select(int[] array, int firstIndex, int lastIndex, String op, int k) {
        int pivotIndex = partition(array, firstIndex, lastIndex, op);

        if(op.equals("le")){
            if(pivotIndex > k)
                return select(array, firstIndex, pivotIndex - 1, op, k);
            else if (pivotIndex < k)
                return select(array, pivotIndex + 1, lastIndex, op, k);
        }else if(op.equals("gt")){
            if(pivotIndex < k)
                return select(array, pivotIndex + 1, lastIndex, op, k);
            else if (pivotIndex > k)
                return select(array, firstIndex, pivotIndex - 1, op, k);
        }

        return array[k];
    }

    private static int partition(int[] array, int firstIndex, int lastIndex, String op) {
        Random r = new Random();
        int pivotIndex = 0;
//        if(lastIndex < 0)
//            pivotIndex = r.nextInt(firstIndex+1) + firstIndex;
//        else
//            pivotIndex = r.nextInt(lastIndex-firstIndex+1) + firstIndex;
//        pivotIndex = r.nextInt(lastIndex +1);
//        pivotIndex = lastIndex;
        pivotIndex = r.nextInt(lastIndex - firstIndex + 1) + firstIndex;

        swap(array, pivotIndex, lastIndex);

        for (int i = firstIndex; i < lastIndex; i++) {
            if(op.equals("le")){
                if(array[i] < array[lastIndex]){
                    swap(array, i, firstIndex);
                    firstIndex++;
                }
            }else if(op.equals("gt")) {
                if(array[i] > array[lastIndex]){
                    swap(array, i, firstIndex);
                    firstIndex++;
                }
            }

        }

        swap(array, firstIndex, lastIndex);

        return firstIndex;

    }

    private static void swap(int array[], int pivot, int lastIndex) {
        int temp = array[pivot];
        array[pivot] = array[lastIndex];
        array[lastIndex] = temp;
    }
}
