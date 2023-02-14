package assignments;
public class DataType {                                         
public static void main(String[] args) {                        // MOXIE20093 Shubham Jagdale
		
     
	System.out.println("-------Assignment - 1--------");
	  
      byte a=127;                 // declared byte variable 'a' of its maximum value 127 
      short b=32767;              // declared short variable 'b' of its maximum value 32767
      int c=a+b;                  // declared integer variable for 'c' because it can store short and byte
      System.out.println("Sum of a & b is:" +c);
      
      
     
      System.out.println("-------Assignment - 2--------");
      
      int d=2147483647;           // declared integer variable 'd' of its maximum value 2147483647
      long e=b+d;                  // declared integer variable for 'e' because it can store short
      System.out.println("Sum of b & d is:"   +e);
      
      
     
      System.out.println("-------Assignment - 3--------");
      
      float f=2147483647f;        // declared float variable 'd' of its value 2147483647
      double g=d+f;               // declared double variable for 'g' because it can store float & integer
      System.out.println("Sum of d & F is:"     +g);
      
      
      
      
      
        
       
	}

}
