package assignments;
public class ConditionalSatement {
public static void main(String[] args) {                                              // MOXIE20093 Shubham Jagdale
		
int a=78;
		
	if (a==75)                      // In this condition if value of variable 'a' is 75 then it wii execute and print the output 
		{
		System.out.println("Value is Potive & Equal to 75:"  +a);
		}
		else if (a<=100 && a>0)     // If value of variable is positive & less than 100, then it will enter in nested if condition 
		{
		     if(a>50 && a<60)       // If value is in between 50 & 60 then it will execute and print the output
		     {
		      System.out.println("Value is Positive & Between 50 & 60:"   +a);
		     }
		     else                   // If value is not in between 50 & 60 then it will execute and print the output 
		     {
		      System.out.println("Value is positive & less than 100:"   +a);
		     }
		}
		else if (a<0)               // If value of variable is negative then it will directly execute and print the output 
		{
	    System.out.println("Value is negative");
		}
    else                            // If the value of variable is greater than 100 then this will be executed and print the output
		{
		System.out.println("Invalid Data");
		}
}

}
