import java.awt.*;
import javax.swing.*;

/** A program to display Poppies.*/
public class PoppyApp{

  public static void main(String[]args){
    JFrame frame = new JFrame("Poppies"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    PoppyPanel poppies = new PoppyPanel(Color.white);
    frame.getContentPane().add (poppies);
    frame.pack();
    frame.setVisible(true);
  }
      
}