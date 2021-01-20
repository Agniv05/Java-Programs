import java.util.*;
class Array2
{
    public static void main(String args[])
    {
        int marks[] = new int[10];
        
        System.out.println("Enter values of the Array");
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<10;i++)
        {
            System.out.print("Enter value for index "+(i+1)+": ");
            marks[i]= sc.nextInt();
        }
        System.out.println("The Array: ");
        for(int i = 0;i<10;i++)
        {
            if(i!=0)
                System.out.print(",");
            System.out.print(marks[i]);
        }
    }
}