import java.util.Scanner;
/**Mastery Test 2, Part 2,  Practice Question
A class to display ingredients for a scone recipe using a method that scales measurements depending on how many scones are wanted. */
public class LemonadeSconeRecipe{

   // data fields initialised to values needed to make 12 scones
   static int stNumScones = 12;
   static double stdCupsSelfRaisingFlour = 4;
   static double stdMlCream = 300;
   static double stdCupsWhiteSugar = 0.25;
   static double stdMlLemonade = 300;
   static double stdTeaspooonSalt = 0.5;
   
   /** takes a String which will be printed out as a prompt to the user
   returns an int which has been entered via the keybaord */
   public static int readInt(String message){
      Scanner scan = new Scanner(System.in);
      System.out.println(message);
      int input = scan.nextInt();
      return input;
   }
   
   public static void main(String[]args){

   }
   

}
   