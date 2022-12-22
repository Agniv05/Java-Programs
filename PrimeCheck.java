public class PrimeCheck {
    public static void main(String[] args) {
//        for(int i = 0; i <= 100;i++){
//            System.out.print("B");
//            for(int j = 0; j<(i+1) ; j++)
//                System.out.print("a");
//            System.out.print("l\n");
//        }
        for(int i = 1; i<=20 ; i++){
            for(int j = 1; j<=i ;j++){
                System.out.print("O");
            }
            for(int j = 20; j>=i ;j--){
                System.out.print(" ");
            }
            for(int j = 20; j>=i ;j--){
                System.out.print(" ");
            }
            System.out.print("O0000000000\n");
        }
    }
}
