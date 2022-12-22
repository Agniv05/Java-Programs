import java.util.*;
public class Decrypt {
    String s,decod;
    int shift;
    public Decrypt(){
        s="";
        decod="";
        shift=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Coded Message: ");
        s=sc.nextLine();
        System.out.print("Enter the value of Shift: ");
        shift=sc.nextInt();
    }
    void compute()
    {
        int l=s.length();
        s=s.toUpperCase();
        s=s+" ";
        char ch,w;
        int a,b;
        if(l>=100)
        {
            System.out.println("Invalid length of the Coded Message. ");
            System.exit(0);
        }
        else
        {
            if(shift<1 || shift>26){
                System.out.println("Invalid Shift value. ");
                System.exit(0);
            }
            else{
                for(int i=0;i<l;i++){
                    ch=s.charAt(i);
                    w=s.charAt(i+1);
                    a=(int)ch+(shift-1);
                    b=(int)w+(shift-1);
                    if((char)a=='Q' && (char)b=='Q'){
                        i++;
                    }
                    if(a>90)
                        a-=26;
                    if(ch!=' ')
                        decod+=(char)a;
                }
            }
        }
    }
    void display(){
        System.out.println("Decoded Message: " +decod);
    }
    public static void main(String args[]){
        Decrypt obj=new Decrypt();
        obj.accept();
        obj.compute();
        obj.display();
    }
}