import java.util.Scanner;

public class intSwapper{
   public static void main (String [] args){
   
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter low? ");
      int low = scan.nextInt();
      System.out.println("enter high");
      int high = scan.nextInt();
      int tempStore = 0; 
      System.out.println(low + " " + high);
      
      
      if (low > high) tempStore = 1;
      
      switch(tempStore){
      
         case 1:
            high = low;
            break;
      
      
      
      }
      System.out.println("The high is " + high);
     
      
   
      
   
   
   }
   
   
  
  
   
   public static int readInt(String prompt){
      Scanner sc = new Scanner(System.in);
      System.out.println(prompt);
      return sc.nextInt();
   }






}




