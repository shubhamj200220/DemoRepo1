package assignments;
import java.util.Scanner;                        // Shubham Jagdale MOXIE20093

public class ArrayCommodity {

	public static void main(String[] args) {
		
		int price;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the price for Commodity");
		
		String a[]= {"Food","Electronics","Clothing","Automobile","ImportedGoods"};
		
		System.out.println(a[0]);
		price=s.nextInt();
		double Food=price+(price*.02);
		System.out.println(a[1]);
		price=s.nextInt();
		double Electronics=(price+(price*.05));
		System.out.println(a[2]);
		price=s.nextInt();
		double Clothing=(price+(price*.12));
		System.out.println(a[3]);
		price=s.nextInt();
		double Automobile=(price+(price*.035));
		System.out.println(a[4]);
		price=s.nextInt();
		double ImportedGoods=(price+(price*.28));
		
	System.out.println("");	
	System.out.println("For "+a[0]+" Adding 2% of GST:    "+Food+" Rs");
	System.out.println("For "+a[1]+" Adding 5% of GST:    "+Electronics+" Rs");
	System.out.println("For "+a[2]+" Adding 12% of GST:   "+Clothing+" Rs");
	System.out.println("For "+a[3]+" Adding 3.5% of GST:  "+Automobile+" Rs");
	System.out.println("For "+a[4]+" Adding 28% of GST:   "+ImportedGoods+" Rs");
	System.out.println("");	
	System.out.println("Total price of commodity: "+(Food+Electronics+Clothing+Automobile+ImportedGoods)+" Rs");	
	
	
		
		
		
		
		
		
     s.close();
	}

}
