//Write a program to demonstrate copy constructor

public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Rishika";
        s1.roll = 13;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;

        Student s2 = new Student(s1);
        s2.password = "xyzq";

        s1.marks[0] = 99;
        s1.marks[1] = 99;
        s1.marks[2] = 99;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i] + " ");
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called");
    }

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

}