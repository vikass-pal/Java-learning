public class HierarchialInheritancee {
    public static void main(String[] args) {
        
    }
}

class Animal {
    String color;
    void eat() {
        System.out.println("Eating...");
    }
    void breathe() {
        System.out.println("Breathing...");
    }
}
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("Swimming...");
    }
}
class Mammal extends Animal {
    int legs;
}
class Bird extends Animal {
    String jaat;
}
