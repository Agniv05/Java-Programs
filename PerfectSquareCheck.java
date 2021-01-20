import java.util.*;
class PerfectSquareCheck
{
    public static void main(int n)
    {
        int p= (int)(Math.sqrt(n));
        if (p*p==n)
            System.out.println("perfect square");
        else
            System.out.println("not a perfect square!");
    }
}