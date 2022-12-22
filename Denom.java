import java.util.Scanner;

public class Denom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = {"one","two","three","four","five","six","seven","eight","nine"};
        System.out.println("Enter the bill ammount : ");
        int amt = sc.nextInt();
        String num = String.valueOf(amt);
        int n =0;
        for(int i = 0; i<num.length() ;i++){
            n = (int)num.charAt(i);
            System.out.print(n);
            System.out.println(str[n]);
        }
        int [] var1;
        var1 = new int[2];
    }
}
