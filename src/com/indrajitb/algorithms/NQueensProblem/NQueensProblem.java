package com.indrajitb.algorithms.NQueensProblem;

import java.util.Scanner;

/***
 Created by Indrajit Bhattacharya on 18/11/21
 ***/

public class NQueensProblem {
    public static void main(String[] args) {
        System.out.print("Enter the board dimension: ");
        int n = new Scanner(System.in).nextInt();
        int board[][] = new int[n][n];

        if(solve(board, 0, n)){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] == 1 ? " * " : " - ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("No solution!");
    }

    private static boolean solve(int[][] board, int col, int size) {
        if(col >= size)
            return true;

        for (int i = 0; i < size; i++) {
            if(isSafe(board, i, col)){
                board[i][col] = 1;
                if(solve(board, col + 1, size)) {
                    return true;
                }
            }
            board[i][col] = 0;

        }

        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {

        for (int i = 0; i < col; i++) {
            if(board[row][i] == 1)
                    return false;
        }

        for (int i = row, j = col; i >=0 && j >=0; i--, j--) {
            if(board[i][j] == 1)
                return false;
        }

        for (int i = row, j = col; i < board.length && j >=0; i++, j--) {
            if(board[i][j] == 1)
                return false;
        }

        return true;
    }
}
