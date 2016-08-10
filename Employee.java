package employee;
import java.util.*;
public class Employee {
	String firstname,lastname;
	double salary;
	Scanner input=new Scanner(System.in);

	public Employee()
	{
	
	}
	public Employee(String x,String y,double z)
	{
		firstname=x;lastname=y;salary=z;
	}
public void setDetails()
{
	System.out.print("Enter the details : \n enter first name : ");
	firstname=input.next();
	System.out.println("Enter the last name :");
	lastname=input.next();
	System.out.println("Enter the monthly salary :");
	salary=input.nextDouble();
	}
public void getDetails()
{
	System.out.println("Name of employee :"+firstname+lastname + "\n" + "salary of employee"+salary);
}
public void cal()
{
	System.out.println("Salary per month : "+salary + "\n" + "salary per annum : "+salary*12);
	System.out.println("Increment with 10% : "+(salary*12+(0.1*salary)));
}

}
