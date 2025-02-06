import java.util.Scanner;

public class Largest_in_2D_Array {

    public static void Array(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }

                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }

            System.out.println("Largest value is: " + largest);
            System.out.println("Smallest value is: " + smallest);
    }

    
   public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        Array(matrix);
    }
}
