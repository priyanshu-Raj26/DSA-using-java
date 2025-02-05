public class Selection_Sort {

    public static void Selection_Sort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
           int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
                array[i] = array[min];
                array[min] = temp;

        }
    }

    
    public static void main(String[] args) {
        int array[] = {5, 8, 12, 42, 69, 18, 1, 32};

        System.out.println("After Sorting: ");
        Selection_Sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");

        }
    }
}
