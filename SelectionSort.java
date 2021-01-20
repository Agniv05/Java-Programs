import java.util.*;
class SelectionSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[10];
        boolean flag = true;
        
        System.out.println("Enter ten Items: ");
        for (int i=0;i<10;i++)
        {
            System.out.print("Enter items "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Items before sorting ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        int min , t ;
        for(int i = 0 ; i<arr.length -1 ; i++)
        {
            min = i;
            for(int j = i+1 ; j<arr.length ; j++)
            {
                if(arr[j]<arr[min])//for descending order use "arr[j]>arr[min]"
                {
                    min = j;
                }
            }
            t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
        System.out.println("\nArray Items after sorting ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}