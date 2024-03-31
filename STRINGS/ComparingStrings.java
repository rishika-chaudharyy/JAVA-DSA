//Write a program to compare two string using both ==  and .equals and analyze the difference

public class ComparingStrings {
    public static void main(String args[]) {
        String str1 = "tony";
        String str2 = "tony";
        String str3 = new String("tony");
        if (str1 == str2) { // checks at object level
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        if (str1.equals(str3)) {// checks value
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
