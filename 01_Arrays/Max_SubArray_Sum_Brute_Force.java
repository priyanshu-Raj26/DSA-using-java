public class Max_SubArray_Sum_Brute_Force {

    public static void Brute_Force(int array[]) {
        int sum = 0;
        int largest = Integer.MIN_VALUE; 

        for (int i = 0; i < array.length; i++) {
            int start = i; 
            for (int j = i; j < array.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    sum += array[k];
                }
                System.out.print("Sum is: " + sum);
                if (largest < sum) {
                    largest = sum;
                }
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max subArray sum is: "+ largest);
    }

    public static void main(String[] args) {
        int array[] = {1, -2, 6, -1, 3};
        Brute_Force(array); 
    }
}