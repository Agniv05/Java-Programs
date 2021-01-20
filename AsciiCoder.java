import java.util.*;
class AsciiCoder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String str2 = "";
        for(int i = 0; i< str.length(); i++)
        {
            char c = str.charAt(i);
            c +=  10;
            str2 = str2+c;
        }
        System.out.println("The Code is :"+str2);
    }
}