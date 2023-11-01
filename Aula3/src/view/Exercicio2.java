package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.CalculosMatematicos;
import javax.swing.ButtonGroup;


public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCampoPrimeiroNum;
	private JTextField txtCampoSegundoNum;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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

		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPrimeiroNum = new JLabel("Primeiro Número Inteiro:");
		lblPrimeiroNum.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrimeiroNum.setBounds(23, 11, 164, 14);
		contentPane.add(lblPrimeiroNum);

		JLabel lblSegundoNum = new JLabel("Segundo Número Inteiro:");
		lblSegundoNum.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSegundoNum.setBounds(23, 48, 164, 14);
		contentPane.add(lblSegundoNum);

		txtCampoPrimeiroNum = new JTextField();
		txtCampoPrimeiroNum.setBounds(197, 8, 86, 20);
		contentPane.add(txtCampoPrimeiroNum);
		txtCampoPrimeiroNum.setColumns(10);
		
		txtCampoSegundoNum = new JTextField();
		txtCampoSegundoNum.setBounds(197, 45, 86, 20);
		contentPane.add(txtCampoSegundoNum);
		txtCampoSegundoNum.setColumns(10);

		JRadioButton rdbtnAdicao = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnAdicao);
		rdbtnAdicao.setBounds(21, 82, 109, 23);
		contentPane.add(rdbtnAdicao);

		JRadioButton rdbtnSubtracao = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnSubtracao);
		rdbtnSubtracao.setBounds(23, 130, 109, 23);
		contentPane.add(rdbtnSubtracao);

		JRadioButton rdbtnMultiplicacao = new JRadioButton("* Multiplicação");
		buttonGroup.add(rdbtnMultiplicacao);
		rdbtnMultiplicacao.setBounds(23, 175, 109, 23);
		contentPane.add(rdbtnMultiplicacao);

		JRadioButton rdbtnDivisao = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDivisao);
		rdbtnDivisao.setBounds(23, 219, 109, 23);
		contentPane.add(rdbtnDivisao);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultado.setBounds(267, 194, 66, 14);
		contentPane.add(lblResultado);
		
		JLabel lblCampoResultado = new JLabel("");
		lblCampoResultado.setBounds(235, 219, 153, 14);
		contentPane.add(lblCampoResultado);


		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String primeironumero = txtCampoPrimeiroNum.getText();
				Float prinumeroF = Float.valueOf(primeironumero);
				
				String segundonumero = txtCampoSegundoNum.getText();
				Float segnumeroF = Float.valueOf(segundonumero);
				
				CalculosMatematicos calc = new CalculosMatematicos();
				
				Float adicao = calc.calcularAdicao(prinumeroF, segnumeroF);
				Float subtracao = calc.calcularSubtracao(prinumeroF, segnumeroF);
				Float multiplicacao = calc.calcularMultiplicacao(prinumeroF, segnumeroF);
				Float divisao = calc.calcularDivisao(prinumeroF, segnumeroF);
				
				if(rdbtnAdicao.isSelected()) {
					
					lblCampoResultado.setText("A soma é "+adicao);
				}
				else if(rdbtnSubtracao.isSelected()) {
					
					lblCampoResultado.setText("A subtração é "+subtracao);
				}
				else if(rdbtnMultiplicacao.isSelected()) {
					
					lblCampoResultado.setText("A multiplicação é "+multiplicacao);
					
			    }
		        else if(rdbtnDivisao.isSelected()) {
		        	
		        	lblCampoResultado.setText("A divisã é "+divisao);
					
				}
			}
		});
		btnCalcular.setBounds(235, 161, 130, 23);
		contentPane.add(btnCalcular);

	}
}
