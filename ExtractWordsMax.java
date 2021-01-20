import java.util.*;
class ExtractWordsMax
{  
     public static void main(String args[])
     {
        String str, word;
        int l1,l2,max=0;
        Scanner sc=new Scanner(System.in);
        int st, en;
        System.out.println("Enter any String:");
        str=sc.nextLine();
        str=str+" ";
        st=0; char ch;
        l1=str.length();
        for(int i=0;i<l1;i++){
            ch=str.charAt(i);
            if (ch==' '){
                en=i;
                word=str.substring(st,en);
                System.out.println(word);
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
