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

import model.Retangulo;
import javax.swing.ButtonGroup;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setBounds(100, 100, 549, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBase = new JLabel("BASE");
		lblBase.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBase.setBounds(181, 44, 46, 14);
		contentPane.add(lblBase);

		JLabel lblAltura = new JLabel("ALTURA");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAltura.setBounds(313, 44, 46, 14);
		contentPane.add(lblAltura);

		txtBase = new JTextField();
		txtBase.setBounds(154, 69, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(293, 69, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JRadioButton rdbtnArea = new JRadioButton("Área");
		buttonGroup.add(rdbtnArea);
		rdbtnArea.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnArea.setBounds(164, 96, 71, 23);
		contentPane.add(rdbtnArea);

		JRadioButton rdbtnPerimetro = new JRadioButton("Perímetro");
		buttonGroup.add(rdbtnPerimetro);
		rdbtnPerimetro.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnPerimetro.setBounds(293, 96, 86, 23);
		contentPane.add(rdbtnPerimetro);

		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultado.setBounds(72, 166, 74, 14);
		contentPane.add(lblResultado);
		
		JLabel lblCampoResultado = new JLabel("");
		lblCampoResultado.setBounds(156, 166, 325, 14);
		contentPane.add(lblCampoResultado);

		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				String altura = txtAltura.getText();
				Float alturaF = Float.valueOf(altura);
				
				String base = txtBase.getText();
				Float baseF = Float.valueOf(base);
				
				Retangulo calc = new Retangulo();
				
				Float area = calc.calcularArea(baseF, alturaF);
				Float perimetro = calc.calcularPerimetro(baseF, alturaF);
				
				if(rdbtnArea.isSelected()) {
					
					lblCampoResultado.setText("A área do retangulo é "+area);
				}
				else if(rdbtnPerimetro.isSelected()) {
					
					lblCampoResultado.setText("O perimetro do retangulo é "+perimetro);
				}
			}
		});

		btnCalcular.setBounds(46, 210, 109, 23);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBase.setText("");
				txtAltura.setText("");

			}

		});

		btnLimpar.setBounds(213, 210, 105, 23);
		contentPane.add(btnLimpar);
		

		JButton btnFechar = new JButton("FECHAR");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);

			}

		});

		btnFechar.setBounds(372, 210, 109, 23);
		contentPane.add(btnFechar);
		
	}
}