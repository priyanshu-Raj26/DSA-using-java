// print out the sum of numbers in the second row of the array

public class Problem_02 {

    public static int sum(int arr[][]) {
        int sum = 0;

        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[1][i];
        }
        return sum;
    }


    public static void main(String[] args) {
     
        int arr[][] = {{1, 4, 9},
                        {11, 4, 3},
                        {2, 2, 3}};
        System.out.println(sum(arr));
    }
    
}
