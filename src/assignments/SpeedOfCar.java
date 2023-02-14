package assignments;

import java.util.Scanner;                    // MOXIE20093 Shubham Jagdale
                                             // Get Distance and time in minutes from 5 car Owners
public class SpeedOfCar {                    // Output should be speed of Car in km/hr

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
		double Km;
		double time;
		
		System.out.println("Details of Owner No-1");
		System.out.println("Enter the distance you have travelled: "); 
		Km=obj.nextDouble();
		System.out.println("Enter the Time in Minutes you have travelled: ");
		time=obj.nextDouble();
		System.out.println("Speed of vehical: "+(Km/time)*60+"km/hr");
		System.out.println("");
		System.out.println("Details of Owner No-2");
		System.out.println("Enter the distance you have travelled: "); 
		Km=obj.nextDouble();
		System.out.println("Enter the Time in Minutes you have travelled: ");
		time=obj.nextDouble();
		System.out.println("Speed of vehical: "+(Km/time)*60+"km/hr");
		System.out.println("");
		System.out.println("Details of Owner No-3");
		System.out.println("Enter the distance you have travelled: "); 
		Km=obj.nextDouble();
		System.out.println("Enter the Time in Minutes you have travelled: ");
		time=obj.nextDouble();
		System.out.println("Speed of vehical: "+(Km/time)*60+"km/hr");
		System.out.println("");
		System.out.println("Details of Owner No-4");
		System.out.println("Enter the distance you have travelled: "); 
		Km=obj.nextDouble();
		System.out.println("Enter the Time in Minutes you have travelled: ");
		time=obj.nextDouble();
		System.out.println("Speed of vehical: "+(Km/time)*60+"km/hr");
		System.out.println("");
		System.out.println("Details of  Owner No-5");
		System.out.println("Enter the distance you have travelled: "); 
		Km=obj.nextDouble();
		System.out.println("Enter the Time in Minutes you have travelled: ");
		time=obj.nextDouble();
		System.out.println("Speed of vehical: "+(Km/time)*60+"km/hr");

		obj.close ();
	}
}