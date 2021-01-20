import java.util.*;
class LinearSearch2
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int mk[]= new int[sc.nextInt()];
        int pos[]= new int[mk.length];
        boolean flag = true;
        
        System.out.println("\nEnter numbers for array : ");
        for ( i=0;i<mk.length;i++)
        {
            System.out.print("Enter number "+(i+1)+": ");
            mk[i]=sc.nextInt();
        }

        System.out.print("Enter number to search : ");
        int n= sc.nextInt();
        int c=0; 
        
        for (i=j=0;i<mk.length;i++)
        {
            if (mk[i]==n)
             {   
                 pos[j++]=i;
                 flag = false;
                 c += 1;
             }
        }
        
        if(flag)
            System.out.println("\nThe number "+n+" is not here"); 
        else
        {
            System.out.println("\nThe frequency of number "+n+" is "+c);
            System.out.print("number "+n+" is found at positions : ");
            for (i=0;i<c;i++)
                System.out.print((pos[i]+1)+"\t");
        }
    }
}