//Write a program for types of constructors and constructor overloading as an example of polymorphism

public class ConstructorOverloading {
    public static void main(String args[]) {
        Animal a1 = new Animal(); // non parameterised will be called
        System.out.println(a1.name);
        Animal a2 = new Animal("Horse"); // single parameter constructor will be called
        System.out.println(a2.name);
        Animal a3 = new Animal(300);// single parameter constructor will be called
        System.out.println(a3.speciesNumber);
        Animal a4 = new Animal("lion", 200);// double parameter constructor will be called
        System.out.println(a4.name);
        System.out.println(a4.speciesNumber);

    }
}

class Animal {
    String name;
    int speciesNumber;

    Animal() { // non parameterised constu
        System.out.println("Constructor for class Animal is called");
    }

    Animal(String name) {// single parameter constructor
        System.out.println("Constructor 1 is called");
        this.name = name;
    }

    Animal(int speciesNumber) {// single parameter constructor
        this.speciesNumber = speciesNumber;
        System.out.println("Constructor 2 is called");
    }

    Animal(String name, int speciesNumber) {// double parameter constructor
        this.name = name;
        this.speciesNumber = speciesNumber;
        System.out.println("Constructor 3  is called");
    }
}
