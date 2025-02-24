public class Hierarcial_Inheritance {
    
    public static void main(String[] args) {
        // Any object we make, can use animal class
    }    
}



// Base class 
class Animal {
    String color;
    
    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flys");
    }
}