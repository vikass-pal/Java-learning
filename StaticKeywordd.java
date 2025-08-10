public class StaticKeywordd {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.schoolName = "ABC High School";
        Student student2 = new Student();
        System.out.println("Student 2 School: " + student2.schoolName);
        // System.out.println("Student 2 School: " + student2.schoolName);
        Student student3 = new Student();
        student3.schoolName = "XYZ High School";

    } 
}
class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}
