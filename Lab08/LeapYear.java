import java.util.Scanner;
public class LeapYear{
   public static void main(String[] args){
      int year = readInt("Enter a year: ");
      if(year < 1582){ // clearer but same as if(!(year >= 1582))
         System.out.println(year + " too early ");
      } else if(year % 400 == 0){
         System.out.println(year + " is a leap year");
      }
   }

   public static int readInt(String prompt){
      Scanner sc = new Scanner(System.in);
      System.out.println(prompt);
      return sc.nextInt();
   }
 
}