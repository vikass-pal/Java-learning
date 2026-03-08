package interfaces.animals;

public class Dog implements Animal {
    public void eat() {
        System.out.println("eating");
    }

    // @override
    public void sleep() {
        System.out.println("sleeping");
    }
}
