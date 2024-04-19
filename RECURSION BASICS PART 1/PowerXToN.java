//Print x^n using Recursion

public class PowerXToN {
    public static int xRaiseToN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = xRaiseToN(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static void main(String args[]) {
        System.out.println((xRaiseToN(2, 10)));
    }
}
