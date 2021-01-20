import java.util.*;
class PairOfVowels
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine().toUpperCase();
        System.out.println("Pair of vowels : ");
        int c = 0;
        for(int i = 0; i<str.length()-1 ; i++)
        {
            char a = str.charAt(i);
            char b = str.charAt(i+1);
            if(isVowel(a) && isVowel(b))
            {
                System.out.println(a+" "+b);
                c++;
            }
        }
        System.out.println("Number of Pair of vowels : "+c);
    }
    static boolean isVowel(char a)
    {
        if(a == 'A' || a =='E' || a == 'I' || a == 'O'||a == 'U')
            return true;
        return false;
    }
}