package assignments;

import java.util.Scanner;

public class CostOfPenClass2 {               // Shubham Jagdale MOXIE20093
                                             // Cost of a pen per piece is Rs. 7 and It's GST is 6%
	                                         // Take numbers of pens brought in each class from user
	                                         // show total cost with GST
	public static void main(String[] args) {
		
		CostOfPenClass1 obj=new CostOfPenClass1();
		Scanner s=new Scanner (System.in);
		int cost2=obj.Pencost+2;
		System.out.println("Cost of pen is: "+cost2+" Rs");
		System.out.println("Enter the number of Pens you have brought:");
		int num=s.nextInt();
		int totalcost=num*cost2;
		System.out.println("Total cost: "+totalcost+" Rs");
		System.out.println("Amount to be paid with 6% GST: "+(totalcost+(totalcost*.06))+" Rs");
		s.close();
	
		
		

	}

}
















