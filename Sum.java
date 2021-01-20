class Sum
{
    int Sum(int a , int b)
    {
        int n = 0;
        for(int i = a ; i<=b ; i++)
        {
            if(i%2 == 0)
                n = n+i ;
        }
        return n;
    }
    double Sum(double n)
    {
        double i = 1.0 ;
        double sum = 1;
        while(i<=n)
        {
            i = i+0.2;
            sum = sum*i;
        }
        return sum;
    }
    int Sum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            if((n%10)/2 != 0)
                sum = sum + n%10 ;
            n=n/10;
        }
        return sum; 
    }
    public static void main(String args[])
    {
        Sum ob = new Sum();
        System.out.println(ob.Sum(4,16));
        System.out.println(ob.Sum(1.8));
        System.out.println(ob.Sum(43961));
    }
}