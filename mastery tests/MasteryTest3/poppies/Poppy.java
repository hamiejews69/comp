import java.awt.*;

/** Represents a Poppy*/
public class Poppy{
   // data fields
   int midX;
   int midY;
   private static final Color COLOUR = new Color(220,52,59);
   final int DIAMETER = 60;
   
   /** Constructor that takes an x value and a y value representing the 
      point around which the poppy will be drawn.
      @param midX the poppy's central x co-ordinate
      @param midY the poppy's central y co-ordinate
      */
   public Poppy(int midX, int midY){
      this.midX = midX;
      this.midY = midY;
   
   }
   
   /** Takes a Graphics object and calls methods from the Graphics class to 
      display a Poppy
   
      Add a green stalk!
      
      @param g a Graphics object
   */
   public void display(Graphics g){  
      g.setColor(COLOUR);
      g.fillOval(midX - (DIAMETER/2), midY - 2*DIAMETER/3, DIAMETER, DIAMETER);
      g.fillOval(midX - (DIAMETER/2), midY - DIAMETER/3, DIAMETER, DIAMETER);
      
      g.setColor(Color.black);
      g.fillOval(midX - (DIAMETER/3), midY - (DIAMETER/3), 2*DIAMETER/3, 2*DIAMETER/3);
      
      g.setColor(Color.green);
      g.fillRect(midX, midY + (DIAMETER/2), 4, 30);     
   
   
      
   }
}