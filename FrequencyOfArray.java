import java.util.*;
class FrequencyOfArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array {1st place of your array is 1} ");
        int n = sc.nextInt();
        int mk[]= new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.print("Enter value of "+(i+1)+": ");
            mk[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search :");
        int num = sc.nextInt();
        int c = 0 ;
        int no = 0 ;
        for (int i=0;i<n;i++)
        {
            if(mk[i] == num)
                c++;
        }
        System.out.println("The frequency of "+num+" is : "+c);
    }
}