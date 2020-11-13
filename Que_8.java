
//8. Write a program to find the simple interest.
//   Take the principle amount, rate of interest and time from user using Scanner class.
import java.util.Scanner;
class Que_8
{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int p, r, t;
        float si;
       
        System.out.print("Enter Principal: ");
        p=sc.nextInt();
        System.out.print("Enter Rate: ");
        r=sc.nextInt();
        System.out.print("Enter Time: ");
        t=sc.nextInt();
            
        si=p*r*t/100.00f;
        System.out.println("SI = "+si+"%");
    }     
}






