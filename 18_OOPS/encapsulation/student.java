package encapsulation;

public class student {
    private String name;
    private int age;
   private int roll;

   public void setage(int age) {
    if(age <0) {
        age = 0;

    }
    this.age = age;
   }
   public void setName(String name) {
    
    this.name = name;
   }
}
