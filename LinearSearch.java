import java.util.*;
class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int mk[]= new int[10];
        boolean flag = true;
        
        System.out.println("Enter ten number: ");
        for (int i=0;i<10;i++)
        {
            System.out.print("Enter marks "+(i+1)+": ");
            mk[i]=sc.nextInt();
        }
        System.out.print("Enter number to search : ");
        int n= sc.nextInt();
        for (int i=0;i<10;i++)
        {
            if (mk[i]==n)
             {   
                 System.out.println("The number "+n+" is found at position "+(i+1));
                 flag = false;
                 break;
             }
        }
        if(flag)
            System.out.println("The number "+n+" is not here"); 
    }
}