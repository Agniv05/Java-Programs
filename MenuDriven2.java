import java.util.*;
class MenuDriven2
{
    public static void main(String args[])
    {
        System.out.println("1.SERIES_1");
        System.out.println("x^1 - x^2 + x^3 - x^4 + ........... x^n");
        System.out.println("\n2.SERIES_2");
        System.out.println("1/2 + 2/3 + 3/4 + ...........+x");
        
        Scanner sc= new Scanner(System.in);
        System.out.print("\n\n\nYour Choice:");
        
        System.out.println("\n\n**************************************\n\n");
        int ch= sc.nextInt();
        float a=1,b=2;
        switch(ch)
        {
            case 1:System.out.println("Enter value for x :");
                   int x = sc.nextInt();
                   System.out.println("Enter value for n :");
                   int n = sc.nextInt();
                   int s=0;
                   int c=1;
                   while(c<=n)
                   {
                       s= (int)((x*a)-(x*b));
                       c++;
                       a++;
                       b++;
                   }
                   System.out.println(s);
                   break;
            case 2:System.out.println("Enter value for x :");
                   int y = sc.nextInt();
                   System.out.println("Enter value for n :");
                   int m = sc.nextInt();
                   float d=0;
                   int e=1;
                   while(e<=m)
                   {
                       d= d+(a/b);
                       e++;
                       a++;
                       b++;
                   }
                   System.out.println(d);
                   break;
            default :
                System.out.println("***********invalid input**********");
        }
    }
}