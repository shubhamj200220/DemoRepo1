package assignments;

import java.util.Scanner;                      // MOXIE20093 Shubham Jagdale
                                               // Get number from user 
public class OddOrEven {                       // Print number is even or odd

	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		
		int Number;
		
		System.out.println("Enter any number:");
		
		Number=s.nextInt();
		
		if (Number%2==0) {
			
			System.out.println("Number is even:  "+Number);
		}
		else {
			
			System.out.println("Number is Odd:  "+Number);
		}
		s.close();
		
	}

}



















