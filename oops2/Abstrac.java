package oops2;

public class Abstrac {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        //     c.eat();
        //     c.walk();

        Mustang myHorse = new Mustang();
        
        

    }
}

abstract class Animal{
    String color ;
    Animal() {
        color = "brown";
    }
    void eat() {
        System.out.println("this can eat");
    }
    abstract void walk();
}

 class Horse extends Animal{
    Horse() {
        System.out.println("horse constructor calles");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs"); 
    }
}
 class Mustang extends Horse{
    Mustang() {
        System.out.println("mustang called");
    }
 }


 class Chicken extends Animal{
    void changeColor() {
        color = "Yellow";
    }
    void walk() {
        System.out.println("Walk on 2 legs");
    }
}