import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener{

  private static JFrame frame;
  private static JPanel panel;
  private static JLabel userLabel;
  private static JTextField userText;
  private static JLabel passwordLabel;
  private static JPasswordField passwordText;
  private static JButton button;
  private static JLabel sucess;

  public static void main(String[] args) {
    panel = new JPanel();
    frame = new JFrame();
    frame.setSize(350, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);

    panel.setLayout(null);
    
    userLabel = new JLabel("User");
    userLabel.setBounds(10, 20, 80, 25);
    panel.add(userLabel);

    userText = new JTextField(20);
    userText.setBounds(100, 20, 165, 25);
    panel.add(userText);

    passwordLabel = new JLabel("Password");
    passwordLabel.setBounds(10, 50, 80, 25);
    panel.add(passwordLabel);
    
    passwordText = new JPasswordField();
    passwordText.setBounds(100, 50, 165, 25);
    panel.add(passwordText);

    button = new JButton("Login");
    button.setBounds(10, 80, 80, 25);
    button.addActionListener(new Main());
    panel.add(button);

    sucess = new JLabel("");
    sucess.setBounds(10, 110, 300, 25);
    panel.add(sucess);

    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String user = userText.getText();
    String password = passwordText.getText();

    if (user.equals("Thomas") && password.equals("sparta2727")) {
      sucess.setText("Login sucessful!");
    } else {
      sucess.setText("Error");
    }
  }
}
