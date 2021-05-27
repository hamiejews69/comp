import java.awt.*;

/** Represents a Rainbow*/
public class Rainbow{
   // data fields
   private int mid, bottom;

   /** Constructor that takes an x value and a y value representing the 
     point around which the rainbow will be drawn.
     @param midX the rainbow's central x co-ordinate
     @param midY the rainbow's bottom y co-ordinate
   */
   public Rainbow(int mid, int bottom){
      this.mid = mid;
      this.bottom = bottom;

   }

   /** Takes a Graphics object, calls methods on it to draw a rainbow
      @param page a Graphics object
   */
   public void draw(Graphics page){
      page.setColor (Color.red);
      page.fillArc (mid - 100, bottom - 70, 200, 140, 0, 180);    // Red arc
      
      page.setColor (Color.orange);
      page.fillArc (mid - 90, bottom - 60, 180, 120, 0, 180);    // Orange Arc
        
      page.setColor (Color.yellow);
      // Yellow Arc goes here
      
      page.setColor (Color.green);
      // Green Arc goes here
      
      page.setColor (Color.blue);
      page.fillArc (mid - 60, bottom - 30, 120, 60, 0, 180);    // Blue Arc 
      
      page.setColor (new Color(75, 0, 130));
      page.fillArc (mid - 50, bottom - 20, 100, 40, 0, 180);    //Indigo Arc 
      
      page.setColor (new Color(238, 130, 238));
      page.fillArc (mid - 40, bottom - 10, 80, 20, 0, 180);    //Violet Arc 
      
   }
      
}