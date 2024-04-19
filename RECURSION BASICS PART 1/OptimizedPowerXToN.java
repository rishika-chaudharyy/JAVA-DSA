//Print x^n in log(n) time complexity,optimized

public class OptimizedPowerXToN {
    public static int optimizedXRaiseToN(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }

        // x^n = x^n/2 * x^n/2 if even
        // int halfPowerSquare=optimizedXRaiseToN(x, n/2)*optimizedXRaiseToN(x,n/2);
        // //this Tc is O(n) only
        int halfPower = optimizedXRaiseToN(x, n / 2);
        int halfPowerSquare = halfPower * halfPower;

        // if odd x^n=x*x^n/2 * x^n/2
        if (n % 2 != 0) {
            halfPowerSquare = x * halfPowerSquare;
        }

        return halfPowerSquare;
    }

    public static void main(String args[]) {
        System.out.println((optimizedXRaiseToN(2, 5)));
    }
}
