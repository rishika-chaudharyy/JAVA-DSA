//Write a program to create classes and objects

public class CreatingClassesAndObjects {
    public static void main(String args[]) {

        // Creating the object

        Pen sainoPrimo = new Pen();

        sainoPrimo.color = "Pink"; // setting and printing the properties
        System.out.println(sainoPrimo.color);

        sainoPrimo.tipSize = 6;
        System.out.println(sainoPrimo.tipSize);

        // changing the properties using methods

        sainoPrimo.changeColor("Black");
        sainoPrimo.changeTip(7);

        System.out.println(sainoPrimo.color);
        System.out.println(sainoPrimo.tipSize);

    }
}

class Pen {
    String color; // these are the properties or attributes of class Pen
    int tipSize;

    void changeColor(String newColor) { // these are the methods of behaviour of class Pen
        color = newColor;
    }

    void changeTip(int newTipSize) {
        tipSize = newTipSize;
    }
}