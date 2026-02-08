package oops2;

public class constructorr {
    public static void main(String[] args) {

        // constructor overloading
        Student s1 = new Student();
        // Student s2 = new Student("viks");
        // Student s3 = new Student(123);
        s1.password = "abc";
        Student s2 = new Student(s1);
        s2.password = "xyz";
    }
}

class Student {
    String name;
    int roll;
    String password;

    // copy constructor 
    Student(Student s1) {
        this.name = name;
        this.roll = roll;
    }

    Student(String name) {
        this.name = name;
    }
    Student() {
        System.out.println();
    }
    Student(int roll) {
        this.roll = roll;
    }
}

