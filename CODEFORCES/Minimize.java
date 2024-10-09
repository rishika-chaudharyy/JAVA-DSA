import java.util.Scanner;

public class Minimize {
  public static void main(String[] args) {
    // Scanner object to take input
    Scanner sc = new Scanner(System.in);

    // Read the number of test cases
    int t = sc.nextInt();

    // Loop through each test case
    for (int i = 0; i < t; i++) {
      // Read the values of a and b
      int a = sc.nextInt();
      int b = sc.nextInt();

      // Since the minimum value of (c - a) + (b - c) is always b - a
      // we simply output b - a
      System.out.println(b - a);
    }

    // Close the scanner
    sc.close();
  }
}
