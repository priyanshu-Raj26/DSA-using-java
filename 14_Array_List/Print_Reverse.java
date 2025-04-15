import java.util.ArrayList;

public class Print_Reverse {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);  //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = list.size()-1; i >= 0; i--) {  //O(n)
            System.out.print(list.get(i) + " ");
        }
    }
}
