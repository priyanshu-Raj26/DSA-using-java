// Swap two numbers without using two variable?

public class Problem_02 {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swaping:- ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        a = a^b;
        b = a^b;
        a = a^b;
        
        System.out.println("After Swaping:- ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
