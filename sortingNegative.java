import java.util.*;
class sortingNegative 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        for(int i = 0 ; i < s ; i++ )
        {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int positive[] = new int[s];
        int negative[] = new int[s];
        int cp = 0 ,cn = 0 ;
        for(int i = 0 ; i < s ; i++ )
        {
            if(arr[i] < 0)
            {
                negative[cn] = arr[i];
                cn++;
            }  
            else
            {
                positive[cp] = arr[i];
                cp++;
            }
        }
        int c = 0;
        for(int i = 0 ; i < cp ; i++)
        {
            arr[c++] = positive[i];
        }
        for(int i = 0 ; i < cn ; i++)
        {
            arr[c++] = negative[i];
        }
        System.out.println("The modified array : ");
        for(int i = 0 ; i < s ; i++ )
        {
            System.out.print(arr[i]+" ");
        }
    }
}