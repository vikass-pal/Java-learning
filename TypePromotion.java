import java.util.*;

public class TypePromotion {
    public static void main(String[] args) {
        int a = 10;
        float b = 11.2f;
        double c = 12.5;
        long d = 30;

        double ans = a+b-c*d;
        System.out.println(ans);
}
}
