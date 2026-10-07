import java.util.Scanner;

public class IT26101664Lab3Q2{
	public static void main (String[] args){
	
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter the monthly salary:");
	double salary = input.nextDouble();
 	
    System.out.print("Enter the OT hourly rate:");
	double othours = input.nextDouble();
	
	System.out.print("Enter the number of OT hours:");	
	double otRate = input.nextDouble();

    double otamount = othours * otRate;
	double totalsalary= salary + otamount;
	
	System.out.println();
	System.out.println("the total salary including OT is : " + totalsalary );
	}
}
