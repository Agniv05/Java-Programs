import java.util.*;
class BubbleSort15elm
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[15];
        for(int i = 0; i < n.length ; i++)
        {
            System.out.print("Enter value for "+(i+1)+" : ");
            n[i]=sc.nextInt();
        }
        //bubble sort
        int t;
        for(int i = 0; i < n.length-1 ; i++)
        {
            for(int j = 0; j< (n.length-1-i); j++)
            {
                if(n[j] > n[j+1])
                {
                    t = n[j];
                    n[j] = n[j+1];
                    n[j+1] = t;
                }
            }
        }
        System.out.println("Elements after sorting : ");
        for(int i = 0; i < n.length ; i++)
        {
            System.out.print(n[i]+"  ");
        }
    }
}