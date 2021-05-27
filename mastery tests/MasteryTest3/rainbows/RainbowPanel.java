import javax.swing.*;
import java.awt.*;

public class RainbowPanel extends JPanel{

   
   public RainbowPanel(Color bgCol){
      setBackground(bgCol);
      setPreferredSize(new Dimension(200, 300));    
   }
    
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      
      Rainbow r1 = new Rainbow(100, 85);
      Rainbow r2 = new Rainbow (100, 185);
      Rainbow r3 = new Rainbow(100, 270);
      
      // 2 more instances of rainbow need to be created here
      
      r1.draw(g);
      r2.draw(g);
      r3.draw(g);
      
      
      // get the other instances of rainbow to draw themselves
      
   }
}