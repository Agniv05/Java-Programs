import java.util.*;
 
public class traingle 
{
 
    public static void main() 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        int c = 1;
 
        for(int i = 0; i < r; i++)// printing each row.
        {
            for(int m = 1; m < r - i; ++m)// spaces at the beginning of each line. 
            {
                System.out.print("  ");
            }
 
            for(int j = 0; j <= i; j++) //printing the numbers in the triangle.
                {
                    if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
 
               System.out.printf("%4d", c);//The %4d specifier means a minimum width of three spaces
            }
 
            System.out.println();
        }
    }
}