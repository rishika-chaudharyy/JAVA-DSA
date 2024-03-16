//Write a program to search for an element in an array using linear search and return -1 if not found
//Time complexity of linear search is O(n)

public class LinearSearch {
    public static int linearSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) { // to compare two strings
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String menu[] = { "samosa", "daal bati", "chole bhature", "manchurain" };
        String key = "daal bati";

        int index = linearSearch(menu, key);
        if (index == -1) {
            System.out.println("Key NOT found");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}
