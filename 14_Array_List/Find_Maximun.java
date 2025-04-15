import java.util.ArrayList;

public class Find_Maximun {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);  //O(1)
        list.add(2);
        list.add(9);
        list.add(18);
        list.add(12);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        
        System.out.println("Maximum elements is: " + max);
    }
}
