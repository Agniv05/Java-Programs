import java.util.*;
class BubSrtPercentage
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sz = 5; //for storing te size of the peray
        String blank ;
        String name[] = new String[sz];
        float per[] = new float[sz];
        
        System.out.println("Enter the details : ");
        for (int i=0;i<sz;i++)
        {
            System.out.print("\nEnter name "+(i+1)+": ");
            name[i]=sc.nextLine();
            System.out.print("Enter Percentage: "+(i+1)+": ");
            per[i]=sc.nextFloat();
            blank = sc.nextLine();
        }
        
        float t ;
        String str;
        for(int i = 0 ; i<per.length-1 ; i++)
        {
            for(int j = 0 ; j<(per.length-1-i) ; j++)
            {
                if(per[j]<per[j+1])//for descending order use "per[j]<per[j+1]"
                {
                    t = per[j];
                    per[j] = per[j+1];
                    per[j+1] = t;
                    
                    str = name[j];
                    name[j] = name [j+1];
                    name[j+1] = str;
                }
            }
        }
        
        System.out.println("***************************\nIn descending order of percentage : ");
        for (int i=0;i<sz;i++)
        {
            System.out.print("\n\nName : "+ name[i]);
            System.out.print("\npercentage : "+ per[i]);
        }
    }
}