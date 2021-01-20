import java.util.*;
class EqualArrays
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array limit : ");
        int n1[]=new int[sc.nextInt()];
        
        System.out.println("\nEnter values for array: ");
        for(int i = 0; i<n1.length ;i++)
        {
            System.out.print("Enter number for position "+(i+1)+" : ");
            n1[i] = sc.nextInt();
        }
    }
}