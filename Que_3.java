//3. Find the result of following expressions. You need to determine the primitive data type of the variable
//   by looking carefully the given expression and initialize variables by any random value.
//   A. y = x2 + 3x - 7 (print value of y) 
//   B. y = x++ + ++x (print value of x and y) 
//   C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
//   D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
import java.util.Scanner;
class Que_3
{
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        int x, y, z;
        boolean g, e, f;
        
        System.out.print("Enter x: ");
        x=sc.nextInt();
        y=x*x+3*x-7;
        System.out.println("A. y = x^2 + 3x - 7\n   y = "+y);
        
        y=x++ + ++x;
        System.out.println("\nB. z = x++ + ++x\n   x = "+x+"\n   y = "+y);
        
        z= x++ - --y - --x + x++;
        System.out.println("\nC. y = x++ - --y - --x + x++\n   x = "+x+"\n   y = "+y+"\n   z = "+z);
        
        System.out.print("\nEnter boolean x: ");
        e=sc.nextBoolean();
        System.out.print("Enter boolean y: ");
        f=sc.nextBoolean();
        g= e && f || !(e || f);
        System.out.println("D. y = x && y || !(x || y)\n   z = "+g);
    }     
}