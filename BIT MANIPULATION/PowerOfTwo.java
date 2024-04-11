//Write a program to check if the number is power of two or not
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return (n & n - 1) == 0;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwo(3));
    }
}
