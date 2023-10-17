package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ConversaoTemperatura;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 224);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(151, 232, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTemperatura = new JTextField();
		txtTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// pegar a temperatura digitada no componente de texto
				String tempDigitada = txtTemperatura.getText();
				
				// Converter temp String -> Float
				float tempConvertidaF = Float.valueOf(tempDigitada);
				
				// Criar objeto da classe ConversaoTemperatura
				ConversaoTemperatura conv = new ConversaoTemperatura();
				
				// Chamar Método conversao 
				float tempC = conv.converterFtoC(tempConvertidaF);
				
				// Mostrar Temperatura convertida
				JOptionPane.showMessageDialog(null, "Temperatura convertida: " +tempC);
				
			}
		});
		txtTemperatura.setBounds(79, 53, 115, 20);
		contentPane.add(txtTemperatura);
		txtTemperatura.setColumns(10);
		
		JLabel lblTemperatura = new JLabel("TEMPERATURA(F)");
		lblTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTemperatura.setBounds(90, 34, 92, 14);
		contentPane.add(lblTemperatura);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcular.setBounds(44, 98, 174, 23);
		contentPane.add(btnCalcular);
	}

}