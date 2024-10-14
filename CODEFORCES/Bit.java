import java.util.*;

public class Bit {
  public static void solve(List<String> s, int n) {
    int x = 0;
    for (int i = 0; i < n; i++) {
      if (s.get(i).equals("X++")) {
        x++;
      } else if (s.get(i).equals("X--")) {
        x--;
      } else if (s.get(i).equals("++X")) {
        ++x;
      } else {
        --x;
      }
    }
    System.out.println(x);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine(); // To consume the remaining newline
    List<String> s = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      s.add(sc.nextLine());
    }
    solve(s, n);
    sc.close();
  }
}
