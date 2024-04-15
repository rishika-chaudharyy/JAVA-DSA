//Write a prgram to perform multiple inheritance using interface

public class MultipleInheritanceWithInterface {
    public static void main(String args[]) {
        Bear boba = new Bear();
        boba.eatsGrass();
        boba.eatsMeat();
    }
}

interface Herbivore {
    void eatsGrass();
}

interface Carnivore {
    void eatsMeat();
}

class Bear implements Herbivore, Carnivore { //multiple inheritance
    public void eatsGrass() {
        System.out.println("Eats grass");
    }

    public void eatsMeat() {
        System.out.println("Eats meat");
    }
}