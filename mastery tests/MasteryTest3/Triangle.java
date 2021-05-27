import java.util.Scanner;


public class Triangle{
   private String name;
   private double height;
   private double width;
   
   public Triangle(){}
   
   public Triangle(String nameIn, double heightIn, double widthIn){ //constructor
      name = nameIn;
      height = heightIn;
      width = widthIn;
       
     
   }
   
   public void setName(String nameIn){
      name = nameIn;
   } 
   
   public void setHeight(double heightIn){
      height = heightIn;
   }
   
   public void setWidth(double widthIn){
      width = widthIn;
   }
   
   /*accessor for model*/ 
   
   public String getName(){
      return name;
   }
   
   
   /**accessor for cat registration number*/
   public double getHeight(){
      return height;
   }
   
   /**accessor for cat registration number*/
   public double getWidth(){
      return width;
   }
   
   
   
   
   
   public void displayTriangle(){
      System.out.println("name: " + name + " width:  " + width + " height: " + height );
   }
   public void area(){
      System.out.println("area is: " + ((width*height)/2));
   
   
   }


   
   










}