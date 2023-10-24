package com.package67;

public class Main {

    public static void main(String[] args) {
        int limit = 10;
        long[] fibonacciSeries = new long[limit];

        // Initialize the first two Fibonacci numbers
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        // Calculate and store the Fibonacci sequence
        for (int i = 2; i < limit; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        // Print the Fibonacci sequence
        for (int i = 0; i < limit; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }

    }
}
