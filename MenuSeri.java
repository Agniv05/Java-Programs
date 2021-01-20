import java.util.*;
class MenuSeri
{
    public static void main(String args[])
    {
        System.out.println("1)   1/4 + 1/8 + 1/12 + ...........+n");        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of n :");
        int n= sc.nextInt();
        double c = 4.0;
        double sum = 0;
        for(int i = 1 ; i<=n ; i++)
        {
            sum = sum + 1/c;
            c += 4.0 ;
        }
        System.out.println("The sum of series upto "+n+" terms : "+ sum);
    }
}