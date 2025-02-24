public class Inheritance {
    
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        dog dobby = new dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
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
    int legs;
}

class dog extends Mammal {
    String breed;
}


// // Derived class // subclass
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swims in water");
//     }
// }