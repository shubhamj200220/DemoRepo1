package assignments;

import java.util.Scanner;        // Shubham Jagdale MOXIE20093
                                 // There are 10 guest at home
public class GuestAtHome {       // ask each of them their name and if they want coffee or not
                                 // Show name of each guest
	                             // Finally show how many guests will have coffee.
	
	
	public static void main(String[] args) {
		
		Scanner obj=new Scanner (System.in);
		
		int yes=0;
		
		for (int i=0; i<10; i++) {
			
			System.out.println("Enter the name of Guest No: "+(i+1));
			String u=obj.nextLine();
			System.out.println("If you want coffe enter Yes if dont then Enter No");
			u=obj.nextLine();
			
			if(u.equals("Yes")) {
				yes=yes+1;
			}	
		}
		obj.close();
		System.out.println("");
		System.out.println(yes+" guest will have caffe ");
		
		

	}

}
















