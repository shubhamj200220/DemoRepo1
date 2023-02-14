package assignments;
import java.util.*;
public class ShopOwnerProfitLoss {           // MOXIE20093 Shubham Jagdale
	                                         // cost price of bata shoe is 500Rs 
	                                         // there are 4 shop owner each one having 1 shoes
	                                         // and selling this shoes for some amount
public static void main(String[] args) {     // Get this amount from each shop owner
		                                     // show profit and loss                   
            
  Scanner obj=new Scanner (System.in);     
            
    int cost=500;
    int sale;
    System.out.println("Details of 1st customer");
        System.out.println("Coast price of Bata shoes:  500Rs");
        System.out.println("Enter the sale price:  ");
        sale=obj.nextInt();
        double loss;
        double profit;

         if (sale>cost) {
            profit=sale-cost;
            System.out.println("Profit of Shop owner is:  "+((profit/cost)*100)+" %");
         }
         else if(sale<cost) {
            loss=cost-sale;
            System.out.println("Loss of Shop owner is:  "+((loss/cost)*100)+" %");
         }
         else {
            System.out.println("No Profit No loss");
         }
         System.out.println("");
         System.out.println("Details of 2nd customer");
         System.out.println("Coast price of Bata shoes:  500Rs");
         System.out.println("Enter the sale price:  ");
         sale=obj.nextInt();

          if (sale>cost) {
             profit=sale-cost;
             System.out.println("Profit of Shop owner is:  "+((profit/cost)*100)+" %");
          }
          else if(sale<cost) {
             loss=cost-sale;
             System.out.println("Loss of Shop owner is:  "+((loss/cost)*100)+" %");
          }
          else {
             System.out.println("No Profit No loss");
          }
          System.out.println("");
          System.out.println("Details of 3rd customer");
          System.out.println("Coast price of Bata shoes:  500Rs");
          System.out.println("Enter the sale price:  ");
          sale=obj.nextInt();

           if (sale>cost) {
              profit=sale-cost;
              System.out.println("Profit of Shop owner is:  "+((profit/cost)*100)+" %");
           }
           else if(sale<cost) {
              loss=cost-sale;
              System.out.println("Loss of Shop owner is:  "+((loss/cost)*100)+" %");
           }
           else {
              System.out.println("No Profit No loss");
           }
           System.out.println("");
           System.out.println("Details of 4th customer");
           System.out.println("Coast price of Bata shoes:  500Rs");
           System.out.println("Enter the sale price:  ");
           sale=obj.nextInt();

            if (sale>cost) {
               profit=sale-cost;
               System.out.println("Profit of Shop owner is:  "+((profit/cost)*100)+" %");
            }
            else if(sale<cost) {
               loss=cost-sale;
               System.out.println("Loss of Shop owner is:  "+((loss/cost)*100)+" %");
            }
            else {
               System.out.println("No Profit No loss");
            }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
obj.close();

		
		
	}
	
}















