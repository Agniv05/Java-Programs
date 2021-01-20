public class Extract
{
    public static void main(String args[])
    {
        String s=" I am Adway ";
        int i,j,l;
        String word,rev;
        for(i=0,j=0;i<s.length();i=j+1)
        {
            j=s.indexOf(" ",i);
            if(j==-1)
                break;
            word=s.substring(i,j);
            //System.out.println(word);
            //rev=word.substring(j,i);
            //System.out.print(rev+" ");
            rev="";
            l=word.length();
            for(i=l-1;i>=0;i--)
                rev=rev + word.charAt(i);
                System.out.print(rev + " ");    
        }
    }   
}