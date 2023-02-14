package assignments;
public class ConditionStatement3 {
public static void main(String[] args) {                                      // MOXIE20093  Shubham Jagdale
		
int Marks=100;
		
		if (Marks>100 || Marks<0) {    // If the value of variable is less then 0 or greater than 100 
			System.out.println("Invalid Marks"); //then this statement will execute and print the output
		}
		else if (Marks>66) {  // If the value of variable greater than 66 & less than equal 100
			System.out.println("Distinction");  //then this statement will execute and print the output
		}
		else if (Marks>60) {   // If the value of variable greater than 60 & less than equal 66
			System.out.println("First Class");  //then this statement will execute and print the output
		}
		else if (Marks>55) {   // If the value of variable greater than 55 & less than equal 60
			System.out.println("Higher Second Class");  //then this statement will execute and print the output
		}
		else if (Marks>50) {   // If the value of variable greater than 50 & less than equal 55
			System.out.println("Second Class");   //then this statement will execute and print the output
		}
		else if (Marks>40) {   // If the value of variable greater than equal to 40 & less than equal 50
			System.out.println("Pass");  //then this statement will execute and print the output
		}
		else {                          // When all conditions will false 
			System.out.println("Fail"); // then this statement will be executed and print the output 
		}

	}

}
