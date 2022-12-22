import java.util.*;
public class Stack_OP {
    public static void main(String[] args) {
        Stack ob = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice \n 1: push \n 2: pop ");
        int ch = sc.nextInt();
        switch (ch){
            case 1 :
                System.out.println("Enter the item to be pushed : ");
                int n = sc.nextInt();
                ob.push(n);
                break;
            case 2 :
                ob.pop();
        }
    }
}
