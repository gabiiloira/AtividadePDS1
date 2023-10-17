package view;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Gasolina;
import java.awt.Color;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPreco;
	private JTextField txtPagamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setTitle("Calcular Gasolina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 237);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 111, 111));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPreco = new JLabel("Preço Gasolina:");
		lblPreco.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPreco.setBounds(41, 33, 101, 24);
		contentPane.add(lblPreco);
		
		JLabel lblPagamento = new JLabel("Pagamento:");
		lblPagamento.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPagamento.setBounds(41, 83, 101, 24);
		contentPane.add(lblPagamento);
		
		txtPreco = new JTextField();
		txtPreco.setFont(new Font("Arial", Font.PLAIN, 18));
		txtPreco.setBounds(140, 31, 86, 20);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		txtPagamento = new JTextField();
		txtPagamento.setFont(new Font("Arial", Font.PLAIN, 18));
		txtPagamento.setColumns(10);
		txtPagamento.setBounds(140, 81, 86, 20);
		contentPane.add(txtPagamento);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setForeground(new Color(255, 255, 255));
		btnCalcular.setBackground(new Color(151, 0, 0));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String precoStr = txtPreco.getText();
				Float preco = Float.valueOf(precoStr);
				String pagamentoStr = txtPagamento.getText();
				Float pagamento = Float.valueOf(pagamentoStr);
				Gasolina gasolina = new Gasolina();
				Float litros = gasolina.calcularLitros(preco, pagamento);
				JOptionPane.showMessageDialog(null, "É possível comprar " + String.format("%.2f", litros) + " litros de gasolina");
			}
		});
		btnCalcular.setBounds(80, 130, 111, 23);
		contentPane.add(btnCalcular);
	}

}