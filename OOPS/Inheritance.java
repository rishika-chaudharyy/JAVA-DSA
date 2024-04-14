//Write a program to make one class inherit property and methods from other class

public class Inheritance {
    public static void main(String args[]) {
        Mammal raccoons = new Mammal();
        raccoons.breaths();
    }
}

// parent/base class
class Animal {
    String color;

    void eats() {
        System.out.println("Eats");
    }

    void breaths() {
        System.out.println("Breaths");
    }
}

// child/derives/subclass

class Mammal extends Animal {
    String species;

    void isOmnivores() {
        System.out.println("It is omnivores mammal");
    }
}