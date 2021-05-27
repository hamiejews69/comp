import javax.swing.*;
import java.awt.*;
/** Lab 06 JFrame containing JPanels  */
public class FramesApp2{
   public static void main(String[]args){
      JFrame frame = new JFrame("Some JPanels"); 
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setLayout(new FlowLayout()); 
   
      JPanel panel1 = new JPanel(); // Creates the first instance of JPanel
      JPanel panel2 = new JPanel(); // Creates the 2nd instance of JPanel
      //JPanel panel3 = new JPanel(); // Creates the 3rd instance of JPanel
      SmileyPanel smiley = new SmileyPanel(Color.magenta, "Smiley");
      frame.getContentPane().add (smiley);
   
      panel1.setBackground(Color.pink); // Sets the background colour of the first JPanel
      panel1.setPreferredSize(new Dimension(100, 200)); // Sets the dimension of the first JPanel
   	
      //add label1 code here
   
      panel2.setBackground(Color.blue);
      panel2.setPreferredSize(new Dimension(100, 200));
   
      //panel3.setBackground(Color.magenta);
      //panel3.setPreferredSize(new Dimension(100, 200));
   
      frame.getContentPane().add (panel1); // Adds the first JPanel to the JFrame
      frame.getContentPane().add (panel2); // Adds the second JPanel to the JFrame
      //frame.getContentPane().add (panel3); // Adds thethird JPanel to the JFrame
   
      frame.pack(); // After you've seen the panels come up try commenting this line out to see what happens
      frame.setVisible(true);
      
      panel1.add(new JLabel("Panel 1"));
      panel2.add(new JLabel("Panel 2"));
      //panel3.add(new JLabel("Panel 3"));
      
      
   }
}