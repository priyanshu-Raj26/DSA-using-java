public class Change_Arr {

    public static void ChangeArr(int arr[],int i, int val) {
        //base case
        if (i == arr.length) {
            PrintArr(arr);
            return;
        }

        //recursion
        arr[i] = val;
        ChangeArr(arr, i+1, val+1); // function call step
        arr[i] = arr[i] - 2;    //backtracking step
    }


    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        ChangeArr(arr, 0, 1);
        PrintArr(arr);
    }
}