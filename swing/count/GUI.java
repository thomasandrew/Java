import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUI implements ActionListener {

  private int count = 0;
  private JLabel label;
  private JFrame frame;
  private JButton button;

  public GUI() {
     frame = new JFrame("Example Frame");
     frame.setSize(700, 700);
     frame.setLayout(null);

     button = new JButton("Click me");
     button.setBounds(90, 200, 500, 100);
     button.addActionListener(this);

     label = new JLabel("Number of clicks: 0");
     label.setBounds(50, 20, 190, 100);

     frame.add(button);
     frame.add(label);

     frame.setVisible(true);
     frame.setLocationRelativeTo(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  } 

  @Override
  public void actionPerformed(ActionEvent e) {
    count++;
    label.setText("Number of clicks: " + count);
  }
}
