import java.util.*;

public class Boy_Or_Girl {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String userName = sc.nextLine();
    char userNameArray[] = userName.toCharArray();
    HashSet<Character> set = new HashSet<>();
    for (char ch : userNameArray) {
      set.add(ch);
    }

    int size = set.size();
    if (size % 2 == 0) {
      System.out.println("CHAT WITH HER!");
    } else {
      System.out.println("IGNORE HIM!");
    }
    sc.close();
  }
}