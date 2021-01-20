import java.util.*; 
class Test 
{ 
    public static void main(String args[]) 
    { 
        int n = 25;
        int bk = n;
        int c = 0;
        while(bk != 0)
        {
            c++;
            bk /= 10;
        }
        if(bk > 2)
        {
            System.out.println("Enter 2 digit number only ! ");
            System.exit(0);
        }
        int rev = 0;
        while(n >0)
        {
            rev = n %10;
            n /= 10;
        }
        System.out.print("reversed number is: "+rev);
    } 
} 