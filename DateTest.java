package date;

import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
		Date d1=new Date();
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter the day:");
		int a=in.nextInt();
		d1.setDd(a);
		
		System.out.print("Enter the Month:");
		int b=in.nextInt();
		d1.setMm(b);
		
		System.out.print("Enter the year:");
		int c=in.nextInt();
		d1.setYyyy(c);
		d1.display();
	

	}

}
