class VolumeCalc
{
    int l;
    int b;
    int h;
    VolumeCalc()
    {
        l = 15;
        b = 15;
        h = 15;
    }
    VolumeCalc(int x , int y , int z)
    {
        l = x;
        b = y;
        h = z;
    }
    int volume()
    {
        return l*b*h;
    }
    public static void main(String args[])
    {
        VolumeCalc ob1 = new VolumeCalc();
        VolumeCalc ob2 = new VolumeCalc(6,8,10);
        
        System.out.println("When the value diemsion is 15*15*15: "+ob1.volume());
        System.out.println("When the value diemsion is 6*8*10: "+ob2.volume());
    }
}