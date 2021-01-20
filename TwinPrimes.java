import java.util.*;
class TwinPrimes
{
    static int n ;
    static boolean isPrime(int n)
    {
        for (int i = 2; i<=n/2;i++)
        {
            if (n%i ==0)
                return false ;
        }
        return true;
    }
    static boolean isTwinPrime(int n1, int n2) 
    { 
        return (isPrime(n1) && isPrime(n2) && (n1 - n2) == 2);
    }
    static void readData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();
    }
    static void showTwinPrime()
    {
       for(int i = 2; i<= n ; i++)
       {
           if(isTwinPrime(i,(i+2)))
               System.out.println(i+"/n"+(i+2));
       }
    }
    public static void main(String args[])
    {
        readData();
        showTwinPrime();
    }
}