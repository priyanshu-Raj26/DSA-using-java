import java.util.ArrayList;

public class Pair_sum02 {
    
    public static boolean PairSum(ArrayList<Integer> list, int target) {
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i+1)) {  // breaking point
                bp = i;
                break;
            }
        }

        int lp = bp+1;  //samllest
        int rp = bp;  //largest

        while (lp != rp) {
            int n = list.size();
            if (list.get(rp) + list.get(lp) == target) {
                return true;
            } else if (list.get(rp) + list.get(lp) < target) {
                lp = (lp+1)%n;
            }else {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
        
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(PairSum(list, target));
    }
}
