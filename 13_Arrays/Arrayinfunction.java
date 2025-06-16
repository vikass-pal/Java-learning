public class Arrayinfunction {
    public static void update(int marks[], int nonchangeable) {
        for(int i=0; i<marks.length;i++) {
            marks[i] = marks[i] + 1;
        }
        nonchangeable = nonchangeable + 10;
         // This won't affect the original variable in main
    }
    
    public static void main(String[] args) {
        int marks[] = {95,90,31};
        int nonchangeable = 5;
        update(marks,nonchangeable);
         System.out.println(nonchangeable); //this non changeable value will not change 
        for(int i=0; i<marks.length;i++) {
           System.out.println(marks[i]);
        }
       
    }
}
