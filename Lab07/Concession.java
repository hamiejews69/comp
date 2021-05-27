import java.util.Scanner;
/** Chapter 7 Lab Example
*/
public class Concession{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter age");
      int age = scan.nextInt();
      System.out.println("Concession for age " + age + " is " +
         concessionPercent(age)+"%");
   }
/** return concession percent for age */
   public static int concessionPercent(int age){
      if (age < 5){
         return 100;
      }else if(age <= 16){
         return 50;
      }else if(age >= 65){
         return 65;
      }else {
         return 0;
      }
   }
}