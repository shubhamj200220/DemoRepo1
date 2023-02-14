package assignments;
public class Method {
	
	int mill (int wheat , int jawar) {       // MOXIE20093 Shubham Jagdale
		
	System.out.println("You have given "+wheat+"kg of wheat and "+jawar+"kg of jawar");
	System.out.println("Rate of wheat is 5Rs per kg and for jawar it is 7Rs per kg ");
				
		return (((wheat*5)+(jawar*7))+15) ;
	}
	
	int mill2 (int wheat , int jawar) {  
		
		System.out.println("You have given "+wheat+"kg of wheat and "+jawar+"kg of jawar");
		System.out.println("Rate of wheat is 5Rs per kg and for jawar it is 7Rs per kg ");
					
			return (((wheat*5)+(jawar*7))+25) ;
		}

	public static void main(String[] args) {    // Rs 15 delivery charges added for first 9 
		                                        // customers and Rs 25 for others 
		Method obj=new Method();
		
		
	System.out.println("With Rs15 delivery cgarges total amount of Ram to be paid is: "+obj.mill(12,55)+"Rs");
	System.out.println("");
	System.out.println("With Rs15 delivery cgarges total amount of Shyam to be paid is: "+obj.mill(5,45)+"Rs");
	System.out.println("");
	System.out.println("With Rs15 delivery cgarges total amount of Seeta to be paid is: "+obj.mill(43,70)+"Rs");
	System.out.println("");
	System.out.println("With Rs15 delivery cgarges total amount of Gita to be paid is: "+obj.mill(56,80)+"Rs");
	System.out.println("");
	System.out.println("With Rs15 delivery cgarges total amount of Rahul to be paid is: "+obj.mill(19,30)+"Rs");
	System.out.println("");
	System.out.println("With Rs15 delivery cgarges total amount of Ramesh to be paid is: "+obj.mill(23,21)+"Rs");
	System.out.println("");
	System.out.println("With Rs15 delivery cgarges total amount of Anu to be paid is: "+obj.mill(15,43)+"Rs");
	System.out.println("");
	System.out.println("With Rs15 delivery cgarges total amount of Deepika to be paid is: "+obj.mill(10,56)+"Rs");
	System.out.println("");
	System.out.println("With Rs15 delivery cgarges total amount of Prashant to be paid is: "+obj.mill(20,5)+"Rs");
	System.out.println("");
	System.out.println("With Rs25 delivery cgarges total amount of Sakshi to be paid is: "+obj.mill2(42,20)+"Rs");
	System.out.println("");
	System.out.println("With Rs25 delivery cgarges total amount of Harshal to be paid is: "+obj.mill2(15,15)+"Rs");
	System.out.println("");
	System.out.println("With Rs25 delivery cgargestotal amount of Vijay to be paid is: "+obj.mill2(25,10)+"Rs");
	System.out.println("");
	System.out.println("With Rs25 delivery cgarges total amount of Chirag to be paid is: "+obj.mill2(65,5)+"Rs");
	System.out.println("");
	System.out.println("With Rs25 delivery cgarges total amount of Gopal to be paid is: "+obj.mill2(75,18)+"Rs");
	System.out.println("");
	System.out.println("With Rs25 delivery cgarges total amount of Govind to be paid is: "+obj.mill2(30,20)+"Rs");
	System.out.println("");
	System.out.println("With Rs25 delivery cgarges total amount of Rajkumari to be paid is: "+obj.mill2(76,50)+"Rs");
	System.out.println("");
	System.out.println("With Rs25 delivery cgarges total amount of Govindraj to be paid is: "+obj.mill2(89,30)+"Rs");
	System.out.println("");
		
		
		

	}

}
