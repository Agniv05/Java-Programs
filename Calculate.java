public class Calculate {
    int a;
    int b;
    void area(int n){
        System.out.println("Area of square : "+n*n);
    }
    void area(int l, int b){
        System.out.println("Area of rectangle : "+l*b);
    }
    void area(double r){
        System.out.println("Area of circle : "+ (3.14*r*r));
    }
    void display(){
        System.out.println(a+" "+b);
    }
}