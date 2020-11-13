//11. Write a program to swap two numbers without using third variable.
import java.util.Scanner;
class Que_11
{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        
        System.out.print("Enter 1st number: ");
        n1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        n2=sc.nextInt();
        
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After swapping:\nn1= "+n1+", n2= "+n2);
    }     
}



