import java.util.Scanner;

public class Minimum_Operations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // Number of test cases

    for (int i = 0; i < t; i++) {
      long n = sc.nextLong(); // The number 'a'
      long k = sc.nextLong(); // The base 'b'
      long operations = 0;

      if (k == 1) {
        // If k is 1, it will take 'n' operations to reduce n to 0 by subtracting 1 each
        // time
        System.out.println(n);
        continue;
      }

      while (n > 0) {
        operations += n % k; // Add the remainder when dividing by k (number of subtractions)
        n /= k; // Reduce n by dividing it by k
      }

      System.out.println(operations);
    }

    sc.close();
  }
}
