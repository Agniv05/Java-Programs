import java.util.*;
class Array
{
    public static void main(String args[])
    {
        //int marks[] = new int[10];
        int marks[] = {5,6,8,7,4,1,0,5,7,3};
        
        marks[9] = 121;
        for(int i=0;i<10;i++)
            System.out.println(marks[i]);
    }
}