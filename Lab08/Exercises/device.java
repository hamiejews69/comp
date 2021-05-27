import java.util.Scanner;
/** default example*/
public class device{
   private String model;
   private boolean wifi;
   private int usb;
   private double price;
   
      
   public device(){}
   
   /** constructor for a book object*/
   public device(String modelIn, boolean wifiIn,  int usbIn,  double priceIn){
      model = modelIn;
      wifi = wifiIn;
      usb = usbIn;
      price = priceIn;
   }
   /**mutator method for breed*/
   public void setModel(String modelIn){
      model = modelIn;
   }
   /**mutator method for name */
   public void setWifi(boolean wifiIn){
      wifi = wifiIn;
   }
   /** mutator method for age */
   public void setUsb(int usbIn){
      usb = usbIn;
   }
  /** mutator method for sex */
   public void setPrice(double priceIn){
      price = priceIn;
   }
 
   
   /**accessor for dog breed*/
   public String getModel(){
      return model;
   }
   /**accessor for cat registration number*/
   public boolean getWifi(){
      return wifi;
   }
   /**accessor for dog age*/
   public int getUsb(){
      return usb;
   }
   public double getPrice(){
      return price;
   }

  
   public void displayDevice(){
      System.out.println( model + " - " + wifi + " - " + usb + " - " + price);
   }



}