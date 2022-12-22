import java.util.*;
public class RHO {
    public static void main(String[] args) {
        //Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the valus of n:");
        int n = scanner.nextInt();
        System.out.println("Enter the valus of calculating RHO:");
        double[] x = new double[n];
        double[] y = new double[n];
        double[] x2 = new double[n];
        double[] y2 = new double[n];
        for (int i = 0; i<n; i++) {
            x[i] = scanner.nextDouble();
            x2[i] = x[i];
        }
        for (int i = 0; i<n; i++) {
            y[i] = scanner.nextDouble();
            y2[i] = y[i];
        }
        scanner.close();
        Arrays.sort(x2);
        Arrays.sort(y2);
        int sum = 0;
        for (int i =0; i<n; i++) {
            sum += Math.pow((double)(getRank(x[i], x2) - getRank(y[i],y2)),2);
        }
        double result = 1.0 - (6.0*sum)/(n*(n*n-1));
        System.out.print("RHO:");
        System.out.println(String.format("%.3f",result));
    }
    private static int getRank(double item, double[] a) {
        for (int i = 0; i< a.length; i++) {
            if(item == a[i])

                return i+1;
        }
        return -1;
    }
}