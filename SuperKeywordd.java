public class SuperKeywordd {
    public static void main(String[] args) {
        Horse horse = new Horse();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // Calls the constructor of the superclass Animal
        System.out.println("Horse constructor called");
    }
}
