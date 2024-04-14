//Write a program for single level inheritance
public class SingleLevelInheritance {
    public static void main(String args[]) {
        Laptop HP = new Laptop();
        HP.isrepairable();
    }
}

class Electronics {
    String company;

    void isrepairable() {
        System.out.println("It is repairable");
    }
}

class Laptop extends Electronics {
    int storage;

    void hasGuarantee() {
        System.out.println("Has Guarantee of 50 years");
    }
}