//Write a program for shallow and deep copy

public class ShallowAndDeepCopy {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Rishika";
        s1.roll = 13;
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;

        Student s2 = new Student(s1);

        s1.marks[1] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.print(s2.marks[i] + " ");
        }
    }
}

class Student {
    String name;
    int marks[];
    int roll;

    Student() {
        System.out.println("Constructor is called");
        marks = new int[3];
    }

    // this is a shallow copy constructor changes will reflect
    // Student(Student s1){
    // marks=new int[3];
    // this.name=s1.name;
    // this.roll=s1.roll;
    // this.marks=s1.marks;
    // }

    // this is the deep copy and changes will not reflect

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}