import java.util.*;
class Dissarium
{
    static int n;
    Dissarium(int n)
    {
        Dissarium.n=n;
    }
    static int count()
    {
        int c =0;
        int bk= Dissarium.n;
        while(bk>0)
        {
            bk=bk/10;
            c++;
        }
        //System.out.println(c);
        return c;
    }
    static boolean isDissarium()
    {
        int bk1=Dissarium.n;
        int p=0;
        int q=0;
        int len= 0;
        int bk2= Dissarium.n;
        while(bk1>0)
        {
            bk1=bk1/10;
            len++;
        }
        while(bk2>0)
        {
            p=bk2%10;
            bk2=bk2/10;
            q= q + (int)(Math.pow(p,len));
            len--;
        }
        return (q==Dissarium.n)?true:false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n= sc.nextInt();
        Dissarium ob = new Dissarium(n);
        if (ob.isDissarium())
            System.out.println("It's a dissarium number");
        else
            System.out.println("It is not a dissarium number");
    }
} 
