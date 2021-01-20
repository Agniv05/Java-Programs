class Pattern7
{
    public static void main(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int j = i; j>=1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}