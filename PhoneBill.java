import java.util.*;
class PhoneBill
{
    static int input()
    {
        System.out.print("Enter munites :");
        Scanner sc= new Scanner(System.in);
        return sc.nextInt();
    }
    static double calculate()
    {
        int n = input();
        double p =0;
        double amt = 0;
        if (n<=50)
           amt = 0;
        else if(n>50 && n<=150)
            amt = (0.2*(n-50));
        else if(n>150 && n<=250)
            amt = (0.2*100) + (0.5*(n-150));
        else
            amt = (0.2*100)+(0.5*100)+(1.5*(n-250));
        return amt;
    }
    public static void main(String args[])
    {
        System.out.println("Your bill is ₹ "+calculate());
    }
}