//13.1. Program to find greatest in 3 numbers. [using if else statement].
import java.util.Scanner;
class Que_13
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int i,lb=-32768,no,gr=0;
        for(i=1;i<=3;i++)
        {
            System.out.print("Enter number "+i+": ");
            no=sc.nextInt();
            if(no>=lb)
            {
                gr=no;
                lb=no;
            }
            else
            {
                gr=lb;
            }
        }
        System.out.println("Greatest no. is: "+gr);
    }     
}








//13.2.	Program to find greatest in 3 numbers. [using ternary operator (logical operator)] 

/*class Que_13
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int i,lb=-32768,no,gr=0;
        for(i=1;i<=3;i++)
        {
            System.out.print("Enter number "+i+": ");
            no=sc.nextInt();
            
            gr=no>=lb ?no : lb;
            lb=no;
        }
        System.out.println("Greatest no. is: "+lb);
    }     
}*/

