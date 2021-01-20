import java.util.*;
class Display
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = sc.nextLine();
        Display ob = new Display();
        System.out.println("the number of vowels are "+ob.countVowels(str));
        
    }
    int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
