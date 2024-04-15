//Write a program to create a constructor

public class Constructors {
    public static void main(String args[]) {
        Pen saino = new Pen("black", 6);
        System.out.println(saino.color);
        System.out.println(saino.tipSize);

    }
}

class Pen {
    String color;
    int tipSize;

    Pen(String color, int tipSize) {
        System.out.println("Constructor is called at the time of object creation");
        this.color = color;
        this.tipSize = tipSize;
    }
}