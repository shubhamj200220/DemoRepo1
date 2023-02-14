package assignments;

import java.util.Scanner;                   // Shubham Jagdale MOXIE20093
                                            // Cost of a pen per piece is Rs. 5 and It's GST is 2%
public class CostOfPenClass1 {              // Take numbers of pens brought in each class from user      
                                            // show total cost with GST
	  int Pencost=5;
	
	public static void main(String[] args) {
		
		CostOfPenClass1 obj=new CostOfPenClass1();
		Scanner s=new Scanner (System.in);
		int totalcost;
		System.out.println("Cost of pen is: "+obj.Pencost+" Rs");
		System.out.println("Enter the number of Pens you have brought:");
		int num=s.nextInt();
		totalcost=num*obj.Pencost;
		System.out.println("Total cost: "+totalcost+" Rs");
		System.out.println("Amount to be paid with 2% GST: "+(totalcost+(totalcost*.02))+" Rs");
		s.close();
	}
}


























