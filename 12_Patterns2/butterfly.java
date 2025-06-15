public class butterfly {

    public static void butterflyy(int n) {
        // 1st half
        for(int i =1; i<=n;i++) {
            // for stars
            for(int j=1;j<=i ; j++) {
                 System.out.print("*");
            }
            // for spaces
            for(int j=1; j<=2*(n-i) ; j++){
                System.out.print(" ");
            }
            // for stars again
            for(int j=1;j<=i ; j++) {
                System.out.print("*");
           }
           System.out.println();
        }
        // for 2nd half
         for(int i=n; i>=1; i--) {
            for(int j=1;j<=i ; j++) {
                System.out.print("*");
           }
           // for spaces
           for(int j=1; j<=2*(n-i) ; j++){
               System.out.print(" ");
           }
           // for stars again
           for(int j=1;j<=i ; j++) {
               System.out.print("*");
          }
          System.out.println();
         }
         System.out.println();
    }
    
    public static void main(String[] args) {
        butterflyy(5);
    }
}



    
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
