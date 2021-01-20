import java.util.*;
class HighestMarks
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter makrs 1");
       int a=sc.nextInt();
       System.out.println("Enter marks 2");
       int b=sc.nextInt();
       int fm = (a>b)?a:b;
       for(int i = 2;i<10;i++)
       {
           System.out.println("Enter makrs "+(i+1));
           int c=sc.nextInt();
           fm= (fm>c)?fm:c;
       }
       System.out.println("highest : "+fm);
    }
}