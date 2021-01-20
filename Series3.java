import java.util.*;
class Series3
{
    public static void main(String args[])
    {
        Series3 ob = new Series3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice : ");
        System.out.println("1. 1/4 + 1/8 + 1/12 + ... upto n terms");
        System.out.println("1. 1/1! - 1/2! + 1/3! - ... upto n terms");
        System.out.print("Choice : ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 : 
                System.out.print("Enter the value of n : ");
                int n1 = sc.nextInt();
                double p = 4;
                double s1 = 0;
                for(int i = 1 ; i<=n1 ; i++)
                {
                    s1 = s1+(1/p);
                    p += 4;
                }
                System.out.println(s1);
                break;
            case 2:
                System.out.print("Enter the value of n : ");
                int n2 = sc.nextInt();
                double s2 = 0;
                for(int i = 1 ; i<=n2 ; i++)
                {
                    if(i % 2 == 0)
                    {
                        s2 = s2 - (double)i/(ob.factorial(i));
                    }
                    else
                    {
                         s2 = s2 + (double)i/(ob.factorial(i));
                    }
                }
                System.out.println(s2);
                break;
        }
    }
    int factorial(int n)
    {
        int p = 1 ;
        while(n>0)
        {
            p = p*n;
            n--;
        }
        return p ;
    }
}