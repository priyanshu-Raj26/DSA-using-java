public class Problem_03 {

    public static void Transpose(int arr[][]) {
        int array[][] = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                array[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpose matrix is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        
        int arr[][] = {{1, 2, 3},
                        {11, 22, 33}};
        
        Transpose(arr);
    }
}
