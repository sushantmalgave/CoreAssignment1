//6. Write a program that takes radius of a circle as input. Read the entered radius using Scanner class.
//   Then calculate and print the area and circumference of the circle.
import java.util.Scanner;
class Que_6
{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int r;
        float ar, cir;
        
        System.out.print("Enter Radius of circle: ");
        r=sc.nextInt();
        
        ar=r*r*3.14f;
        cir=2*r*3.14f;
        System.out.println("Area of circle = "+ar+"\nCircumference of circle = "+cir);
    }     
}


