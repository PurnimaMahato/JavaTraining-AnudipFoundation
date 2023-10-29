import java.util.Scanner;
public class UserInput{
    public static void main(String args[])
    {
        float num1,num2,res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1=sc.nextFloat();
        num2=sc.nextFloat();
        res = num1+num2;
        System.out.println("Addition = "+ res);

        
    }
}