import java.util.Scanner;
public class Salary{
    public static void main(String args[])
    {
        float BS , HRA , DA , GS ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary :  ");
        BS=sc.nextFloat();
        
        HRA = BS * 0.1f ;
        DA = BS * 0.5f ;
        GS = BS + HRA + DA ;
        System.out.println("The gross salary is " + GS); 
        
    }
}