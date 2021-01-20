class Timer
{
    public static void main(int n)throws Exception
    {
        System.out.println("Your timer has started");
        for(int i = n; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Your timer has ended");
        char x='a';
    }
}