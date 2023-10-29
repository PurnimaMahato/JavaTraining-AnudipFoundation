import java.util.Scanner;
public class Calc{
    public static void main(String args[])
    {
        float a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :  ");
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.out.println("the addition is " + (a+b)); 
        System.out.println("the subtraction is " + (a-b)); 
        System.out.println("the multiplication is " + (a*b)); 
        System.out.println("the division is " + (a/b));
        System.out.println("the remainder is " + (a%b));
        
    }
}