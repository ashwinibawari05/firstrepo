package firstrepo1;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Please Enter Decimal Number = ");
		int decimal = scan.nextInt();
				 
       String OctalVal = Integer.toOctalString(decimal);
       System.out.println("Octal value of " + decimal + "D is " + OctalVal);
       
		
	//int i = 0100;
	//System.out.println(i) ;
	
	//int m = 056;
	//System.out.println(m) ;
	
	//int x = 078;
	//System.out.println(x);
		
	//int b = 01453;
	//System.out.println(b) ;
	
	//int c = 01453;
	//System.out.println(c) ;
	
	//int d = 0544;
	//System.out.println(d) ;
		
}
	
}