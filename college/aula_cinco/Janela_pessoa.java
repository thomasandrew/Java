package viewer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.Main;
import model.Pessoa;

public class Janela_pessoa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSouLindo;
	private JTextField tfNome;
	private JTextField tfIdade;

	/**
	 * Create the frame.
	 */
	public Janela_pessoa() {
		setTitle("Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CPF: ");
		lblNewLabel.setBounds(27, 27, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtSouLindo = new JTextField();
		txtSouLindo.setBounds(56, 24, 86, 20);
		contentPane.add(txtSouLindo);
		txtSouLindo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(24, 62, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		tfNome = new JTextField();
		tfNome.setBounds(56, 58, 258, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(24, 99, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		tfIdade = new JTextField();
		tfIdade.setBounds(57, 93, 45, 20);
		contentPane.add(tfIdade);
		tfIdade.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = txtSouLindo.getText();
				String nome = tfNome.getText();
				String aux = tfIdade.getText();
				// int idade = idade = Integer.parseInt(aux);
				int idade;
                 
				try {
					idade = Integer.parseInt(aux);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro na idade");
					return;
				}
				
				try {
					Pessoa p = new Pessoa(cpf, nome, idade);
					JOptionPane.showMessageDialog(null, "Sucesso" + p.apresenteSe());
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					
				}
			}
		});
		btnOk.setBounds(52, 173, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // Força o termino do programa
			}
		});
		btnCancelar.setBounds(176, 173, 89, 23);
		contentPane.add(btnCancelar);
		
		this.setVisible(true); // Torno a janela visivel
	}
}
