//Write a program to create abstract class and implementation

public class AbstractClass {
    public static void main(String args[]) {
        // cannot create an instance of abstract class

        Horse h = new Horse();
        h.eats();
        h.walks();
        System.out.println(h.skinColor);

        Chicken c = new Chicken();
        c.eats();
        c.walks();
        System.out.println(c.skinColor);

    }
}

abstract class Animal {
    String skinColor;

    // creating the constructor or abstract class to intialise some properties
    Animal() {
        skinColor = "Brown"; // so all sub class object will by default have this value of property
    }

    void eats() { // non abstract method
        System.out.println("Eats");
    }

    abstract void walks(); // abstract method , only idea no implementation
}

class Horse extends Animal { // this is a subclass and has to implement the above abstract method
    void walks() {
        System.out.println("Walks on 4 legs");
    }

    void changeSkinColor() {
        skinColor = "dark brown";
    }

}

class Chicken extends Animal {
    void walks() {
        System.out.println("Walks on 2 legs");
    }

    void changeSkinColor() {
        skinColor = "yellow";
    }
}