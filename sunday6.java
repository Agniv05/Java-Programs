

 /*   
    5
   44
  333
 2222
11111*/
import java.util.*;
class sunday6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int n=sc.nextInt();

        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {



                    System.out.print(" ");
                }
                for(k=1;k<=i;k++)
                {
                    System.out.print(n-i+1);
                }







                   System.out.println();
                }
            }

        }
        