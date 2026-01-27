public class child extends parent{
    public child(String name,int age){
        super(name,age); //this is normally hidden and it reffers to parent class
        System.out.println("Child is called")
    }
}