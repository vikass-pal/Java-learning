public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(2);
        d.setName("bob");
        d.sayHello();
        Animal dog = new Dog();  //upcasting
        dog.sayHello();
    }
}
