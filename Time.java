import java.io.*;
import java.util.Scanner;
public class Time
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hours : ");
        int hr = sc.nextInt();
        System.out.print("Enter Minutes : ");
        int mins = sc.nextInt();
        if((hr>=1 && hr<=12) && (mins>=0 && mins<=59))
        {
            String words[]={"", "One", "Two", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine","Ten",
                    "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen",
                    "Twenty","Twenty one", "Twenty two", "Twenty three", "Twenty four", "Twenty five",
                    "Twenty six","Twenty seven","Twenty eight", "Twenty nine"};
            /* The below code is for finding whether to print the word 'minute' or 'minutes' */
            String plu, a;
            if(mins == 1 || mins == 59)
                plu = "Minute";
            else
                plu = "Minutes";
            if(hr==12)
                a = words[1]; //storing 'one' when hour is 12
            else
                a = words[hr+1]; //if hour is not 12, then storing in words, an hour ahead of given hour

            // The below code checks minutes and accordingly prints the time in words using array.
            //printing the given time in numbers
            System.out.print("Output : "+hr+":"+mins+" ----- ");
            if(mins==0)
                System.out.println(words[hr]+" O' clock");
            else if(mins==15)
                System.out.println("Quarter past "+words[hr]);
            else if(mins==30)
                System.out.println("Half past "+words[hr]);
            else if(mins==45)
                System.out.println("Quarter to "+a);
            else if(mins<30) // condition for minutes between 1-29
                System.out.println(words[mins]+" "+plu+" past "+words[hr]);
            else // condition for minutes between 31-59
                System.out.println(words[60-mins]+" "+plu+" to "+a);
        } //end of outer if

        else
            System.out.println("Invalid Input !");
    }
}