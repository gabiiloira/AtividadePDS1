package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Preco;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Exercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtQuilo;
	private JTextField txtPeso;
	private JLabel lblPreco;
	private JLabel lblPeso;
	private JLabel lblNewLabel;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setTitle("Calcular valor do prato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 139, 23));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtQuilo = new JTextField();
		txtQuilo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtQuilo.setBounds(196, 60, 86, 25);
		contentPane.add(txtQuilo);
		txtQuilo.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPeso.setText("");
		txtPeso.setBounds(196, 96, 86, 25);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setForeground(new Color(255, 255, 255));
		btnCalcular.setBackground(new Color(185, 0, 0));
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPeso.getText();
				float precoQuilo = Float.valueOf(txtQuilo.getText());
				float peso = Float.valueOf(txtPeso.getText());
				Preco p = new Preco();
				float preco = p.calcularPreco(precoQuilo, peso);
				JOptionPane.showMessageDialog(null, "O valor a pagar é R$" + String.format("%.2f", preco));
			}	
		});
		btnCalcular.setBounds(39, 170, 125, 31);
		contentPane.add(btnCalcular);
		
		lblPreco = new JLabel("Preço:");
		lblPreco.setHorizontalAlignment(SwingConstants.LEFT);
		lblPreco.setFont(new Font("Corbel", Font.BOLD, 16));
		lblPreco.setBounds(39, 64, 79, 25);
		contentPane.add(lblPreco);
		
		lblPeso = new JLabel("Peso:");
		lblPeso.setHorizontalAlignment(SwingConstants.LEFT);
		lblPeso.setFont(new Font("Corbel", Font.BOLD, 16));
		lblPeso.setBounds(39, 105, 79, 25);
		contentPane.add(lblPeso);
		
		lblNewLabel = new JLabel("CALCULAR VALOR DO PRATO");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(39, 11, 253, 25);
		contentPane.add(lblNewLabel);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuilo.setText("");
				txtPeso.setText("");
			}
		});
		btnLimpar.setForeground(new Color(255, 255, 255));
		btnLimpar.setBackground(new Color(102, 0, 0));
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btnLimpar.setBounds(193, 170, 125, 30);
		contentPane.add(btnLimpar);
	}

}