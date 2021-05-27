import java.util.Scanner;
/** default example*/
public class Cat{
   private String breed;
   private String name;
   private double age;
   private char sex;
   private boolean neutured;
   
   public Cat(){}
   
   /** constructor for a book object*/
   public Cat(String breedIn, String nameIn,  double ageIn, char sexIn, boolean neuturedIn){
      breed = breedIn;
      name = nameIn;
      age = ageIn;
      sex = sexIn;
      neutured = neuturedIn; 
   }
   /**mutator method for breed*/
   public void setBreed(String breedIn){
      breed = breedIn;
   }
   /**mutator method for name */
   public void setName(String nameIn){
      name = nameIn;
   }
   /** mutator method for age */
   public void setAge(int ageIn){
      age = ageIn;
   }
  /** mutator method for sex */
   public void setSex(char sexIn){
      sex = sexIn;
   }
   public void setPrice(boolean neuturedIn){
      neutured = neuturedIn;
   }
   


   
 

   
   /**accessor for dog breed*/
   public String getBreed(){
      return breed;
   }
   /**accessor for cat registration number*/
   public String getName(){
      return name;
   }
   /**accessor for dog age*/
   public double getAge(){
      return age;
   }
   public char getSex(){
      return sex;
   }

  /**accessor for whether dog is microchipped*/
   public boolean getNeutured(){
      return neutured;
   }

   public void displayCat(){
      System.out.println( breed + " - " + name + " - " + age + " - " + sex + " - " + neutured);
   }



}