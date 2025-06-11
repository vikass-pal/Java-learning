public class CharacterPattern {
    public static void main(String[] args) {
        int n = 4;
        char ch= 'A';
// outerloop
        for(int line=1;line<=n;line++) {
            // innerloop
            for(int chars=1;chars<=line;chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        } 
    }



}

// Output:
// A
// BC
// DEF
// GHIJ
