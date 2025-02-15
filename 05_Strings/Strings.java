import java.util.*;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
    
    public static void main(String[] args) {
        // Strings are IMMUTABLE.

        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz@#$123");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();   //with spaces.
        // // name = sc.next(); without space
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        String firstName = "Priyanshu";
        String lastName = "Raj";
        String fullName = firstName + " " + lastName;  // CONCATENATION.
        // System.out.println("I am " + fullName);   // CONCATENATION


        printLetters(fullName);
    }
}