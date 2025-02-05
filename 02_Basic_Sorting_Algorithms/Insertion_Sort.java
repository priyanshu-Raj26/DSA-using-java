public class Insertion_Sort {

    public static void Insertion_Sort(int[] array) {
        
        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int prev = i-1;

            while (prev >=0 && array[prev] > curr) {
                array[prev+1] = array[prev];
                prev--;
            }
            //Insertion
            array[prev+1] = curr;
        }
    }

    
    public static void main(String[] args) {
        int array[] = {5, 8, 12, 45, 69, 18, 1, 57};

        System.out.println("After Sorting: ");
        Insertion_Sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
