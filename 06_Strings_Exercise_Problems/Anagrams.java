import java.util.*;

public class Anagrams {
    public static boolean isAnagram(String str1, String str2) {
        // Step 1: Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 2: Convert to lowercase to avoid case sensitivity issues
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Step 3: Convert to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Step 4: Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        if (isAnagram(word1, word2)) {
            System.out.println("Yes, they are anagrams!");
        } else {
            System.out.println("No, they are NOT anagrams!");
        }
    }
}
