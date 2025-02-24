public class Constructor_Chaining {
    
    public static void main(String[] args) {
        Example obj = new Example();
    }
}


class Example {
    Example() {
        this(10);  // Calls the constructor with int parameter
        System.out.println("Default Constructor");
    }

    Example(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

}