import java.util.*;
class Calculator
{
    void display()
    {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
    }
    int add(int a, int b)
    {
        return (a+b); 
    }
    int sub(int a , int b)
    {
        return (a>b)?a-b:b-a;
    }
    public static void main(String args[])
    {
        Calculator ob = new Calculator();
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            ob.display();
            System.out.print("Enter your Choice : ");
            int c = sc.nextInt();
            int a ,b ;
            switch (c)
            {
                case 1: System.out.println("enter a ");
                        a = sc.nextInt();
                        System.out.println("enter b ");
                        b = sc.nextInt();
                        System.out.println(ob.add(a,b));
                        break;
                case 2: System.out.println("enter a ");
                        a = sc.nextInt();
                        System.out.println("enter b ");
                        b = sc.nextInt();
                        System.out.println(ob.sub(a,b));
                        break; 
                case 3: System.out.println("Good Bye");
                        System.exit(0);  
                default: System.out.println("***********Invalid Input**********");
            }
            System.out.println("\n\n\n******************");
        }
    }
}