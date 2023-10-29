import java.util.Scanner;
public class CirArea{
    public static void main(String args[])
    {
        float radius , area , pi=3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius=sc.nextFloat();
        
        area = pi*radius*radius ;
        System.out.println("The area of the circle is = "+ area);

        
    }
}