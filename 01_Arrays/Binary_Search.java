public class Binary_Search {

    public static int Binary_Search(int array[],int target) {

        int left = 0,right = array.length;
        int mid;

        while (left <= right) {

            mid = (left+right) / 2;

            if (array[mid] == target) {
                return mid;
            }else if (target > array[mid]) {
                left = mid+1;
            }else {
                right = mid-1;
            }

            
        }
        return -1;

    }

    public static void main(String[] args) {
        int array[] = {2,4,10,23,35,42,53,69,72,88};
        int target = 69;

        int index = Binary_Search(array, target);

        if (index != -1) {
            System.out.println("Number is found at index: "+ index);
        }else{
            System.out.println("Number is not found.");
        }
    }
}
