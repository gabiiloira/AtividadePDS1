package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.Retangulo;

public class Exercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {
		setTitle("Calcular Retângulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 164, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base:");
		lblBase.setBounds(104, 34, 65, 19);
		lblBase.setHorizontalAlignment(SwingConstants.LEFT);
		lblBase.setFont(new Font("Cambria Math", Font.BOLD, 14));
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(104, 75, 65, 19);
		lblAltura.setHorizontalAlignment(SwingConstants.LEFT);
		lblAltura.setFont(new Font("Cambria Math", Font.BOLD, 14));
		contentPane.add(lblAltura);
		
		txtBase = new JTextField();
		txtBase.setBounds(179, 30, 65, 20);
		txtBase.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(179, 71, 65, 20);
		txtAltura.setFont(new Font("Arial", Font.PLAIN, 18));
		txtAltura.setColumns(10);
		contentPane.add(txtAltura);
		
		JLabel lblResultPerimetro = new JLabel("");
		lblResultPerimetro.setVerticalAlignment(SwingConstants.TOP);
		lblResultPerimetro.setBounds(157, 197, 58, 30);
		lblResultPerimetro.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		contentPane.add(lblResultPerimetro);
		
		JLabel lblResultArea = new JLabel("");
		lblResultArea.setVerticalAlignment(SwingConstants.TOP);
		lblResultArea.setBounds(287, 197, 58, 30);
		lblResultArea.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		contentPane.add(lblResultArea);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setForeground(new Color(255, 255, 255));
		btnCalcular.setBackground(new Color(128, 0, 128));
		btnCalcular.setBounds(121, 116, 118, 23);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float base = Float.valueOf(txtBase.getText());
				Float altura = Float.valueOf(txtAltura.getText()); 
				Retangulo retangulo = new Retangulo();
				Float perimetro = retangulo.calcularPerimetro(base, altura);
				Float area = retangulo.calcularArea(base, altura);
				lblResultPerimetro.setText(String.format("%.2f", perimetro));
				lblResultArea.setText(String.format("%.2f", area));
		}
		});
		contentPane.add(btnCalcular);
		
		JLabel lblPerimetro = new JLabel("Perímetro: ");
		lblPerimetro.setBounds(75, 204, 78, 23);
		lblPerimetro.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerimetro.setFont(new Font("Cambria Math", Font.BOLD, 14));
		contentPane.add(lblPerimetro);
		
		JLabel lblArea = new JLabel("Área: ");
		lblArea.setBounds(238, 204, 46, 23);
		lblArea.setHorizontalAlignment(SwingConstants.LEFT);
		lblArea.setFont(new Font("Cambria Math", Font.BOLD, 14));
		contentPane.add(lblArea);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBase.setText("");
				txtAltura.setText("");
			}
			
		});
		btnLimpar.setForeground(new Color(255, 255, 255));
		btnLimpar.setBackground(new Color(128, 0, 128));
		btnLimpar.setBounds(121, 150, 118, 23);
		contentPane.add(btnLimpar);
		
		
	}
}