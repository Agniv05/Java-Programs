public class Stack {
    int stack[];
    int top;
    int size = 50;
    Stack(){
        top = -1;
        stack = new int[size];
    }
    void push(int item){
        if(top>=size){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
    }
    void pop(){
        if(top<0) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(stack[top--]);
    }
}
