import java.util.ArrayList;

public class Most_Water_Pointer_Approach {
 
    public static int Maxwater(ArrayList<Integer> height) {  //O(n)
        int Lp = 0;
        int Rp = height.size()-1;
        int Maxwater = 0;

        while (Lp<Rp) {
            // Calculate water area
            int width = Rp-Lp;
            int ht = Math.min(height.get(Rp), height.get(Lp));

            int currwater = ht * width;
            Maxwater = Math.max(Maxwater, currwater);

            //update pointer
            if (height.get(Lp) < height.get(Rp)) {
                Lp++;
            } else {
                Rp--;
            }
        }

        return Maxwater;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println(Maxwater(height));
    }

}
