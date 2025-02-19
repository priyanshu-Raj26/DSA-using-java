public class Bubble_Sort {

    public static void Bubble_Sort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    
                    array[j] = array[j] ^ array[j + 1];
                    array[j + 1] = array[j] ^ array[j + 1];
                    array[j] = array[j] ^ array[j + 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 5, 8, 12, 45, 69, 18, 1, 45 };

        System.out.println("After Sorting: ");
        Bubble_Sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}