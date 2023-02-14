package assignments;

public class Kolhapur {                          // MOXIE20093 Shubham Jagdale

	public static void main(String[] args) {
		
		Mumbai N=new Mumbai ();
		
		
		double kolhprice=6;
		int salecount=100;
		
		if (kolhprice>N.costprice) {
			
			double profit=kolhprice-N.costprice;
			double Saleprofit=profit*salecount;
			System.out.println("Tota profit is:  "+Saleprofit);
			System.out.println("Kolhapur sale profit is:  "+(profit/N.costprice)*100+" %");
		}

	}

}

























