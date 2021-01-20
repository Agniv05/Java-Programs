import java.util.*;
class FirstWord
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        str = str.toUpperCase();
        str = " "+str;
        char l =' ';
        for(int i = 0; i<str.length() ;i++)
        {
            l= str.charAt(i);
            if(l==' ')
                System.out.print(str.charAt(i+1)+".");
        }
    }
}