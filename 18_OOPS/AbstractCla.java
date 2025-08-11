public class AbstractCla {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        horse.walk();

        Chicken chicken = new Chicken();
        chicken.eat();
        chicken.walk();
        
    }
}

abstract class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse is walking..4.");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken is walking..2.");
    }
}

