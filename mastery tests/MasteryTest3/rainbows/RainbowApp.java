import java.awt.*;
import javax.swing.*;

public class RainbowApp{

  public static void main(String[]args){
    JFrame frame = new JFrame("Rainbows"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    RainbowPanel rainbows = new RainbowPanel(Color.white);
    frame.getContentPane().add (rainbows);
    frame.pack();
    frame.setVisible(true);
  }
      
}