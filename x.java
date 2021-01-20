
class x
{
    public static void main()
    {
        int x,y;
        for(x=1;x<=5;x++)
        {
            for(y=1;y<=5;y++)
            {
            if((x==y)||(x+y==6))
            {
                System.out.print("X ");
            }
            else
            {
                System.out.print("  ");
            }}
            System.out.println();
        }
    }
}