package oops2;

public class interfacee {
    public static void main(String[] args) {
       Queen q = new Queen() ;
       q.move(); 
    }
}

interface herbivore{
    void eat() ;

}
interface carnivore{
    void eat();
}
class Bear implements herbivore,carnivore {
    public void eat() {
        System.out.println("bear can eat both");
    }
}

interface chess{
    void move();
}

class King implements chess{
    public void move() {
        System.out.println("up,down,lef,ri");
    }
}
class Rook implements chess{
    public void move() {
        System.out.println("up,down");
    }
}

class Queen implements chess{
    public void move() {
        System.out.println("All");
    }
}