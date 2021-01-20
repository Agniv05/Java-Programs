import java.util.Scanner;
public class StringPatternAdway
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str = sc.nextLine();

        int len = str.length();
        if (len%2 == 0) {
            System.out.println("Please enter a word with odd number of characters!!!");
        }
        else {
            int tln = (int)Math.ceil((double)len/2);
            int l = len/2;
            int r = (len/2) + 1;
            for (int i=0; i<tln; i++) {

                //Printing the spaces
                for (int j = i; j<tln ; j++) {
                    System.out.print(" ");
                }

                //Printing the Substring
                System.out.print(str.substring(l,r));
                l--;
                r++;
                System.out.println();
            }
        }

    }
}
