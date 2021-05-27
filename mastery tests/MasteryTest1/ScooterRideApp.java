import java.util.Scanner;

public class ScooterRideApp{
   public static final double UNLOCK_FEE = 1.5;
   public static final double COST_PER_MINUTE = 0.3;

   public static void main (String[]args){
   }

   /**Add a method here that calculates and returns the estimated cost of a scooter ride*/
  
 

   /** A method that takes a String which will be printed out as a prompt to the user
   and returns a double which has been entered via the keybaord */
   public static double readDouble(String message){
      Scanner scan = new Scanner(System.in);
      System.out.println(message);
      double input = scan.nextDouble();
      return input;
   }

}