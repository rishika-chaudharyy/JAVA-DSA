//Write a program to analyze all the bitwise operators in java
public class BitwiseOperators {
    public static void main(String args[]) {
        System.out.println(5 & 6); // binary AND &
        System.out.println(6 | 1); // binary OR |
        System.out.println(6 ^ 1); // binary XOR ^
        System.out.println(~5); // binaty NOT ~ or one's compliment
        // To find one's compliment
        // 1.Find the one's compliment of the number or flip the bits
        // 2.Check if MSB is 1 or 0 to determine if the number is positive or negative
        // 3.Now again find one's compliment
        // 4.Then add one to it and write the number wrt to MSB
        // Step 3 and 4 are called 2's compliment
        System.out.println(5 << 4); // Binary left shift <<
        System.out.println(5 >> 4); // Binary right shift >>
    }
}