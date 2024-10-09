import java.util.Scanner;

public class Sum_of_Odd_integers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      long k = sc.nextLong();
      if (n >= k * k && (n % 2 == k % 2)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}