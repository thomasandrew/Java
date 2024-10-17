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
	private JPanel contentPane;
	private static JanelaPessoa janelaPessoa = null;
	private static JanelaAluno janelaAluno = null;

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btPessoa = new JButton("Pessoa");
		btPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (janelaPessoa == null || !janelaPessoa.isVisible()) {
					janelaPessoa = new JanelaPessoa();
				}
			}
		});
		btPessoa.setBounds(10, 11, 89, 63);
		contentPane.add(btPessoa);
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Encerro o programa
				System.exit(0);
			}
		});
		btSair.setBounds(324, 11, 89, 63);
		contentPane.add(btSair);
		
		JButton btnAluno = new JButton("Aluno");
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (janelaAluno == null || !janelaAluno.isVisible()) {
					janelaAluno = new JanelaAluno();
				}
			}
		});
		btnAluno.setBounds(164, 11, 89, 63);
		contentPane.add(btnAluno);
		
		// Torno a Janela Principal Visível
		this.setVisible(true);
	}
}
