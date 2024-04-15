//Write a program for constructor heirarchy

public class ConstructorHierarchy {
    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.color = "brown";
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Base class constructor is first called");
    }

    void eats() {
        System.out.println("Eats");
    }

    void breaths() {
        System.out.println("Breaths");
    }
}

class Mammal extends Animal {

    Mammal() {
        System.out.println("Mammal or derived class constructor is called next");
    }

    String species;
    int legs;
}

class Dog extends Mammal {
    Dog() {
        System.out.println("Another constructor is called");
    }

    String breed;
}