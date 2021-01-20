import java.util.*;
class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[10];
        boolean flag = true;
        
        System.out.println("Enter items in assending order: ");
        for (int i=0;i<10;i++)
        {
            System.out.print("Enter item "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter number to search : ");
        int num = sc.nextInt();
        int l = 0;
        int u = arr.length - 1;
        while(l<u)
        {
            int mid = (l+u)/2;
            if(arr[mid] == num)
            {
                System.out.println("The number "+num+" was found at "+mid);
                flag = false ;                
                break;
            } 
            else if(arr[mid]<num)
            {
                l = mid;
            }
            else 
            {
                u = mid;
            }
        }
        if(flag)
            System.out.println("The number "+num+" was not found");
    }
}