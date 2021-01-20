import java.util.*;
class ShowRoom
{
    String name;
    long mobno;
    double cost,dis,amount;
    ShowRoom()
    {
        name = "";
        mobno = 0L;
        cost = dis = amount = 0.0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer name : ");
        name = sc.nextLine();
        System.out.print("Enter Customer mobile number : ");
        mobno = sc.nextLong();
        System.out.print("Enter cost : ");
        cost = sc.nextDouble();
    }
    void calculate()
    {
        if(cost <= 10000)
            dis = 0.05;
        else if (cost > 10000 && cost <= 20000)
            dis = 0.1;
        else if (cost > 20000 && cost <= 35000)
            dis = 0.15;
        else
            dis = 0.2;
        amount = cost - cost*dis;
    }
    void display()
    {
        System.out.println("\n Customer name : "+ name);
        System.out.println("Customer mobile number : "+ mobno);
        System.out.println("Discount levyed : "+ (dis*100)+"%");
        System.out.println("Final amount to be paid : "+ amount);
    }
    public static void main(String args[])
    {
        ShowRoom ob = new ShowRoom();
        ob.input();
        ob.calculate();
        ob.display();
    }
}