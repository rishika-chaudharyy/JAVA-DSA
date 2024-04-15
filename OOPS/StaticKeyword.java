//Write a program for static keyword

public class StaticKeyword {
    public static void main(String args[]) { // this is alwasy static
        Student s1 = new Student();
        s1.schoolName = "SDA";
        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "NIPS";
        System.out.println(s1.schoolName);
    }

}

class Student {
    int marks;
    String name;

    static int returnPercentage(int math, int sci, int evs) {// static method , implementation stays same not value
        return (math + sci + evs) / 3;
    }

    static String schoolName; // this is a static property , value stays same
}