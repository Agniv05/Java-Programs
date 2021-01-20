/*
 * Adway Chakaraborty
 * class 10A
 * roll 5
*/
import java.util.*;
class Words
{
    public static void main(String args[])
    {
        Words ob = new Words();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = sc.nextLine();
        String words[] = ob.mySplit(str) ;
        int vcount = 0  , constcount = 0 , length = 0 ;
        String longword[] = new String[words.length];//sets the array size of longword[]
        int k = 0;
        for(int i = 0 ; i < words.length ; i++ )
        {
            String word = words[i];//stores the current word //gets refreshed everytime i increases
            if(word != null)
            {
                char ch = word.charAt(0);
                if(ch == 'a' ||ch == 'A' ||ch == 'e' ||ch == 'E' ||ch == 'i' ||ch == 'I' ||ch == 'o' ||ch == 'O' ||ch == 'u' ||ch == 'U' )
                    vcount++;
                else
                    constcount++;
                
                if(word.length() > length )//helps to get the length of the largest word
                    length = word.length();
            }
        }
        for(int i = 0 ; i < words.length ; i++ )
        {
            String word = words[i];//stores the current word //gets refreshed everytime i increases
            if(word != null)
                if(word.length() == length)//adds up the longest word to the array
                    longword[++k]=word;
        }
        System.out.println("Number of words starting with consonant: " + constcount );
        System.out.println("Number of words starting with vowel: " + vcount );
        System.out.println("Longest Word / words are : " );
        for(int i = 0 ; i < longword.length ; i++)
            if(longword[i] != null)//checks if the value of the current index is not null
                System.out.println("-> " + longword[i] );
    }
    String[] mySplit(String str)
    {
        str = str + " ";
        int k = 0;
        String words[] = new String[str.length()];
        int start = 0;
        for(int i = 0 ; i<str.length() ; i++) 
        {
            char c = str.charAt(i) ;
            if(c == ' ')
            { 
                words[k++] = str.substring(start,i);
                start = i+1 ;
            }
        }
        return words ;
    }
}