import java.util.*;
class WaterTaxx
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ammount of water consumed : ");
        int amt = sc.nextInt();
        double tax = 0.00;
        if(amt> 45 && amt<=75)
            tax = 475.00;
        else if(amt> 75 && amt<=125)
            tax = 750.00;
        else if(amt> 125 && amt<=200)
            tax = 1225.00;
        else if(amt> 200 && amt<=350)
            tax = 1650.00;
        System.out.println("the ammount payable by the customer : "+tax);
    }
}