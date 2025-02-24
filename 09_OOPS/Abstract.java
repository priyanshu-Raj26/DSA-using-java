public class Abstract {
    
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c  = new Chicken();
        // c.eat();
        // c.walk();

        // System.out.println(h.color);  // parent class called first

        // Animal a = new Animal();  cannot create as object

        Mustang myHorse = new Mustang();
        // Animal -> Hores -> Mustang
        
    }
}


abstract class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called...");
        // color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }
    
    abstract void walk();

}


class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called...");
    }

    void changeColor() {
        color = "dark brown";
    }
    
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called...");
    }
}


class Chicken extends Animal {
    void changeColor() {
        color = "Yellow";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}