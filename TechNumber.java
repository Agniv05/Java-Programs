import java.util.*;
/* 
 tech number = 3025
 (30+25)^2 (whole sqaured) = 3025
 */
class TechNumber
{
    public static void main(String args[])
    {
        TechNumber ob = new TechNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int nod = ob.numOfDig(n);
        int nby2 ;
        for(int i = 1 ; i<= (n/2))
    }
    int numOfDig(int n)
    {
       int c = 0;
       while(n > 0)
       {
           n = n/10;
           c++;
       }
       return c;
    }
}