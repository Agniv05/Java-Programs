import java.util.* ;
import java.io.*;
public class Solution {

    public static long sumOrProduct(int n, int q) {
        int out = 1;
        if (q == 1)
            for (int i = 2; i <= n; i++)
                out = out + i;
        else if (q == 2)
            for (int i = 2; i <= n; i++)
                out = out * i;

        System.out.println(out);
        return out;
    }
}