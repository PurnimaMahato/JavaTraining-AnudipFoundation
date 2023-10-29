import java.util.Scanner;
public class RectArea{
    public static void main(String args[])
    {
        float length,breadth,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length=sc.nextFloat();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth=sc.nextFloat();
        area = length * breadth ;
        System.out.println("The area of the rectangle is = "+ area);

        
    }
}