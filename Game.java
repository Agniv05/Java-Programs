import java.util.*;
class Game
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int baln = 0;
        int n = 1 + (int)(Math.random() * ((6 - 1) + 1));
        while(true)
        {
            System.out.println("result after rolling dice : "+ n);
            if(n == 2 || n==4 || n==6)
                baln += n; 
            if(n == 1 || n==3 || n==5)
                baln -= n; 
            System.out.println("Balance : "+baln);
            System.out.println("\nIf you want to exit press N else press any key");
            char ch = sc.next().charAt(0);
            if(ch == 'N' || ch == 'n' )
                System.exit(0);
            n = 1 + (int)(Math.random() * ((6 - 1) + 1));
        }
    }
}