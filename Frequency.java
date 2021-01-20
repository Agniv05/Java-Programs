import java.util.*;
class Frequency
{
    public static void main(String  args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter lines");
       String s = sc.nextLine();
       System.out.println("Enter word to check ");
       String a = sc.nextLine();
       String w =" ";
       String a = a.toUpperCase();
       String s = s.toUpperCase();
       int l = s.length()
       int i,t;
       for(int i = 0; i<l ; i++)
       {
           char c ;
           c= s.charAt(i);
           if(c!=' ')
            w = w+c;
           else
           {
               if(w==a)
                  t++;
            }
       }
       w = " ";
       System.out.println("The no.of times = "+t);
    }
}