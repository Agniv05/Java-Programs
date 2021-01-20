import java.util.*;
class BubbleSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[40];
        boolean flag = true;
        
        System.out.println("Enter ten Items: ");
        for (int i=0;i<40;i++)
        {
            System.out.print("Enter items "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Items before sorting ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        int t ;
        for(int i = 0 ; i<arr.length-1 ; i++)
        {
            for(int j = 0 ; j<(arr.length-1-i) ; j++)
            {
                if(arr[j]>arr[j+1])//for descending order use "arr[j]<arr[j+1]"
                {
                    t=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("\nArray Items after sorting ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}