public class Inheritancee {
    public static void main(String[] args) {
       Fish Salmon = new Fish();
       Salmon.eat(); 

       Dog dob = new Dog();
       dob.eat();
       dob.legs = 4; 
       dob.breed = "Labrador";
       System.out.println("Dog breed: " + dob.breed + dob.legs);

    }
}
// Base class  
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

class Mammal extends Animal {
    int legs;
}
class Dog extends Mammal {
    String breed;
}
