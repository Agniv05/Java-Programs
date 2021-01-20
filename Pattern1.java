import java.util.*;
class Pattern1
{
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter th total no. of lines : ");
        int n = sc.nextInt();
        
        int nos,i,j,k;
        for(i=1;i<n;i++)
        {
            //loop for printing spaces before each row
            //no. of spaces = total line no.(n)-current line no.(i)
            nos=n-i;
            for(k=1;k<=nos;k++)
                System.out.print("  ");
            
            //loop to print a "*" and "$"
            for(j=1;j<=i;j++)
            {
                if(j==i)
                    System.out.print(" * ");
                else
                    System.out.print(" * $");
            }
            System.out.println();
            Thread.sleep(1000);
        }
        for(i=1;i<=(n*2)-1;i++)
            System.out.print(" ?");
    }
}