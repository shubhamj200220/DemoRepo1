package assignments;

import java.util.Scanner;                        // MOXIE20093 Shubham Jagdale
                                                 // Get number from user 
public class PrimeOrNot {                        // Print number is Prime or not

	public static void main(String[] args) {
		
Scanner P=new Scanner (System.in);
		
		int Number;
		
		System.out.println("Enter any number:");
		
		Number=P.nextInt();
		int a=0;
		
	
		for(int i=2; i<=Number; i++) {
			
			if(Number%2==0) {
				
				a=a+1;
		}
		}
		if (a==0) {
			System.out.println("Number is Prime Number: "+Number);
		}
		else {
			System.out.println("Number is not Prime Number: "+Number);
		}
		P.close();
		
		
		
		

	}

}
