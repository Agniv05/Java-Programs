class DigitalWorld
{
    float n = 0.0f;
    DigitalWorld(float x)
    {
        n = x;
    }
    public static void main(String args[])
    {
        DigitalWorld ob1 = new DigitalWorld(25000.0f);
        DigitalWorld ob2 = new DigitalWorld(35000.0f);
        DigitalWorld ob3 = new DigitalWorld(45000.0f);
        DigitalWorld ob4 = new DigitalWorld(55000.0f);
        System.out.println("for n = 25000 the output is : "+ob1.taxCalc());
        System.out.println("for n = 35000 the output is : "+ob2.taxCalc());
        System.out.println("for n = 45000 the output is : "+ob3.taxCalc());
        System.out.println("for n = 55000 the output is : "+ob4.taxCalc());
    }
    float taxCalc()
    {
        float s = n;
        int d = 0;
        if(n < 30000 && n >=  20000)
            d=10;
        else if (n < 40000 && n >= 30000)
            d=15;
        else if (n < 50000 && n >= 40000)
            d=18;
        else if ( n >= 50000)
            d=20;  
        s -= n*(d*0.01);
        s -= n*0.05;
        s += n*0.12;
        return s;
    }
}