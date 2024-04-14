//Write a program for method overriding

public class MethodOverriding {
    public static void main(String args[]) {
        Deer dobby = new Deer();
        dobby.eats();// exists in both but called for child as the object is of child class
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

class Deer extends Animal {
    void eats() {
        System.out.println("Eats grass");
    }

}