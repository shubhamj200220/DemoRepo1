package assignments;

public class ClassOf10 {                            // MOXIE20093 Shubham Jagdale
	
	double classpresenti (double P , int A){
		
		int student=10;
		System.out.println("Total student: "+student);
		System.out.println("Present Student: "+P);
		System.out.println("Absent Student: "+A);
		
		
		return (P/student*100);
	}

	public static void main(String[] args) {
		
		
		ClassOf10 obj=new ClassOf10 ();
		
		System.out.println("Tota Present Student: "+obj.classpresenti(6, 4)+"%");
		

	}

}














