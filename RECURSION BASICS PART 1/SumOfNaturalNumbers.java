//Print sum of first n natural numbers using Recursion
//TC is O(n)
//SC is O(n)

public class SumOfNaturalNumbers {
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        int sumnm1 = sumOfNaturalNumbers(n - 1);
        int sum = n + sumnm1;
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(sumOfNaturalNumbers(5));
    }
}
 