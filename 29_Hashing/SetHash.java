import java.util.HashSet;

public class SetHash {
    
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        //remove
        set.remove(2);
        if (set.contains(2)) {
            System.out.println("set contains 2");
        }

        //size
        System.out.println(set.size());

        //clear
        set.clear();
        System.out.println(set.size());

        //empty
        System.out.println(set.isEmpty());
       
    }
}
