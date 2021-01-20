class Pattern2
{
    public static void main(int n)
    {
       int cln=1;
       for(int i = 1; i<=n;i++)
       {
           int nos = n-cln;
           for (int j=1;j<=nos;j++)
                System.out.print(" ");
           for (int j=1;j<=cln;j++)
                System.out.print("* ");
           System.out.println();
           cln++;
       }
    }
}