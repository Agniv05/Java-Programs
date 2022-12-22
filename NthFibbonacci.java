import java.util.Scanner;
public class NthFibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NthFibbonacci ob = new NthFibbonacci();
        System.out.println("Enter the nth position value : ");
        int n = sc.nextInt();
        if(ob.isPrime(ob.fib(n)))
            System.out.println("Yes the "+n+"th value is prime");
        else
            System.out.println("No the "+n+"th value is not prime");
    }
    int fib(int n) // counts till fibbonacci recursively
    {
        if (n==0||n==1)
            return 0;
        else if(n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
    boolean isPrime(int n){ //checks for the nth
        for (int i = 2; i<=n/2;i++)
        {
            if (n%i ==0)
                return false ;
        }
        return true;
    }
}