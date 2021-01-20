import java.util.*;
class MenuDrive3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Unicode Values od A to Z");
        System.out.println("2.Right angle triganle with numbers ");
        System.out.println("Enter Choice : ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 :
                System.out.println("\nLetters    Unicode");
                for(char i = 'A' ; i<='Z' ; i++)
                    System.out.println(i+"          "+(int)i);
                break;
            case 2 :
                int n = 5;
                for(int i =1 ; i<=n ; i++)
                {
                    for(int j = 1; j<= i ; j++)
                        System.out.print(j+" ");
                    System.out.println();
                }
                break;
            default :
                System.out.println("*******Invalid Input*******");
        }
    }
}