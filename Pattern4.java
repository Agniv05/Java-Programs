class Pattern4
{
    public static void main(int n)
    {
        int cln =1;
        int c=1;
        for(int i =1;i<=n;i++)
        {
            for(int j= 1; j<=cln;j++)
            {
                System.out.print(c+ " ");
                c++;
            }
            System.out.println();  
            cln++;
        }
    }
}