import java.util.*;
class ThreeDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array limit :");
        int arr[]= new int[sc.nextInt()];
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print("Enter value for "+(i+1)+": ");
            arr[i]= sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++)
        {
            int num = arr[i];
            int c = 0;
            while(num>0)
            {
                num = num /10;
                c++;
            }
            if(c!=3)
            {
                System.out.println("\nAll the numbers in the array are not 3 digit");
                System.exit(0);
            }
        }
        System.out.println("\nAll the numbers in the array are 3 digit");
    }
}