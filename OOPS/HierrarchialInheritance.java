//Write a program for hierarchial inheritance

public class HierrarchialInheritance {
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.breaths();
        shark.swim();

        Bird cuckoo=new Bird();
        cuckoo.breaths();
        cuckoo.fly();
    }
}

class Animal{
    String color;
    void eats() {
        System.out.println("Eats");
    }

    void breaths() {
        System.out.println("Breaths");
    }

}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.err.println("Flies");
    }
}