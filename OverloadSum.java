class OverloadSum
{
    int Sum(int A, int B)
    {
        int sum = 0;
        for(int i = A; i<=B ; i ++)
        {
            if(i%2 == 0)
                sum += i;
        }
        return sum;
    }
    double Sum(double N)
    {
        double prod = 1.0;
        while(prod <= N)
            prod *= (prod+0.2);
        return prod;
    }
    int Sum(int N)
    {
        int bk = N;
        int c = 0;
        while(bk != 0)
        {
            c++;
            bk = bk/10;
        }
        int sum = 0;
        int dig = 0;
        for(int i = 0; i<=c ; i++)
        {
            dig = N%10;
            if(dig%2 != 0)
            {
                sum += dig;
            }
            N = N/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        OverloadSum ob = new OverloadSum();
        System.out.println("Sum of even when a=4 and b=16  "+ob.Sum(4,16));
        System.out.println("Sum of even when a=4 and b=16  "+ob.Sum(8.1));
        System.out.println("Sum of even when a=4 and b=16  "+ob.Sum(456712));
    }
}