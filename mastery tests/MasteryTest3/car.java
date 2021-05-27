import java.util.Scanner;


public class car{
   private String model;
   private int year;
   
   public car(){}
   
   public car(String modelIn, int yearIn){ //constructor
      model = modelIn;
      year = yearIn;
       
     
   }
   
   /*public void setModel(String modelIn){
      model = modelIn;
   } */
   
   public void setYear(int yearIn){
      year = yearIn;
   }
   
   /**accessor for model 
   public String getModel(){
      return model;
   }
   */
   
   /**accessor for cat registration number*/
   public int getYear(){
      return year;
   }
   
   
   public void displayCar(){
      System.out.println( model + " - " + year);
   }


   
   










}