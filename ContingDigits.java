import java.util.*;
class ContingDigits
{
    public static void main (int n)
    {
        int c = 0;
        while(n>0)
        {
           n= n/10;
           c++;
        }
        System.out.println(c);
    }
}