public class Key_index {

    public static void PrintIndex(int arr[],int i,int key) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        PrintIndex(arr, i+1, key);
    }


    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        PrintIndex(arr, 0, 2);
    }
}