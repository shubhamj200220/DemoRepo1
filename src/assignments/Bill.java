package assignments;

import java.util.Scanner;               //  MOXIE20093 Shubham Jagdale

public class Bill {

	public static void main(String[] args) {

		Scanner B=new Scanner (System.in);
		
		System.out.println("Enter Your Name:");
		String s1=B.nextLine();
		System.out.println("Enter Your table No:");
		int a1=B.nextInt();
		System.out.println("Number of Pav Bhaaji:");
		int a2=B.nextInt();
		System.out.println("Number of extra Pav:");
		int a3=B.nextInt();
		System.out.println("");
		
		int cost=50;
		int extrapav=10;
		
	
		if (s1.equals("Ram") && a1==1 ) {
			
			System.out.println("Customer Name:  "+s1 );
			System.out.println("Number of pav bhaji:  "+a2 );
			System.out.println("Number of extra Pav:  "+a3 );
			System.out.println("Rate of pav bhaaji:  "+cost );
			System.out.println("Rate of extra pav:  "+extrapav );
			System.out.println("Your Bil to be paid:  "+((cost*a2)+(extrapav*a3)) );
		}
		else if (s1.equals("Shyam") && a1==2 ) {
			
			System.out.println("Customer Name:  "+s1 );
			System.out.println("Number of pav bhaji:  "+a2 );
			System.out.println("Number of extra Pav:  "+a3 );
			System.out.println("Rate of pav bhaaji:  "+cost );
			System.out.println("Rate of extra pav:  "+extrapav );
			System.out.println("Your Bil to be paid:  "+((cost*a2)+(extrapav*a3)) );
		}
		else if (s1.equals("Seeta") && a1==3 ) {
			
			System.out.println("Customer Name:  "+s1 );
			System.out.println("Number of pav bhaji:  "+a2 );
			System.out.println("Number of extra Pav:  "+a3 );
			System.out.println("Rate of pav bhaaji:  "+cost );
			System.out.println("Rate of extra pav:  "+extrapav );
			System.out.println("Your Bil to be paid:  "+((cost*a2)+(extrapav*a3)) );
		}
		else if (s1.equals("Gita") && a1==4 ) {
			
			System.out.println("Customer Name:  "+s1 );
			System.out.println("Number of pav bhaji:  "+a2 );
			System.out.println("Number of extra Pav:  "+a3 );
			System.out.println("Rate of pav bhaaji:  "+cost );
			System.out.println("Rate of extra pav:  "+extrapav );
			System.out.println("Your Bil to be paid:  "+((cost*a2)+(extrapav*a3)) );
		}
       else if (s1.equals("Rahul") && a1==5 ) {
			
			System.out.println("Customer Name:  "+s1 );
			System.out.println("Number of pav bhaji:  "+a2 );
			System.out.println("Number of extra Pav:  "+a3 );
			System.out.println("Rate of pav bhaaji:  "+cost );
			System.out.println("Rate of extra pav:  "+extrapav );
			System.out.println("Your Bil to be paid:  "+((cost*a2)+(extrapav*a3)) );
		}
       else {
    	   System.out.println("Invalid Name or Table number ");
       }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		B.close();	
	}	
}
