import java.util.*;
class PascalsTriangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        String str1 = "1";
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 1; j <= (n-(i+1)) ; j++)
                System.out.print(" ");
            //System.out.print((int)(Math.pow(11,i)));
            str1 += "0"+ str1;
            for()
            System.out.println();
        }
    }
}