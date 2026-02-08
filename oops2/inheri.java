package oops2;

public class inheri {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
        Dog dobb = new Dog();
        dobb.eat();
    }
}

class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breathes");;
    }
}

class fish extends Animal{
    int fins;

    void swim() {
        System.out.println("it can swim in water");
    }
} 

class mammal extends Animal {
    int legs;
}

class bird extends Animal{
    void fly() {
        System.out.println("fly");
    }
}

class Dog extends mammal{
    String breed;
}
