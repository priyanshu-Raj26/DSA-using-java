// print number of 7's that are in 2 D arrays

public class Problem_01 {

    public static int array(int arr[][]) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
     
        int arr[][] = {{4, 7, 8},
                       {8, 8, 7}}; 
        System.out.println("Number of 7's in 2D arrays: "+array(arr));
    }
}