class PolynomialCheck
{
    public static void main(String args[])
    {
        //float p = (2*x*x*x*x)+(3*x*x*x)+(x*x)+x+4;
        /*if(p == 0.0)
            System.out.println("True");
        else
            System.out.println("False");*/
        //checking
        for(int i = 0 ; i<= -500 ; i--)
        {
            if((2*i*i*i*i)+(3*i*i*i)+(i*i)+i+4 == 0)
            {
                System.out.println("ture for : " + i);
            }
        }
    }
}