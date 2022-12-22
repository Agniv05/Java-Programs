import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to be reversed ");
        String str = sc.nextLine();
        for(int  i = str.length()-1; i >=0 ; i--)
            System.out.print(str.charAt(i));
    }
}
