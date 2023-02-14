package assignments;
public class ConditionalStatement2 {
public static void main(String[] args) {                               //  MOXIE20093 Shubham Jagdale
		
		int Marks=56;
		
		if (Marks>100 || Marks<0) {     // If the value of variable is less then 0 or greater than 100 
			System.out.println("Invalid Marks"); //then this statement will execute and print the output
		}
		else if (Marks>40 && Marks<=50) { //If the value of variable greater than equal to 40 & less than equal 50
			System.out.println("Pass");  //then this statement will execute and print the output
		}
		else if (Marks>50 && Marks<=55) {  //  If the value of variable greater than equal to 40 & less than equal 50
			System.out.println("Second Class");  //then this statement will execute and print the output
		}
		else if (Marks>55 && Marks<=60) {   //  If the value of variable greater than equal to 40 & less than equal 50
			System.out.println("Higher Second Class");  //then this statement will execute and print the output
		}
		else if (Marks>60 && Marks<=66) {   //If the value of variable greater than equal to 40 & less than equal 50
			System.out.println("First Class");   //then this statement will execute and print the output
		}
		else if (Marks>66 && Marks<=100) {  //  If the value of variable greater than equal to 40 & less than equal 50
			System.out.println("Distinction");  //then this statement will execute and print the output
		}
		else {                          // When all conditions will false 
			System.out.println("Fail"); // then this statement will be executed and print the output 
		}

	}

}
