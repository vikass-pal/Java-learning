import java.util.*;
public class Stringin {
   public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
String input = sc.nextLine();

ArrayList<String> arr = new ArrayList<>();


if (!input.isEmpty()) {

    // Remove brackets if present
    input = input.replace("[", "").replace("]", "");

    // Split by comma OR space
    String[] parts = input.split("[,\\s]+");

    for (String s : parts) {
        if (!s.isEmpty()) {
            arr.add(s);
        }
    }
}
    System.out.println(arr);
   }
}


abstract class shape {
 abstract void area();
}

class circle extends shape{
void area() {
    print("area of circle")
}
} 
class rectangle extends shape{
    void area() {
        print("area of rectange")
    }
    
}


interface Driveable{
    void drive();
}

class Car implements Driveable{
    public void drive() {
        System.out.print("Car drive");
    }
}

class Bike implements Driveable{
    public void drive() {
        System.out.print("bike drive");
    }
}
