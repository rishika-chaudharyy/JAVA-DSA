//Print Nth fibonacci number
//SC is O(n)
//TC is O(2^n) exponential time complexity

public class FibonacciNthTerm {
    public static int fibonacciIndexTerm(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int fibnm1 = fibonacciIndexTerm((n - 1));
        int fibnm2 = fibonacciIndexTerm((n - 2));

        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    public static void main(String args[]) {
        System.out.println(fibonacciIndexTerm(5));
    }
}
