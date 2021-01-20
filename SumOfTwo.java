import java.util.*;
class SumOfTwo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array limit : ");
        int n1[]= new int[sc.nextInt()];
        int n2[]= new int[n1.length];
        System.out.println("\nEnter values for 1st array: ");
        for (int i = 0;i<n1.length;i++)
        {
            System.out.print("Enter value for index "+i+": ");
            n1[i]=sc.nextInt();
        }
        System.out.println("\nEnter values for 2nd array: ");
        for (int i = 0;i<n2.length;i++)
        {
            System.out.print("Enter value for index "+i+": ");
            n2[i]=sc.nextInt();
        }
        int sum[] =new int[n1.length];
        for (int i = 0;i<sum.length;i++)
        {
            sum[i]= n1[i]+n2[i];
        }
        System.out.println("\nThe sum array:  ");
        for (int value : sum)
        {
            System.out.print(value+" ");
        }
    }
}