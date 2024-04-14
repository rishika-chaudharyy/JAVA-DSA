//Write a program for multi level inheritance

public class MultiLevelInheritance {
    public static void main(String args[]) {
        Dog mat = new Dog();
        mat.breaths();
        mat.legs = 4;
        System.out.println(mat.legs);
        mat.breed = "corgi";
        System.out.println(mat.breed);
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

class Mammal extends Animal {
    String species;
    int legs;
}

class Dog extends Mammal {
    String breed;
}