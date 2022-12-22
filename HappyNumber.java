import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber ob = new HappyNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked : ");
        int n = sc.nextInt();
        while(true){
            n = ob.digSq(n);
            int bk =n;
            int noofdig = 0;
            while (bk>0){
                bk =bk/10;
                noofdig++;
            }
            //System.out.println(noofdig); check
            if(n == 1) {
                System.out.println("The number is Happy :D ");
                System.exit(0);
            } else if (n>1 && n<10) {
                System.out.println("The number is not Happy :( ");
                System.exit(0);
            }
        }
    }
    int digSq(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (int) Math.pow(n % 10, 2);
            n = n / 10;
        }
        return sum;
    }
}
