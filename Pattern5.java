class Pattern5
{
    public static void main(int n)
    {
        int cln=1;
        for (int i = 1; i <= n; i++) 
        { 
            for (int j = 1; j <= i; j++) 
                 System.out.print("  "); 
            for (int j = 0; j<(i+2);j++)
                 System.out.print("@ ");
            System.out.println(); //cln++;
        } 
        for (int i = n; i > 1; i--) 
        { 
            for (int j = 1; j < i; j++) 
                 System.out.print("  ");
            for (int j = 0; j<(i+2);j++)
                 System.out.print("@ ");
            System.out.println(); 
        }
    }
}