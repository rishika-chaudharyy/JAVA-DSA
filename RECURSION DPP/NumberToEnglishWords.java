//You are given a number , convert it to string of english like words . Use a recursive function to solve this problem . The digits will only rn=ange from 0-9 and digit can't be 0 at end
//Ex. 2019 = two zero one nine

public class NumberToEnglishWords {
    public static void toEnglishWords(int num, String englishWords[]) {
        // base case
        if (num == 0) {
            return;
        }
        // kaam
        int lastdigit = num % 10;
        toEnglishWords(num / 10, englishWords);
        System.out.print(englishWords[lastdigit] + " ");
    }

    public static void main(String args[]) {
        String englishWords[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        toEnglishWords(2000, englishWords);
    }
}
