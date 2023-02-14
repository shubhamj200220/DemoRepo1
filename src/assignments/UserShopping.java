package assignments;

import java.util.Scanner;                       // MOXIE20093 Shubham Jagdale
                                                // The price of a T-Shirt is 500Rs & GST is 10% 
public class UserShopping {                     // Shoes is 800Rs & GST is 18% 
	                                            // jacket is 1200Rs & GST is 5%
	public static void main(String[] args) {    // Show the user these details
		                                        // Ask what he wants to buy and how much quantity
		Scanner s=new Scanner (System.in);      // Show the user entire amount to be paid with GST 
		
		int Tshirt=500;
		int Shoes=800;
		int Jacket=1200;
		
		System.out.println("1. T-Shirt is  "+Tshirt+" Rs with GST 10% ");
		System.out.println("2. Shoes is    "+Shoes+" Rs with GST 18% ");
		System.out.println("3. Jacket is   "+Jacket+" Rs with GST 5% ");
		System.out.println("");
		System.out.println("Enter your choice");
		
		int Choice;
		int Qty;
		Choice=s.nextInt();
		System.out.println("Enter Quantity: ");
		Qty=s.nextInt();
		
switch(Choice) {
		
case 1: 
System.out.println("To buy T-shirt amount to be paid with 10% GST is: "+(Tshirt+(Tshirt*.10))*Qty);
break;
		
case 2: 
System.out.println("To buy Shoes amount to be paid with 18% GST is: "+(Shoes+(Shoes*.18))*Qty);
break;
		
case 3: 
System.out.println("To buy Jacket amount to be paid with 5% GST is: "+(Jacket+(Jacket*.05))*Qty);
break;	
		}
		s.close();
		
		
		
		

	}

}
