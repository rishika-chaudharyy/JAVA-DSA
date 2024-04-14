//Write a program for Hybrid inheritance

public class HybridInheritance {
    public static void main(String args[]) {
        Shark sumo = new Shark();
        sumo.breaths();
        sumo.swim();
        sumo.fins = 2;
        System.out.println(sumo.fins);

        Woodpecker cutie = new Woodpecker();
        cutie.eats();
        cutie.fly();
        cutie.layEggs();
    }
}

class Animal {
    String color;

    void eats() {
        System.out.println("Eats");
    }

    void breaths() {
        System.out.println("Breaths");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.err.println("Flies");
    }
}

class Shark extends Fish {
    int fins;
}

class Woodpecker extends Bird {
    void layEggs() {
        System.out.println("Lays eggs");
    }
}