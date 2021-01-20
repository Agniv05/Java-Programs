import java.util.*;
class Pattern8
{
    public static void main(int n)
    {
        int c = n;
        for(int i = 1 ; i <= n ; i++ )
        {
             for(int j = i ; j <= n-1 ; j++ )
                    System.out.print("  ");
             for(int j = 1 ;j <= i; j++)
                System.out.print(c+" ");
             System.out.println();
             c--;
        } 
    }
}