import java.util.*;
class Anagram
{
    static int count=0;
    public void anagm(String st, int s, int end)
    {
        if (s==end) {
            System.out.println(st);
            count++;
        }
        else {
            for (int i =s; i<= end; i++) {
                st = swap(st,s, i);
                anagm(st,s + 1, end);
                st = swap(st,s, i);
            }
        }
    }
    public String swap(String a, int i, int j)
    {
        char[] c = a.toCharArray();
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
        return String.valueOf(c);
    }
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a word");
        String str =in.next();
        int l = str.length();
        if(l<=7)
        {
            System.out.println("Anagram of "+str+" is:-");
            Anagram a = new Anagram();
            a.anagm(str, 0,l - 1);
            System.out.println("Possible anagrams="+count);
        }
    }
}