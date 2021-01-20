import java.util.*;
class VowelRemove
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("The Sentence : ");
        for(int i = 0 ; i < str.length() ;i++)
        {
            char c = str.charAt(i);
            if(isVowel(c) == false)
                System.out.print(c);
        }
    }
    static boolean isVowel(char a)
    {
        if(a == 'A' || a =='E' || a == 'I' || a == 'O'||a == 'U')
            return true;
        else if(a == 'a' || a =='e' || a == 'i' || a == 'o'||a == 'u')
            return true;
        return false;
    }
}