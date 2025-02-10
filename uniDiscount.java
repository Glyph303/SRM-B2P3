public class uniDiscount {

   public static void main(String[] args) {

      // Declare variable values
      String name = "";
      
      double uniFee = 124000;
      double discountPercent = 10;
      double discount  = uniFee * (discountPercent/100);
	  double discountedFee = uniFee - discount;
	 
	  
   
      // Print the output
      System.out.println("The University fee is " + uniFee);
      System.out.println("After discount the fee is " + discountedFee) ;
   }
}
