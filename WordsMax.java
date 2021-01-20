import java.util.*;
class WordsMax
{  
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        String str;
        String word;
        int l1;
        int l2;
        int max=0;
        int st;
        int en;
        System.out.println("Enter any String:");
        str=sc.nextLine();
        str +=" ";
        st=0; 
        char ch;
        l1=str.length();
        for(int i=0;i<l1;i++){
            ch=str.charAt(i);
            if (ch==' '){
                en=i;
                word=str.substring(st,en);
                l2=word.length();
                if(l2>max){
                    max=l2;
                }
                st=i+1;
            }
        }
        System.out.println("Maximum="+max);
     }
}