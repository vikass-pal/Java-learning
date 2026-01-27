 class file{
    // Polymorphism is a core concept in oops that allow to 
    // do different things based on the object it is acting upon,
    // even though the method 
    // might be the same;

    // this is compile time polymorphism//overloading
    public int add(int a,int b) {
        return a+b;
    }
    public int add(int a,int b,int c) {
        return a+b+c;
    }
    public double add(double a,double b) {
        return a+b;
    }
}
public class main{
    public static void main(String[] args) {
        file f = new file();
        System.out.println(f.add(3,4));
    }
}