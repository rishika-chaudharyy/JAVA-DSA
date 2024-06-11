//Write a program to implement Deque
import java.util.*;
public class DequeJCF {
    public static void main(String args[]){
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addFirst(4);
        System.out.println(d.getLast());
        System.out.println(d);
    }
}
