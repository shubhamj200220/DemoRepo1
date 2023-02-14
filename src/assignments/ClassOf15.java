package assignments;

public class ClassOf15 {                        // MOXIE20093 Shubham Jagdale

double classpresenti2 (double P , int A){
		
		int students=15;
		System.out.println("Total student: "+students);
		System.out.println("Present Student: "+P);
		System.out.println("Absent Student: "+A);
		
		
		return (P/students*100);
	}

	public static void main(String[] args) {
		
		
		ClassOf15 obj=new ClassOf15 ();
		
		System.out.println("Tota Present Student: "+obj.classpresenti2(10, 5)+"%");
		

	}
}

















