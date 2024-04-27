package SecondTask;

import java.util.Arrays;

// Задание (IV)
public class Permutation {

    public static boolean Permutations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "siLent";
        if (Permutations(s1, s2)) {
            System.out.println(s1 + " и " + s2 + " являются перестановками.");
        } else {
            System.out.println(s1 + " и " + s2 + " не являются перестановками.");
        }
    }
}