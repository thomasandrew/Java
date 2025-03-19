package viewer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Departamento;
import model.modelException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaDepartamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfSigla;
	private JTextField tfNome;

	public JanelaDepartamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sigla:");
		lblNewLabel.setBounds(29, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		tfSigla = new JTextField();
		tfSigla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		tfSigla.setBounds(64, 19, 86, 20);
		contentPane.add(tfSigla);
		tfSigla.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(29, 65, 46, 14);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(64, 62, 316, 20);
		contentPane.add(tfNome);
		
		JButton btOk = new JButton("Ok");
		btOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sigla = tfSigla.getText();
				String nome = tfNome.getText();
				
				try {
					Departamento d1 = new Departamento(sigla, nome);
					JOptionPane.showMessageDialog(btOk, "Objeto departamento criado: " + d1);
				} catch (modelException e1) {
					JOptionPane.showMessageDialog(btOk, e1.getMessage());
					e1.printStackTrace();
				}
			}
		});
		btOk.setBounds(101, 155, 89, 36);
		contentPane.add(btOk);
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btCancelar, "Fechando a janela...");
				setVisible(false);
			}
		});
		btCancelar.setBounds(224, 155, 94, 36);
		contentPane.add(btCancelar);
		this.setVisible(true);
	}
}
