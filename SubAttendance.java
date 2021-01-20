import java.util.*;
class SubAttendance
{
    static int sub , stu;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects : ");
        sub = sc.nextInt();
        System.out.print("Enter the number of students per subject  : ");
        stu = sc.nextInt();
        
        int arr[][] = new int[sub][stu];
        for(int i = 0 ; i<sub ; i++)
        {
            for(int j = 0 ; j<stu ; j++)
            {
                System.out.print("Enter marks for subject "+(i+1)+" and student id "+(j+1)+" : ");
                arr[i][j] = sc.nextInt();
            }
        }
        attendance(arr);
    }
    static void attendance(int arr[][])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subject id : ");
        int id = sc.nextInt();
        int arr2[] = new int[stu];
        for(int i = 0; i<stu ; i++)
            arr2[i] = arr[id][i];
        int t ;
        for(int i = 0 ; i<stu ; i++)
        {
            for(int j = 0 ; j<(stu-1-i) ; j++)
            {
                if(arr2[j] > arr2[j+1])//for descending order use "arr[j]<arr[j+1]"
                {
                    t=arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = t;
                }
            }
        }
        System.out.println("The lowest marks for "+id+" is : "+arr2[0]);
    }
}