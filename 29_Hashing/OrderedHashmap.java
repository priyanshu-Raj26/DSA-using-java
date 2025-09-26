import java.util.HashMap;
import java.util.LinkedHashMap;

public class OrderedHashmap {
    
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Us", 150);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);

        System.out.println(hm);
        System.out.println(lhm);  //LinkedHashMap

    }
}
