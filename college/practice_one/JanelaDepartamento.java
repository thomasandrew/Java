package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaDepartamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField btnNomeApareca;

	public JanelaDepartamento() {
		setTitle("Departamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(21, 41, 52, 22);
		contentPane.add(lblNome);
		
		btnNomeApareca = new JTextField();
		btnNomeApareca.setBounds(68, 42, 176, 20);
		contentPane.add(btnNomeApareca);
		btnNomeApareca.setColumns(10);
		
		JLabel lblNome_1 = new JLabel("");
		lblNome_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome_1.setBounds(21, 119, 223, 22);
		contentPane.add(lblNome_1);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = btnNomeApareca.getText();
				lblNome_1.setText(n);
			}
		});
		btnNewButton.setBounds(21, 188, 117, 22);
		contentPane.add(btnNewButton);
		
		this.setVisible(true);
	}
}
