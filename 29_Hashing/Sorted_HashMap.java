import java.util.HashMap;
import java.util.TreeMap;

public class Sorted_HashMap {
    
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Indonesia", 6);
        tm.put("Us", 150);
        
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Indonesia", 6);
        hm.put("Us", 50);

        System.out.println(hm);
        System.out.println(tm);  //TreeHashMap        
    }
}
