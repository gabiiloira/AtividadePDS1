package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCampoNome;
	private JTextField txtCampoSobrenome;
	private JButton btnCadastro;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 261);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(57, 38, 86, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSobrenome.setBounds(57, 94, 86, 14);
		contentPane.add(lblSobrenome);
		
		txtCampoNome = new JTextField();
		txtCampoNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		txtCampoNome.setBounds(133, 36, 157, 20);
		contentPane.add(txtCampoNome);
		txtCampoNome.setColumns(10);
		
		txtCampoSobrenome = new JTextField();
		txtCampoSobrenome.setBounds(133, 92, 157, 20);
		contentPane.add(txtCampoSobrenome);
		txtCampoSobrenome.setColumns(10);
		
		btnCadastro = new JButton("CADASTRAR");
		btnCadastro.setBackground(new Color(255, 111, 183));
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//pegar o texto digitado no JTEXTField (txtCampoNome) e no JTEXTField (txtCampoSobrenome)
				String nome = txtCampoNome.getText();
				String sobrenome = txtCampoSobrenome.getText();
			
			//mostrar o nome e o sobrenome na tela usando JOptionPane
				JOptionPane.showMessageDialog(null, "O nome digitado é: " + nome + " " + sobrenome);
				
			}
		});
		btnCadastro.setBounds(42, 146, 114, 23);
		contentPane.add(btnCadastro);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setBackground(new Color(128, 128, 255));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCampoNome.setText("");
				txtCampoSobrenome.setText("");
			}
		});
		btnLimpar.setBounds(177, 146, 114, 23);
		contentPane.add(btnLimpar);
	}

}