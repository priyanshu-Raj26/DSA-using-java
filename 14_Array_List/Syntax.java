import java.util.ArrayList;

public class Syntax {

    public static void main(String[] args) {
        //java collection framework

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //Add element
        list.add(1);  //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9); //O(n)

        System.out.println(list);

        //Get element - O(1)
        // int element = list.get(2);
        // System.out.println(element);


        // //Remove element
        // list.remove(2);
        // System.out.println(list);


        // //Set element at index
        // list.set(2, 10);
        // System.out.println(list);

        
        // //Contains element
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
    }
}