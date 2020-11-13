//14. Program to check that entered year is a leap year or not.
import java.util.Scanner;
class Que_14
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int y;
        System.out.print("Enter Year: ");
        y=sc.nextInt();
        if(y%1000!=0)
        {
            if(y%4==0)
                System.out.println(y+" is a Leap Year.");
            else
                System.out.println(y+" is a Normal Year.");
        }
        else
            System.out.println(y+" is a Normal Year.");
    }     
}







