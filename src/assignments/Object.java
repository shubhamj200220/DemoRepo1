package assignments;

public class Object {

	
	   int tyre;
	   int seat;
	   int speed;
	   int bakarwadi;
	public static void main(String[] args) {
		
		Object bus=new Object ();
		Object truck=new Object ();
		Object Aeroplane=new Object ();

		 bus.tyre=4;
		 bus.seat=40;
		 bus.speed=120;
		 System.out.println("Bus has"+bus.tyre+"tyres and seats are"+bus.seat+"and speed is"+bus.speed);
		 
		 truck.tyre=8;
		 System.out.println(truck.tyre);
		
		 Aeroplane.tyre=3;
		 System.out.println(Aeroplane.tyre);
	}
	
	

}
