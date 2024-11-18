import java.util.*;

public class Array_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        //ceration
        
        // int marks[] = new int[size];
        int[] marks = new int[size];   // both are valid syntax

        int number[] = {1, 2, 3};

        int moreNumber[] = {4, 5, 6};

        String fruits[] = {"apple", "Mango", "orange"};

        System.out.println("Enter marks");
        //input
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Marks is: ");
        
        //output
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }

    }
}