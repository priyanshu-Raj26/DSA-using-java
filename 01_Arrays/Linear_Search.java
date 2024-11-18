public class Linear_Search {

    public static int Liner_Search(int numbers[], int key) {
        
        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16,};
        int key = 10;
        int i = Liner_Search(number, key);

        if (i != -1) {
            System.out.println("Number is found at index: "+ i);
        }else{
            System.out.println("Number is not found");
        }
    }
}
