// Convert uppercase charecter to lowercase using bit 

public class Problem_04 {
    
    public static void main(String[] args) {
        
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }
    }
}
