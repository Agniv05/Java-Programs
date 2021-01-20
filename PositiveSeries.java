import java.util.*;
class PositiveSeries
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n ;
        while(true)
        {
            System.out.println("Enter the number of terms : ");
            n = sc.nextInt();
            if(n > 0)
                break;
            else
                System.out.println("***The Entry must be Positive***\n");
        }
        int sum =0;
        for(int i = 1 ; i <= n ; i++)
        {
            if(i%2 == 0)
                sum -= Math.pow(i,i);
            else
                sum += Math.pow(i,i);
        }
        System.out.println("The sum of the series is : "+sum);
    }
}