public class print_subArray {

    public static void subArray(int array[]) {
        int ts = 0;
        int s = 0;
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j; 
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k]+" ");
                    s += array[k];
                }
                ts++;
                if (largest < s) {
                    largest = s;
                }

                if (smallest > s) {
                    smallest = s;
                }

                System.out.print("  Sum is: " + s);
                System.out.println();
                s = 0;
            }
            System.out.println();
        }
        System.out.println("Total sub arrays: "+ts);
        System.out.println("Max sum is: "+largest);
        System.out.println("Min sum is: "+smallest);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        subArray(array);
    }
}
