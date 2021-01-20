import java.util.*;
class HighestMarks2
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);  
       int n, max=0, min=0;
       for(int i = 1;i<=10;i++)
       {
           System.out.print("Enter marks of subject "+i+ ": ");
           n=sc.nextInt();
           if (i==1){
               max=min=i;
           }
           max = (n>max)?n:max;
           min = (n<min)?n:min;
       }
       System.out.println("Highest marks : "+max);
       System.out.println("Lowest marks : "+min);
    }
}