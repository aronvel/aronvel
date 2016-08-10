package removeduplicate;
import java.util.*;

public class Array {
	public static void main(String[] args) {
		int i,a,j,k,z=0,b=0;
		Scanner scan=new Scanner(System.in);
		int []A=new int[5];
		System.out.println("enter the elements of array");
		for(i=0;i<5;i++)
		{	
			b=0;
			a=scan.nextInt();
			if(a<9 || a>100)
			{
				System.out.println("Enter a number btn 10-100");
				continue;
			}
			for(j=0;j<=i;j++)
			{
				if(A[j]==a)
				{
					b=1;
				}
			}
				if(b==0)
				{
					A[z]=a;
					z++;
					System.out.print("The elements of array are : ");
					for(k=0;k<z;k++)
					{
						System.out.print(+A[k]+ " ");
					}
				}
				else
				{
					System.out.print("The elements of array are : ");
					for(k=0;k<z;k++)
					{
						System.out.print(+A[k] + " ");
					}
			}
		}

}
}
