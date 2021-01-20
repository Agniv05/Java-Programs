import java.util.*;
class MaxMinMarks
{
    public static void main(String[] args)
    {
        int mk[]= new int[10];
        int avg = 0;
        int max= mk[0];
        int min= mk[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten marks: ");
        for (int i=0;i<10;i++)
        {
            System.out.print("Enter marks "+(i+1)+": ");
            mk[i]=sc.nextInt();
        }
        max=min=mk[0];
        for (int i=0;i<10;i++)
        {
            avg += mk[i];
            max = (max>mk[i])?max:mk[i];
            min = (min<mk[i])?min:mk[i];
        }
        System.out.println("avg = "+ (avg/10));
        System.out.println("maximum = "+max);
        System.out.println("minimum = "+min);
    }
}