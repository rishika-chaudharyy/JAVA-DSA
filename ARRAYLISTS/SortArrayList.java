//Write a program to sort the ArrayList
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list.add(i);
        }

        System.out.println(list);

        Collections.sort(list);//ascending
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);//descending
    }

}
