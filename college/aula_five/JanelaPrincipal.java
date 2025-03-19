package viewer;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JanelaDepartamento janelaDepartamento = null;
	private JPanel contentPane;

	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Departamento");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (janelaDepartamento == null || !janelaDepartamento.isVisible()) {
					janelaDepartamento = new JanelaDepartamento();
				}
			}
		});
		btnNewButton.setBounds(10, 72, 138, 81);
		contentPane.add(btnNewButton);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnFinalizar.setBounds(286, 72, 138, 81);
		contentPane.add(btnFinalizar);
		//this.setVisible(true);
	}
}
