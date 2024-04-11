//Write a program to swap two numbers without using third variable
// a = a + b;
// b = a - b;
// a = a - b;

public class SwapWithoutVariable {
    public static void main(String args[]) {
        int a = 3;
        int b = 4;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}