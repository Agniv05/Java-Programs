import java.util.*;
class StringPallindromeAdway
{
    boolean isPallindrome(String st)
    {
        String rvst="";
        for(int i = st.length()-1 ; i>=0 ; i-- )
            rvst= rvst+ st.charAt(i);
        return st.equals(rvst);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String st = sc.nextLine();
        StringPallindromeAdway ob = new StringPallindromeAdway();
        if(ob.isPallindrome(st))
            System.out.println("The String is Pallindromic in nature ");
        else
             System.out.println("The String is  not Pallindromic in nature ");
    }
}