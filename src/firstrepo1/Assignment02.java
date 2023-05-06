package firstrepo1;

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args)
	{
		int coin[]= {10, 5,2,1};
		
					
		Scanner scan= new Scanner(System.in);
		
		System.out.println("what is the price?");
		double price = scan.nextDouble();
		System.out.println("Price is" + price);
		
		Scanner scan1= new Scanner(System.in);
		System.out.println("what is the amount paid?");
		double paid = scan.nextDouble();
		System.out.println("Amount paid is " + paid);
		
		
		double givereturn = ( paid - price);
		System.out.println("Return is "+ givereturn);
		{
		if (givereturn == 0) return 0;
		}
		
		
	
		
scan.close();
			}

}
