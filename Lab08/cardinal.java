import java.util.Scanner;

public class cardinal{
   public static void main (String [] args){
   
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter number? ");
      int input = scan.nextInt();
      int number = 0; 
      
      
      
      if (input % 10 == 1) number = 1;
      else if (input % 10 == 2) number = 2;
      else if (input % 10 == 3) number = 3;
      else if (input % 10 >= 4) number = 4;
      else if (input % 100 == 1) number = 5;
      else if (input % 100 == 2) number = 6;
      else if (input % 100 == 3) number = 7;
      else if(input % 100 >= 4) number = 8;

   
   
      
      switch(number){
      
         case 1:
            System.out.println(input + "st" );
            break;
         case 2:
            System.out.println(input + "nd" );
            break;
            
         case 3:
            System.out.println(input + "rd" );
            break;
            
         case 4:
            System.out.println(input + "th" );
            break;
      
      
      
         case 5:
            System.out.println(input + "st" );
            break;
            
         case 6:
            System.out.println(input + "nd" );
            break;
            
         case 7:
            System.out.println(input + "rd" );
            break;
            
         case 8:
            System.out.println(input + "th" );
            break;
      
      
      
      
      
            
         
      
      
      
      }
      
     
      
   
      
   
   
   }
   
   
  
  
   
   public static int readInt(String prompt){
      Scanner sc = new Scanner(System.in);
      System.out.println(prompt);
      return sc.nextInt();
   }






}




