//Write a program to clear the last i bits
public class ClearLastIthBits {
    public static int clearLastIBits(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static void main(String args[]) {
        System.out.println(clearLastIBits(15, 2));
    }
}
