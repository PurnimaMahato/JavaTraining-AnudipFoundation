import java.util.Scanner;
public class Employee
{
public static void main(String args[])
{
int empid;
double salary;
String name;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Employee Id: ");
empid=sc.nextInt();
System.out.println("Enter Salary"); 
salary=sc.nextDouble();
System.out.println("Enter your name:");
sc.nextLine();
name=sc.nextLine();
System.out.println("YOUR GIVEN INFORMATION IS: ");
System.out.println("Employee id: "+empid);
System.out.println("Employee name: "+name);
System.out.println("Employee salary: "+salary);
} }