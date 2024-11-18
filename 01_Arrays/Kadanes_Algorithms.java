public class Kadanes_Algorithms {

    public static void kadane(int array[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<array.length; i++) {
            cs += array[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Max subArray sum is: "+ ms);
    }
    
    public static void main(String[] args) {
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(array);
    }
}
