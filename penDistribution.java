public class penDistribution {

   public static void main(String[] args) {

      // Declare variable values
      String name = "";
      
      double numPen = 14;
      double numStudent = 3;
      double remainder  = numPen % numStudent;
	  double divPen = numPen / numStudent;
	  
   
      // Print the output
      System.out.println("Pens left are " + remainder);
      System.out.println("Each student gets " + divPen) ;
   }
}
