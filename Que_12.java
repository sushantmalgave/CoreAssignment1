
//12. In a company an employee is paid as under: If his basic salary is less than Rs. 10000,
//   then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or
//   above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary.
//   If the employee's salary is input by the user write a program to find his gross salary.
//   [ formula : GS= Basic + DA + HRA ]
import java.util.Scanner;
class Que_12
{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        float bsal,bas,hra,da,gsal;
        
        System.out.print("Enter 1st number: ");
        bsal=sc.nextInt();
        
        if(bsal<10000)
        {
            hra=bsal*0.1f;
            da=bsal*0.9f;
        }
        else
        {
            hra=2000;
            da=bsal*0.98f;
        }
        gsal=bsal+da+hra;
        System.out.println("Gross Salery= "+gsal);
    }     
}
