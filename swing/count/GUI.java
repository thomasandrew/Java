import javax.swing.*;

public class GUI {
  public GUI() {
     JFrame frame = new JFrame("Example Frame");
     frame.setSize(700, 700);
     frame.setLayout(null);

     JButton button = new JButton("Click me");
     button.setBounds(90, 200, 500, 100);
     JLabel label = new JLabel("Number of clicks: 0");
     label.setBounds(50, 20, 190, 100);

     frame.add(button);
     frame.add(label);

     frame.setVisible(true);
     frame.setLocationRelativeTo(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  } 
}
