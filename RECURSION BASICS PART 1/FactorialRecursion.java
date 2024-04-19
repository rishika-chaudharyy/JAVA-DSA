//Print factorial of a number n using Recursion
//TC is O(n)
//SC is O(n)

public class FactorialRecursion {
    public static int printFactorial(int n) {
        if (n == 0) { // base case
            return 1;
        }

        // inner function call
        int fnm1 = printFactorial(n - 1);// n! se acha n-1! calculate karo
        // kaam
        int fn = n * fnm1; // multiply it with n
        return fn;
    }

    public static void main(String args[]) {
        System.out.println(printFactorial(5));
    }
}
