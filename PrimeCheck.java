import java.util.*;
class PrimeCheck
{
    static boolean isPrime(int n)
    {
        for(int i =2;i<n;i++)
        {
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter upper range: ");
        int ur= sc.nextInt();
        System.out.print("enter lower range: ");
        int lr= sc.nextInt();
        while(lr<=ur)
        {
            if (isPrime(lr))
                System.out.println(lr);
            lr++;    
        }
    }
}