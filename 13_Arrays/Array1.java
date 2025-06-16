import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        // Array creation
        // int number[] = new int[50];
        // int morenum[] = {1,2,3};
        // String fruit[] = {"apple", "mango"};

        // Array inputs

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // to know the length of an array
        System.out.println("length of array" + marks.length);

        System.out.println("phy" + marks[0]);
        System.out.println("chem" + marks[1]);
        System.out.println("math" + marks[2]);

        // to update an array element
        marks[1] = 100;
        System.out.println("Updated chem marks: " + marks[1]);
        // or
        
        marks[2] = marks[2] + 10;
        System.out.println("Updated math marks: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2] ) / 3;
        System.out.println("percentage: " + percentage + "%");
    }
}
