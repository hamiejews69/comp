/** 
*/
public class Guitar{
   private int numStrings;
   private boolean acoustic;
   private String brand;
   
   /**                           */
     
   
   
   
  /** public Book(String titleIn, String authorIn,  int yearIn, double priceIn){
      title = titleIn;
      author = authorIn;
      year = yearIn;
      price = priceIn;
   /**                           */
  
   public Guitar(int nS, boolean ac, String br){
      numStrings = nS;
      acoustic = ac;
      brand = br;
   }
   
   
   /**                           */
   public void setNumStrings(int nS){
      numStrings = nS;
   }
   
   /**                           */
   public int getNumStrings(){
      return numStrings;
   }
   public void displayGuitar(){
      System.out.println( numStrings + " number of strings" );
   }
   

}