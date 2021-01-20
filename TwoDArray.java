import java.util.*;
class TwoDArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i = 0 ; i<arr[0].length ; i++)
        {
            for(int j = 0 ; j<arr[0].length ; j++)
            {
                System.out.print("Enter Item for row: "+i+" column: "+j+" index : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The enterd 2-D array are : ");
        for(int i = 0 ; i<arr[0].length ; i++)
        {
            for(int j = 0 ; j<arr[0].length ; j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}