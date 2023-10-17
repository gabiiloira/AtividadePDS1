package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setTitle("Janela de Texte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOlaMundo = new JLabel("Olá Mundo!");
		lblOlaMundo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(null, "O foco está no JLabel");
			}
			
		});
		lblOlaMundo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				JOptionPane.showMessageDialog(null, "O foco está no JLabel");
				
			}
		});
		lblOlaMundo.setForeground(new Color(0, 0, 0));
		lblOlaMundo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOlaMundo.setBounds(164, 39, 124, 25);
		contentPane.add(lblOlaMundo);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.setForeground(new Color(0, 0, 0));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnFechar.setBounds(313, 162, 89, 23);
		contentPane.add(btnFechar);
		
		txtNome = new JTextField();
		txtNome.setBounds(135, 93, 195, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(65, 96, 60, 17);
		contentPane.add(lblNome);
		
		JButton btnValidar = new JButton("VALIDAR");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//pegar o texto digitado no JTEXTField (txtNome)
					String nome = txtNome.getText();
				
				//mostrar o nome na tela usando JOptionPane
					JOptionPane.showMessageDialog(null, "O nome digitado é: " + nome);
			}
		});
		btnValidar.setBounds(190, 162, 89, 23);
		contentPane.add(btnValidar);
		
		JButton btnlLimpar = new JButton("LIMPAR");
		btnlLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNome.setText("");
			}
		});
		btnlLimpar.setBounds(57, 162, 89, 23);
		contentPane.add(btnlLimpar);
	}
}