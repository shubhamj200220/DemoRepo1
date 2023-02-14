package assignments;

import java.util.Scanner;                     // Shubham Jagdale MOXIE20093
                                              // There are 10 bill payers, each have to pay an amount.
public class BillPayers {                     // Get the bill amount from the user, add 10% Discount
                                              // show total amount to be paid 
	public static void main(String[] args) {
		
		Scanner bill=new Scanner (System.in);
		
		int amount;
		
		
		for (int i=0; i<10; i++) {
		
			System.out.println("Enter the bill of Customer No: "+(i+1));
			amount=bill.nextInt();
			System.out.println("Bill to be paid with 10% of discount: "+(amount-(amount*0.10))+" Rs");
			System.out.println("");	
		}
       bill.close();
	}

}























