public class MethodOverriding {
    public static void main(String[] args) {
        Dear dee = new Dear();
        dee.eat();
        // System.out.println("Deer is a type of Animal." + dee.eat());
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}
class Dear extends Animal {
    void eat() {
        System.out.println("Deer is grazing...");
    }
}
