import java.util.*;
class Que7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 eqaution");
        System.out.println("2 triangle");
        System.out.println("Enter choice ");
        int n = sc.nextInt();
        switch (n)
        {
            case 1 :
                float y = 5.5f;
                System.out.println("The values of z are : ");
                float z ;
                for(int x = -10 ; x<=10 ; x = x+2 )
                {
                    z = ((float)Math.pow(x,2) + 0.5f*x)/y ;
                    System.out.println("\n"+z);
                }
                break;
            case 2 :
                int c = 1;
                System.out.println("Enter limit ");
                int lim = sc.nextInt();
                for(int i = 1; i<=lim ; i++)
                {
                    for(int j = 1; j<=i ; j++)
                    {
                        System.out.print(c++ +" ");
                    }
                    System.out.println();
                }
                break;
            default :
                System.out.println("INVALID INPUT");
        }
    }
}