//Write a program to update the ith bit
//1.by directly set and clear bit as needed
//2.by first clearing the bit
public class UpdateIthBit {
    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearithBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateIthBit1(int n, int i, int newbit) {
        if (newbit == 1) {
            return setIthBit(n, i);
        } else {
            return clearithBit(n, i);
        }
    }

    public static int updateIthBit2(int n, int i, int newbit) {
        n = clearithBit(n, i);

        int bitmask = newbit << i;
        return n | bitmask;
    }

    public static void main(String args[]) {
        System.out.println(updateIthBit1(10, 2, 1));
        System.out.println(updateIthBit2(10, 2, 1));
    }
}
