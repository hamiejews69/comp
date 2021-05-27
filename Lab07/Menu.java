import java.util.Scanner;


public class Menu{
   int a;
   int b;
   int c;
   
   public Menu(){}

   public Menu(int aIn, int bIn, int cIn){
      a = aIn;
      b = bIn;
      c = cIn;
   }




/**mutator method for breed*/
   public void setA(int aIn){
      a = aIn;
   }
   /**mutator method for breed*/
   public void setB(int bIn){
      b = bIn;
   }
   /**mutator method for breed*/
   public void setC(int cIn){
      c = cIn;
   }
   
 /**accessor for cat registration number*/
   public int getA(){
      return a;
   }
   /**accessor for dog age*/
   public int getB(){
      return b;
   }
   public int getC(){
      return c;
   }
   
  


}