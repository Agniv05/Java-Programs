class Pattern3
{
    public static void main(int n)
    {
       int cln=1;
       int tln=n;
       for(int i = 1; i<=tln;i++)
       {
           for(int j = 0;j<cln;j++ )
                System.out.print(" ");
           for(int j = 1; j<n;j++)
                System.out.print("* ");
           n--;
           cln++;
           System.out.println();
       }
    }
}