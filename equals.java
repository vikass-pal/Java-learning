public class equals {
    public static void main(String[] args) {
        String s1= "Helo";
        String s2= "Helo";
        String s3 = new String("Helo");

        if(s1 == s2) {
            System.out.println("they are eqal");
        }
        else{
            System.out.println("they are not equal");
        }

        if(s1 == s3) {
            System.out.println("they are eqal");
        }
        else{
            System.out.println("they are not equal");
        }
//  for eqauls
        if(s1.equals(s3)) {
            System.out.println("they are eqal");
        }
        else{
            System.out.println("they are not equal");
        }
    }
}
