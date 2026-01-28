package interfaces;

import interfaces.animals.Animal;
import interfaces.animals.Dog;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        Animal.info();
        d.run();
        d.sleep();
    }
}
