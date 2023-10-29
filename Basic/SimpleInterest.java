import java.util.Scanner;
public class SimpleInterest{
    public static void main(String args[])
    {
        float p , r=7.5f , t , I;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  principle amount :  ");
        p=sc.nextFloat();
        System.out.println("Enter the  time :  ");
        t=sc.nextFloat();
        
        I = (p*r*t)/100 ;
        System.out.println("The simple interest is = "+ I);

        
    }
}