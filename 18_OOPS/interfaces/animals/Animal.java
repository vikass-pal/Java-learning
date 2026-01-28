package interfaces;

public interface Animal {
    public int maxage = 50;
   public abstract void eat(); 
   void sleep();
   public static void info() {
    System.out.println("this is an animal");
   }
   default void run() {
    System.out.println("animal is running");
   }
} 
