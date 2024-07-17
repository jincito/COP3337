package Examples;

import java.util.NoSuchElementException;

public class FibonacciSequence {
    private static long fib[] = new long[100];
    //fib_0 = 0
    //fib_1 = 1
    //fib_n = fib_(n-1) + fib_n(n-2)
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
    //fib_n = (((1+sqrt(5))/2)^n - (((1-sqrt(5))/2^n)/sqrt(5)
    //golden ratio^^^
    public static int fib(int n) {
        if (n < 0) {
            throw new NoSuchElementException("Fibonacci is defined on non-negative integers");
        }
        if (n == 0 || n == 1) { // base case
                return n;
        } else // recursive step
            return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println("Fib(" + i + ") = " + fib(i));
        }
    }
}
