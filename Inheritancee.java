public class Inheritancee {
    public static void main(String[] args) {
       Fish Salmon = new Fish();
       Salmon.eat(); 
    }
}
// Base clas
class Animal {
    String color;
    void eat() {
        System.out.println("Eating...");
    }
    void breathe() {
        System.out.println("Breathing...");
    }
}
// Derived class 
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("Swimming...");
    }
}
