import java.util.*;
class RemovingElement
{
    public static void main(int args[])
    {
        Scanner sc = new Scanner(System.in);
        //int arr[] = {1,2,3,48,4,87,25,48,34,4,2,0,0,1,87};
        System.out.println("The original arrray values are :-  ");
        for(int i =0 ; i<args.length ; i++ )
        {
            System.out.print(args[i]+"  ");
        }
        System.out.println("\nEnter the element to be removed : ");
        int element= sc.nextInt();
        int count = 0;
        for(int i = 0 ; i<args.length ; i++ )
        {
            if(args[i] == element )
                count++;
        }
        int arr2[] = new int[args.length - count];
        int k = 0;
        for(int i = 0 ; i<args.length ; i++ )
        {
            if(args[i] == element )
                continue;
            else
            {
                arr2[k++] = args[i];
            }
        }
        System.out.println("The new arrray values are :-  ");
        for(int i =0 ; i<arr2.length ; i++ )
        {
            System.out.print(arr2[i]+"  ");
        }
    }
}