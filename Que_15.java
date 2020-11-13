//15. Accept person’s gender (character m for male and f for female), age (integer),
//    as input and then check whether person is eligible for marriage or not.
import java.util.Scanner;
class Que_15
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter your Gender (M/F): ");
        char gen=sc.next().charAt(0);
        System.out.print("Enter your Age: ");
        int age=sc.nextInt();
        if(gen=='M' && age>=21)
            System.out.println("You are ELIGIBLE for marriage.");
        else if(gen=='F' && age>=18)
            System.out.println("You are ELIGIBLE for marriage.");
        else
            System.out.println("You are NOT ELIGIBLE for marriage.");
    }     
}
