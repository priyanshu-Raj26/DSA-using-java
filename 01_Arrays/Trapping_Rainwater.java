public class Trapping_Rainwater {

    public static int TrappingRainwater(int array[]) {
        int Lm[] = new int[array.length];
        int Rm[] = new int[array.length];

        int temp1 = 0;
        for (int i = 0; i < array.length; i++) {
            Lm[i] = Math.max(array[i],temp1);
            temp1 = Lm[i];
        }
        
        
        int temp2 = 0;
        for (int i = array.length-1; i > -1; i--) {
            Rm[i] = Math.max(array[i],temp2);
            temp2 = Rm[i];
        }
        
        int s = 0;
        for (int i = 0; i < Rm.length; i++) {
            int MinValue = Math.min(Lm[i], Rm[i]);
           s +=  MinValue - array[i];
        }
        
        return s;
    }
    
    public static void main(String[] args) {
        int array[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Rainwater is: "+  TrappingRainwater(array));
    }
}
