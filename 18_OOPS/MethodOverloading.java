public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 5 and 10: " + calc.sum(5, 10));
        System.out.println("Sum of 5.5 and 10.5: " + calc.sum(5.5, 10.5));
        System.out.println("Sum of 5, 10, and 15: " + calc.sum(5, 10, 15));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
    double sum(double a, double b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}