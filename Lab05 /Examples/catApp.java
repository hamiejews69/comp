public class catApp{
   public static void main(String[]args){ 
      Cat cat1 = new Cat("furry", "jon ", 12, 'm', true); // a call to the default constructor
      Cat cat2 = new Cat("poop", "jon ", 14, 'm', true); // a call to the default constructor
   
      cat1.displayCat();
      
      if(cat1.getAge() < cat2.getAge()){
         System.out.println("cat2 is bigger");
      }
   
   
   
   
   }
}