// Apply merge sort to sort an array of String.

public class Problem_01 {

        // Function to perform merge sort on string array
        public static String[] mergeSort(String[] arr, int lo, int hi) {
            if (lo == hi) {
                String[] A = { arr[lo] };
                return A;
            }
    
            int mid = lo + (hi - lo) / 2;
            String[] arr1 = mergeSort(arr, lo, mid);
            String[] arr2 = mergeSort(arr, mid + 1, hi);
    
            String[] arr3 = merge(arr1, arr2);
            return arr3;
        }
    
        // Function to merge two sorted arrays
        static String[] merge(String[] arr1, String[] arr2) {
            int m = arr1.length;
            int n = arr2.length;
            String[] arr3 = new String[m + n];
    
            int idx = 0, i = 0, j = 0;
    
            while (i < m && j < n) {
                if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                    arr3[idx] = arr1[i];
                    i++;
                } else {
                    arr3[idx] = arr2[j];
                    j++;
                }
                idx++;
            }
    
            while (i < m) {
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }
    
            while (j < n) {
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
    
            return arr3;
        }
    
        // Return true if str1 appears before str2 in alphabetical order
        static boolean isAlphabeticallySmaller(String str1, String str2) {
            return str1.compareTo(str2) < 0;
        }
    
        public static void main(String[] args) {
            String[] arr = { "sun", "earth", "mars", "mercury" };
            String[] sortedArr = mergeSort(arr, 0, arr.length - 1);
    
            for (String s : sortedArr) {
                System.out.println(s);
            }
        }
}
    