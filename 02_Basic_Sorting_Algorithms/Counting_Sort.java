public class Counting_Sort {

    public static void Counting_Sort(int array[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);    
        }

        int count[] = new int [largest + 1];

        for (int i = 0; i < count.length; i++) {
            count[array[i]]++;    
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    
    public static void main(String[] args) {
        int array[] = {1, 4, 1, 3, 2, 4, 3, 7};

        System.out.println("After Sorting: ");
        Counting_Sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");

        }
    }
}
