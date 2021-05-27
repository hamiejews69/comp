/** Laboratory 5 Worked Example, application class */
public class BookShopApp{
   public static void main(String[] args){
   	//make a new instance of the book class		
      Book book1 = new Book("Potiki", "Patricia Grace", 1986, 27 );
      Book book2 = new Book();

      
   	//display what the object's toString method returns  
      book1.displayBook(); 
      book2.displayBook(); 

      
   }
    
}
