//Write a program to clear the ith bit
public class ClearIthBit {
    public static int clearIthBit(int n, int i) {
        int bitmask = ~(i << i);
        return n & bitmask;
    }

    public static void main(String args[]) {
        System.out.println(clearIthBit(10, 1));
    }
}
