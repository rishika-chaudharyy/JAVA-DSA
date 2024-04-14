//Write a program to demonstrate method overloading

public class MethodOverloading {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(4, 5));
        System.out.println(calc.sum(4, 5, 6));
        System.out.println(calc.sum((float) 4.5, (float) 6.7));
        System.out.println(calc.sum((float) 4.5, (float) 6.7, (float) 7.9));
    }
}

//it automatically matches according to the parameters

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }

    float sum(float a, float b, float c) {
        return a + b + c;
    }
}