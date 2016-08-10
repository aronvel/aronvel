package employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee a=new Employee("Aron","Vel",100000);
		Employee b=new Employee();
		a.getDetails();
		a.cal();
		b.setDetails();
		b.getDetails();
		b.cal();


	}

}
