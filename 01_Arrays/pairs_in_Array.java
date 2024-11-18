public class pairs_in_Array {

    public static void printpairs(int array[]) {
        int tp = 0;

        for (int i = 0; i < array.length; i++) {
            int curr = array[i];
            for (int j = i+1; j < array.length; j++) {
                System.out.print("(" + curr +","+ array[j]+ ") ");
                tp++;
            }   
            System.out.println();
        }
        System.out.println("Total pairs is: "  + tp);
    }

    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        printpairs(array);
    }
}
