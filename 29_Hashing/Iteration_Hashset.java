import java.util.HashSet;
import java.util.Iterator;

public class Iteration_Hashset {
    
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Bengaluru");

        
        // for (String city : cities) {
        //     System.out.println(city);
        // }


        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
