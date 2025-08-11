public class ClassandObjectt {
    public static void main(String[] args) {
        // Creating an object of ClassA
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println("Pen color: " + p1.color);
        p1.setTip(5);
        System.out.println("Pen tip: " + p1.tip);
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Vkas";
        // myAcc.password = "12345"; // This line will cause an error if password is private
        myAcc.setPassword("newPassword");
    }
    
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String newPassword) {
        password = newPassword;
    }
}

class Pen{
    String color;
    int   tip;
 
    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
