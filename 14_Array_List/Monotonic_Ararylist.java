import java.util.*;

public class Monotonic_Ararylist {
    
    public static boolean isMonotonic(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= list.get(i+1) || list.get(i) >= list.get(i+1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);

        System.out.println(isMonotonic(list));
    }
}
