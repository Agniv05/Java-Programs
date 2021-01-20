import java.util.*;
class pallindrome
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter 2 digit or greater no : ");
        int n = sc.nextInt();
        int a = n;
        int s = 0;
        while(n>0)
        {
            s= (s*10)+(n%10);
            n= n / 10;
        }
        boolean p =  (s==a)?true :false;
        if (p)
            System.out.println("yes it is a pallindrome");
        else
            System.out.println("No it is not a  pallindrome");
    }
}