import java.util.Scanner;


public class StockItem{
   private String name;
   private String description;
   private double costPrice;
   private double retailPrice;
   
   public StockItem(){}
   
   public StockItem(String nameIn, String descriptionIn, double cpIn, double rpIn){ //constructor
      name = nameIn;
      description = descriptionIn;
      costPrice = cpIn;
      retailPrice = rpIn;
       
     
   }
   
   public void setName(String nameIn){
      name = nameIn;
   } 
   
   public void setDesc(String descriptionIn){
      description = descriptionIn;
   }
   
   public void setCP(double cpIn){
      costPrice = cpIn;
   }
   
    public void setRP(double rpIn){
      retailPrice = rpIn;
   }
   
   /*accessor for model*/ 
   
   public String getName(){
      return name;
   }
   
   
   /**accessor for cat registration number*/
   public String getDesc(){
      return description;
   }
   
   /**accessor for cat registration number*/
   public double getCP(){
      return costPrice;
   }
   public double getRP(){
      return retailPrice;
   }

   
   
   
   
   
   
   
   public void displayCosts(){
      System.out.println("name: " + name + " description:  " + description + " Cost price: " + costPrice + " Retail price: " + retailPrice );
   }
     

   
   










}