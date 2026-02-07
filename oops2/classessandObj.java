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
        System.out.println(p1.color);
    }
}

class pen{
    String color;
    int tip;

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
