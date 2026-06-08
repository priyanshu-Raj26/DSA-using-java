import java.util.*;

public class  TreeMap_Starting {
    public static void main(String[] args) {
        //Declare
        TreeMap<Integer, String> students = new TreeMap<>();

        //Insert Values
        //O(log n),  HM: O(1)
        students.put(5, "Manash");
        students.put(1, "Ishu");
        students.put(2, "Abhinav");
        students.put(6, "Sahil");
        students.put(10, "Mayank");
        students.put(12, "Krishna");
        
        // //HashMap but ordered
        // System.out.println(students);  //O(log n),  HM: O(1)

        // //containsKey()
        // System.out.println(students.containsKey(6));      //O(log n),  HM: O(1)
        // System.out.println(students.containsKey(9));

        // //Update
        // System.out.println(students.put(1, "Priyanshu Raj"));        //O(log n),  HM: O(1)
        
        // //Get
        // System.out.println(students.get(1));   //O(log n),  HM: O(1)

        // //Delete
        // students.remove(1);  //O(log n),  HM: O(1)
        // System.out.println(students.containsKey(1));    

        // //firstKey
        // System.out.println(students.firstKey()); //O(log n),  HM: O(n)

        // //lastKey
        // System.out.println(students.lastKey());   //O(log n),  HM: O(n)

        // //Celling
        // System.out.println(students.ceilingKey(11));  //if exists then return itself else just grater than that key
        // System.out.println(students.ceilingKey(6));

        // //floorKey
        // System.out.println(students.floorKey(3));   //O(log n),  HM: O(n)
        // System.out.println(students.floorKey(5));

        // //iterate
        // for (Integer k : students.keySet()) {  //O(n),  HM: O(n * logn)
        //     System.out.println(k);
        // }

        //iterate (with key-value)
        for(Map.Entry<Integer, String> e: students.entrySet()) {
            System.out.println(e);
            // System.out.print(e.getKey() + "=" );
            // System.out.println(e.getValue());

        }

    }

}
