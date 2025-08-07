public class Constructorr {
    public static void main(String[] args) {
        // Creating an instance of Student using the default constructor
        Student s = new Student();
        Student s1 = new Student("John");
        Student s2 = new Student(123);
        System.out.println("Student name: " + s1.name);
    }
}

class Student {
    String name;
    int roll;
    Student() {
        System.out.println("Constructor");
    }
//  paramerterized constrictor
    Student(String name) {
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }
}
 