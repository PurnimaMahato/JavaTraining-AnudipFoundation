import java.util.Scanner;
public class Average{
    public static void main(String args[])
    {
        double num1 , num2 , num3 , avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :  ");
        num1 = sc.nextDouble();
	num2 = sc.nextDouble();
	num3 = sc.nextDouble();
      	avg = (num1 + num2 + num3)/3;
        System.out.println("The average is " + avg); 
        
    }
}