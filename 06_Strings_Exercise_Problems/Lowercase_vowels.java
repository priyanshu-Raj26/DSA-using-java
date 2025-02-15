import java.util.*;

public class Lowercase_vowels {

    public static int Vowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println("Count of vowels is: " + Vowels(str));
    }
}