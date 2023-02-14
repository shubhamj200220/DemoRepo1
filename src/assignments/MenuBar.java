package assignments;

import java.util.Scanner;                    // MOXIE20093  Shubham Jagdale

public class MenuBar {

	public static void main(String[] args) {
		   
		   System.out.println("To Enter the main menu please select language");
		   System.out.println("Enter 1: For English");
		   System.out.println("Enter 2: For Hindi");
		   System.out.println("Enter 3: For Marathi");
		   System.out.println("______________________________________________");
		   System.out.println("Enter Your Number:");
		   Scanner r=new Scanner(System.in);
		   
		   int a;
		   a=r.nextInt();
		   switch(a) {
		   
		   case 1:
		       System.out.println("10. If your card loss");
		       System.out.println("20. Banking");
		       System.out.println("30. Credit Card");
		       System.out.println("40. Other");
		       System.out.println("____________________________________________");
			     System.out.println("Enter Your Choice:");
			     
			     int c=10;
			       c= r.nextInt();
			       
			      if (c==10) { System.out.println("Enter your Card Detais:");	    	  
			      }
			      else if (c==20) { System.out.println("1. internet Banking");
			                        System.out.println("2. Physical Banking");
			      }
			      else if (c==30) { System.out.println(" Enter your Credit Card Detais");
			      }
			      else if (c==40) { System.out.println("Talk to customer Care");
			      }
			      else { System.out.println("Invalid Choice");
			      }
		       break;
		  
		   case 2:
			   System.out.println("10. अगर आपका कार्ड खो गया है");
			   System.out.println("20. बैंकिंग");
			   System.out.println("30. क्रेडिट कार्ड");
			   System.out.println("40. अन्य");
			   System.out.println("____________________________________________");
			     System.out.println("अपनी पसंद दर्ज करें:");
			     
			     int d=10;
			       c= r.nextInt();
			       
			      if (d==10) { System.out.println("अपने क्रेडिट कार्ड की जानकारी दर्ज करें:");	    	  
			      }
			      else if (d==20) { System.out.println("1. इंटरनेट बैंकिंग");
			                        System.out.println("2. फिजिटल’ बैंकिंग");
			      }
			      else if (d==30) { System.out.println(" अपने क्रेडिट कार्ड जानकारी डालें.");
			      }
			      else if (d==40) { System.out.println("कस्टमर केयर से बात करें");
			      }
			      else { System.out.println("अवैध निवड");
			      }
			   break;
		   
		   case 3:
			   System.out.println("10. तुमचे कार्ड हरवले असेल तर");
			   System.out.println("20. बँकिंग");
			   System.out.println("30. क्रेडिट कार्ड");
			   System.out.println("40. इतर");
			   System.out.println("____________________________________________");
			     System.out.println("आपली कशी पसंद सादर करा:");
			     
			     int m=10;
			       m= r.nextInt();
			       
			      if (m==10) { System.out.println("Enter your Card Detais:");	    	  
			      }
			      else if (m==20) { System.out.println("1. इंटरनेट बैंकिंग");
			                        System.out.println("2. फिजिटल’ बैंकिंग");
			      }
			      else if (m==30) { System.out.println(" आपल्या क्रेडिट कार्डचे डिटेल्स भरा");
			      }
			      else if (m==40) { System.out.println("कस्टमर केअर शी बोला");
			      }
			      else { System.out.println("अवैध निवड");
			      } 
			   break;
			default: System.out.println("Invalid Number");    
		  }
     
	r.close();
   }

}



