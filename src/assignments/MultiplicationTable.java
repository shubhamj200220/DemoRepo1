package assignments;

import java.util.Scanner;                   // MOXIE20093 Shubham Jagdale
                                            // Get number from user 
public class MultiplicationTable {          // Print multiplication table  

	public static void main(String[] args) {
		
		Scanner obj=new Scanner (System.in);
		
		System.out.println("Enter Number for Multiplication table");
		
		int m;
		
		m=obj.nextInt();
		int i;
		for ( i=1;i<=10;i++) {
			
			System.out.println("");
			System.out.println(m+" x "+i+" = "+m*i);
		
		
			obj.close ();
		}
			
	}
}

























