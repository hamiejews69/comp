public class deviceApp{
   public static void main (String [] args){
      device d1 = new device("n64", true, 4 , 12);
      device d2 = new device("ps4" , true, 3 , 15);
      d1.displayDevice();
      d2.displayDevice();
      
      if(d1.getUsb() > d2.getUsb()){
         System.out.println("device 1 more usb");
      
      
      
      
      
      }
   }
}