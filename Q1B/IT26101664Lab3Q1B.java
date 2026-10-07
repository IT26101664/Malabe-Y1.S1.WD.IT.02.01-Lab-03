import java.util.Scanner;

public class IT26101664Lab3Q1B{
	public static void main(String[] args){
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		double price = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy");
		double kg= input.nextDouble();
		
		double total = price * kg; 
		double discount = price * kg *10/100;
		double finalamount =  total - discount;
		
		System.out.println();
		System.out.println("the total amount with 10% discount: "+ finalamount );
	}
}