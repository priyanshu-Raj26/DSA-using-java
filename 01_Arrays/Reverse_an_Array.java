public class Reverse_an_Array {

    public static void reverse(int array[]) {
        int first = 0, last = array.length-1;
         
        while (first < last) {
            //swap
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++; 
            last--;
        }
    }

    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};

        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
