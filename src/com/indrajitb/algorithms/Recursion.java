package com.indrajitb.algorithms;

/***
 Created by Indrajit Bhattacharya on 16/11/21
 ***/

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

public class Recursion {
    public static void main(String[] args) {
//        System.out.println("Factorial of : ");
//        int n = new Scanner(System.in).nextInt();
//        factorial_tail(n, new BigInteger(String.valueOf(1)));
//        factorial_tail_int(n, 1);
//        System.out.println(factorial_head_int(n));
//
//        System.out.println("(ith)Fibonacci: ");
//        int n = new Scanner(System.in).nextInt();
//        System.out.println(fibonacci_tail(n, 0, 1));

        AtomicInteger moves = new AtomicInteger(0);
        tower_of_hanoi(5, 'A', 'B', 'C', moves);
        System.out.println("Total no. of moves made: " + moves);

        System.out.println(test(5));
    }

    private static int fibonacci_tail(int n, int a, int b) {
        if(n == 0)
            return a;
        if(n == 1)
            return b;

        return fibonacci_tail(n - 1, b, a + b);
    }

    private static BigInteger factorial_tail(int n, BigInteger acc) {
        if (n == 0){
            System.out.println(" is " + acc);
            return acc;
        }
        return factorial_tail(n-1, acc.multiply(BigInteger.valueOf(n)));
    }

    private static int factorial_tail_int(int n, int acc) {
        if (n == 0){
            System.out.println(" is " + acc);
            return acc;
        }
        return factorial_tail_int(n-1, n * acc);
    }

    private static BigInteger factorial_head(int n) {

        if (n == 0){
            return BigInteger.valueOf(1);
        }
        BigInteger r1 = factorial_head(n-1);
        return r1.multiply(BigInteger.valueOf(n));

    }

    private static int factorial_head_int(int n) {

        if (n == 0){
            return 1;
        }
        int r1 = factorial_head_int(n-1);
        return r1 * n;

    }

    public static final void tower_of_hanoi(int disks, char A, char B, char C, AtomicInteger moves) {
        moves.getAndAdd(1);
        if(disks == 0) {
            System.out.println("Moving " + disks + " from " + A + " to " + C);
            return;
        }

        tower_of_hanoi(disks - 1, A, C, B, moves);
        System.out.println("Moving " + disks + " from " + A + " to " + C);
        tower_of_hanoi(disks - 1, B, A, C, moves);
    }

    private static final String test(int n){
        if(n >= 5) return "Hello!";
        return test(--n);
    }
}
