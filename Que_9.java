//9. Write a program to read the days (eg. 670 days) as integer value using Scanner class.
//   Now convert the entered days into complete years, months and days and print them.
import java.util.Scanner;
class Que_9
{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int no,mo,ye,da;
        System.out.print("Enter no of days: ");
        no=sc.nextInt();
        
        ye=no/365;
        no=no%365;
        mo=no/30;
        no=no%30;
        da=mo%30;
        
        System.out.println("Days: "+no+"\nMonths: "+mo+"\nYears: "+ye);
    }     
}




