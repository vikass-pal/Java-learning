package oops2;

public class classessandObj {

    // classes and objects
    // objects= entities in irl
    // classes = group of these entities
    public static void main(String[] args) {
        //  static = access specifier 
        // public = access modifer

        pen p1 = new pen(); 
        p1.setColor("blue"); 
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        // BankAccount acc = new BankAccount();
        // acc.username = "viks";
    }
}

class pen{
    private String color;
    private int tip;

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

class student{
    String name;
    int age;
    float percentage;

    void percent(int math,int phy,int chem) {
        percentage = (phy+math+chem) /3;
    }
}

// class BankAccount{
//     public String username;
//     private String password;
//     public void setPass(String pwd) {
//         password = pwd;
//     }
// }


