import java.util.*;
class SecondLargest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array limit : ");
        int n[]=new int[sc.nextInt()];
        System.out.println("\nEnter values for array: ");
        for(int i = 0; i<n.length ;i++)
        {
            System.out.print("Enter number for position "+(i+1)+" : ");
            n[i] = sc.nextInt();
        }
        int largest = n[0];
        int secondLargest =0;
        for(int  i = 0 ;i<n.length; i++)
        {
            if(n[i]>largest)
            {   
                secondLargest = largest;
                largest = n[i]; 
            }
            else if (n[i]>secondLargest)
            {
                secondLargest = n[i];
            }
        }
        System.out.println(largest);
        System.out.println("Second Largest : "+secondLargest);
    }
}