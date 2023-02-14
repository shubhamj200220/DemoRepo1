package assignments;

import java.util.Scanner;

public class CostOfPenClass3 {                  // Shubham Jagdale MOXIE20093
                                                // Cost of a pen per piece is Rs. 10 and It's GST is 6%
	                                            // Take numbers of pens brought in each class from user
	                                            // show total cost with GST
	public static void main(String[] args) {
		
		CostOfPenClass1 obj=new CostOfPenClass1();
		Scanner s=new Scanner (System.in);
		int cost3=obj.Pencost+5;
		System.out.println("Cost of pen is: "+cost3+" Rs");
		System.out.println("Enter the number of Pens you have brought:");
		int num=s.nextInt();
		int totalcost=num*cost3;
		System.out.println("Total cost: "+totalcost+" Rs");
		System.out.println("Amount to be paid with 10% GST: "+(totalcost+(totalcost*.10))+" Rs");
		s.close();
		
		
		
		

	}

}

















