package date;
import java.util.*;
public class Date {
	int dd;
	int mm;
	int yyyy;
	Scanner scan=new Scanner(System.in);
	public Date()
	{
		dd=mm=yyyy=0;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	public void display()
	{
		System.out.print(getDd() + "/" + getMm() +"/" + getYyyy());
		
	}
	
	

}
