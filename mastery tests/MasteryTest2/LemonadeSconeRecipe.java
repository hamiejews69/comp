import java.util.Scanner;
/**Mastery Test 2, Part 2,  Practice Question
A class to display ingredients for a scone recipe using a method that scales measurements depending on how many scones are wanted. */
public class LemonadeSconeRecipe{

   // data fields initialised to values needed to make 12 scones
   static double stNumScones = 12;
   static double stdCupsSelfRaisingFlour = 4;
   static double stdMlCream = 300;
   static double stdCupsWhiteSugar = 0.25;
   static double stdMlLemonade = 300;
   static double stdTeaspooonSalt = 0.5;
   
   
     
   public static void main(String[]args){
      recipe();
      
          
      
   }
   
   public static void recipe(){
      Scanner scan = new Scanner(System.in);
      System.out.println("How many Scones");
      double Scones = scan.nextDouble(); //Step 2 - assign next double input from Scanner object
      System.out.println("Flour needed  "+((Scones * (stdCupsSelfRaisingFlour)/12)));
      System.out.println("Cream needed  "+((Scones * (stdMlCream)/12)));
      System.out.println("Sugar needed  "+((Scones * (stdCupsWhiteSugar)/12)));
      System.out.println("Lemonade needed  "+((Scones * (stdMlLemonade)/12)));
      System.out.println("Salr needed  "+((Scones * (stdTeaspooonSalt)/12)));
   
   
      
   
   
   
       //Step 4
   }

   
    /** takes a String which will be printed out as a prompt to the user
   returns an int which has been entered via the keybaord */
   public static int readInt(String message){
      Scanner scan = new Scanner(System.in);
      System.out.println(message);
      int input = scan.nextInt();
      return input;
   }
   
  
   

}
