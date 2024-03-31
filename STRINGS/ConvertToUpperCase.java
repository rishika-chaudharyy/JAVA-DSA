//For a given string convert each first letter of each word to uppercase

public class ConvertToUpperCase {
    public static String capitalizeString(String str) {
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {//the second condition checks if there is some character present after space
                
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "hi , i am rishika";
        System.out.println(capitalizeString(str));
    }
}
