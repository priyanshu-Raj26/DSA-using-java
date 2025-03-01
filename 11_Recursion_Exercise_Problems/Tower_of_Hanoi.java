public class Tower_of_Hanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        
        // Move n-1 disks from src to helper using dest as auxiliary
        towerOfHanoi(n-1, src, dest, helper);
        
        // Move nth disk from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        
        // Move n-1 disks from helper to dest using src as auxiliary
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }
}