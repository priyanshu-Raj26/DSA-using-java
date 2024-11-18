import java.util.*;

public class Largest_in_array {
    public static int Largest(int array[]) {
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for (int i = 0; i < array.length; i++) {
           if ( array[i] > largest) {
                largest = array[i];
           }   

           if ( array[i] < smallest) {
                smallest = array[i];
           }   
        }

        System.out.println("Smallest number is: "+ smallest);
        return largest;
    }

     
    public static void main(String[] args) {
        int array[] = {1,3,5,8,9,34,25,18};
        
        System.out.println("Largest number is: "+ Largest(array));
    }
}
