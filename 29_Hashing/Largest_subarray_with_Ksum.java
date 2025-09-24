import java.util.HashMap;

public class Largest_subarray_with_Ksum {
    
    public static void main(String[] args) {  //O(n)
        int arr[] = {1, 2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        //(sum, count)
        map.put(0, 1);

        int sum = 0, ans = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (map.containsKey(sum-k)) {
                ans += map.get(sum-k); //key value
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("largest subarray with sum as k = " + ans);
    }
}
