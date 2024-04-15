//Write a program to use the super keyword

public class SuperKeyword {
    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor is called");
    }
}

class Horse extends Animal {

    Horse() {
        super(); //write inside constructor
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}