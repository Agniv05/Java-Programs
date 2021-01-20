class Series1
{
    public static void main(int n)
    {
        double s = 0;
        double l = 4;
        for(int i =1; i<=n;i++)
        {
            s = s + 1/(l);
            l+=4;
        }
        System.out.println(s);
    }
}