public class SubStringss {
    public static String subStr(String str, int si,int ei) {
        String Sub = "";

        for(int i=si;i<ei;i++) {
            Sub = Sub + str.charAt(i);
        }
        return Sub;
    }
    public static void main(String[] args) {
        String str = "HELLOWORLD";
        // Shortcut/
    //    System.out.println(str.substring(0, 4));
        System.out.println( subStr(str, 0, 4));
        
    }
}
