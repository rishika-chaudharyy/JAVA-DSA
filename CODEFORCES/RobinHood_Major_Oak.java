import java.util.Scanner;

public class RobinHood_Major_Oak {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt(); // Number of test cases

    while (t-- > 0) {
      long n = sc.nextLong(); // The year n
      long k = sc.nextLong(); // The number of years leaves last

      // Check if the number of leaves in year n is even or odd
      if (isEven(n, k)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }

    sc.close();
  }

  public static boolean isEven(long n, long k) {
    // Count how many odd numbers are in the range [n-k+1, n]
    long start = n - k + 1;
    long end = n;

    // Count of odd numbers in the range [start, end]
    long oddCount = (end + 1) / 2 - start / 2;

    // If the count of odd numbers is even, return true (even), else false (odd)
    return oddCount % 2 == 0;
  }
}
