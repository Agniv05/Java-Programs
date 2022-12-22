import java.util.Scanner;

public class Bank_Denom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ammount to be paid : ");
        int n = sc.nextInt();
        int bk = n;
        String nm = "";
        int[] notes = new int[]{ 1000, 500, 200, 100, 50, 20, 10, 5, 1 };
        String[] str = new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int[] noteCounter = new int[9];
        while(bk!=0){
            nm = str[bk%10] + " " + nm;
            bk = bk/10;
        }
        for (int i = 0; i < 9; i++) {
            if (n >= notes[i]) {
                noteCounter[i] = n / notes[i];
                n = n % notes[i];
            }
        }
        System.out.println("The ammount : "+nm);
        System.out.println("Currency Count : ");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " x " + noteCounter[i]+" = "+ (notes[i]*noteCounter[i])+"/-" );
            }
        }
    }
}