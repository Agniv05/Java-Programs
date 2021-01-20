import java.util.*;
class RemovingElement2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine();
        System.out.println("The orginal string :\n"+str);
        System.out.println("Enter a character to remove : ");
        char ch = sc.next().charAt(0);
        int c = 0;
        for(int i = 0 ; i<str.length() ; i++ )
        {
            if(str.charAt(i)==ch)
                c++;
        }
        char arr[] = new char[str.length() - c] ;
        int k = 0 ;
        for(int i = 0 ; i<str.length() ; i++ )
        {
            if(str.charAt(i)!=ch)
            {
                 arr[k++] = str.charAt(i);
            }
        }
        String str2 = new String(arr);
        System.out.println("The new string :\n"+str2);
    }
}