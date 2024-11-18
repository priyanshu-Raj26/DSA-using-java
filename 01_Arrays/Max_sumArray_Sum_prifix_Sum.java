public class Max_sumArray_Sum_prifix_Sum {
   
    public static void prifix_Sum(int array[]) {
        int sum = 0;
        int largest = Integer.MIN_VALUE; 
        int prifix[] = new int[array.length];

        prifix[0] = array[0];

        for (int i = 1; i < prifix.length; i++) {
            prifix[i] = prifix[i-1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            int start = i; 
            for (int j = i; j < array.length; j++) {
                int end = j;
                sum = start == 0 ? prifix[end] : prifix[end] - prifix[start-1];
                
                if (largest < sum) {
                    largest = sum;
                }
            }
        }
        System.out.println("Max subArray sum is: "+ largest);
    }

    public static void main(String[] args) {
        int array[] = {1, -2, 6, -1, 3};
        prifix_Sum(array); 
    }

}
