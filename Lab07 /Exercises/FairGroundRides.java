import java.util.Scanner;
/** default example*/
public class FairGroundRides{
   String name;
   boolean footwear, accompanied;
   int age;
   double height;
   
   public FairGroundRides(){}
   
   /** constructor for a book object*/
   public FairGroundRides(String nameIn, boolean fwIn,  boolean acIn, int ageIn, double heightIn){
      name = nameIn;
      footwear = fwIn;
      accompanied = acIn;
      age = ageIn;
      height = heightIn;      
   }
   /**accessor for dog breed*/
   public String getName(){
      return name;
   }
   /**accessor for dog registration number*/
   public boolean getFW(){
      return footwear;
   }
   public boolean getAC(){
      return accompanied;
   
   }
   
   /**accessor for dog age*/
   public int getAge(){
      return age;
   }
   /**accessor for whether dog is microchipped*/
   public double getHeight(){
      return height;
   }

   public void display(){
      System.out.println("name: " + name + " Footwear:  " + footwear + " accompanied: " + accompanied + " age: " + age + " height: " + height );
   }
   
   public void fillFields(){
      Scanner scan = new Scanner(System.in);
      System.out.println("What is your name?");
      name = scan.nextLine();
      System.out.println("wearing footwear? true/false");
      footwear = scan.nextBoolean();
      System.out.println("Accompanied? true/false");
      footwear = scan.nextBoolean();
      System.out.println("Enter age ");
      age = scan.nextInt();
      System.out.println("What is your height?");
      height = scan.nextDouble();
      System.out.println("Entry summary: " + name + " " + footwear +" "+ accompanied + " "+ age +" " + height);
   }
   
   public boolean getWallOfDeath(){
      return age > 16 && height > 1.6 && footwear;
   }
   public boolean getFlingAndTwirl(){
      return age > 18 && height > 1.7 && footwear;
   }
   
   public void displayRides(){
      if ((getWallOfDeath() == true) && (getFlingAndTwirl() == true)){
         System.out.println("can ride all rides");
      }
   
   }
   



   
 

}