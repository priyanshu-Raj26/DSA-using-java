import java.util.Arrays;
import java.util.Comparator;


public class Inbuilt_Sort {

    public static void main(String[] args) {
        // 1. Sorting Primitive Array
        int[] intArray = {5, 2, 8, 1, 3};
        Arrays.sort(intArray);
        System.out.println("Sorted Primitive Array: " + Arrays.toString(intArray)); // [1, 2, 3, 5, 8]

        // 2. Sorting Object Array (Strings)
        String[] strArray = {"John", "Alice", "Bob"};
        Arrays.sort(strArray);
        System.out.println("Sorted String Array: " + Arrays.toString(strArray)); // [Alice, Bob, John]

        // 3. Sorting Object Array in Reverse Order
        Integer[] objArray = {5, 2, 8, 1, 3};
        Arrays.sort(objArray, Comparator.reverseOrder());
        System.out.println("Sorted Object Array (Descending): " + Arrays.toString(objArray)); // [8, 5, 3, 2, 1]

    }
}

