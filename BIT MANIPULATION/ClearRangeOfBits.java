//Write a program to clear range of bits
public class ClearRangeOfBits {
    public static int clearRangeOFBits(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (i << i - 1) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String args[]) {
        System.out.println(clearRangeOFBits(10, 2, 4));
    }
}
