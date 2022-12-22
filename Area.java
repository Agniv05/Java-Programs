public class Area extends Calculate {
     void area(int l, int b){
         super.area(2,3);
        System.out.println("Advance Area of rectangle : "+l*b);
    }
    public static void main(String[] args) {
        Area obj = new Area();
        obj.area(10,20);
    }
}
