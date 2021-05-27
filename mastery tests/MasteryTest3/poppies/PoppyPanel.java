import javax.swing.*;
import java.awt.*;

public class PoppyPanel extends JPanel{

   public PoppyPanel(Color bgCol){
      setBackground(bgCol);
      setPreferredSize(new Dimension(350, 380));    
   }
    
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      
      Poppy p1 = new Poppy(50, 100);
      Poppy p2 = new Poppy(160, 100);
      Poppy p3 = new Poppy(270, 100);
       
      Poppy p4 = new Poppy(50, 200);
      Poppy p5 = new Poppy(160, 200);
      Poppy p6 = new Poppy(270, 200);
   
      
      p1.display(g);
      p2.display(g);    
      p3.display(g);
      p4.display(g);
      p5.display(g);    
      p6.display(g);
      
   }
}