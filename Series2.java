class Series2
{
    static int fact(int n)
    {
        int f =1;
        for (int i=1; i<=n;i++)
        {
            f= f*i;
        }
        return f;
    }
    public static void main(int n)
    {
        double s=0;
        for (int i =1; i<=n;i++)
        {
            if (i%2 == 0)
                s=s-((double)i/fact(i));
            else
                s=s+((double)i/fact(i));
        }
        System.out.println(s);
    }
}