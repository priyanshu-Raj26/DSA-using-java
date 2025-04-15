import java.util.ArrayList;

public class Pair_sum_Pointer_Approach {  //o(n)
    
    public static boolean PairSum(ArrayList<Integer> list, int target) {
        int Lp = 0;
        int Rp = list.size()-1;

        while (Lp != Rp) {
            if (list.get(Rp) + list.get(Lp) == target) {
                return true;
            } else if (list.get(Rp) + list.get(Lp) < target) {
                Lp++;
            }else {
                Rp--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(PairSum(list, target));
    }
}
