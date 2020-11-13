//7. Write a program to calculate sum of 5 subject’s marks & find percentage.
//   Take the obtained marks from user using Scanner class.
//   Output should be in this format [ percentage marks = 99 % ].
//   Use concatenation operator here.
import java.util.Scanner;
class Que_7
{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int m, i , sum=0;
        float per;
        
        for(i=1;i<=5;i++)
        {
            System.out.print("Enter marks of subject "+i+": ");
            m=sc.nextInt();
            sum=sum+m;
        }
        per=sum/5.00f;
        System.out.println("Percentage marks = "+per+"%");
    }     
}



