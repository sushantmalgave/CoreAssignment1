//10. Write a program to convert temperature from Fahrenheit to Celsius.
//    Take Fahrenheit as input using Scanner class.
//    [ formula : C= 5*(f-32)/9 ]
import java.util.Scanner;
class Que_10 
{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int t;
        float c;
        
        System.out.print("Enter Temperature (in *F): ");
        t=sc.nextInt();
        
        c=5*(t-32)/9.0f;
        System.out.println("Temperature in *C is: "+c);
    }     
}

