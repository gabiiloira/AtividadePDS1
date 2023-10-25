import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Investimento;

public class CalculadoraInvestimentosGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDeposito;
	private JTextField txtNumeroDeMeses;
	private JTextField txtJuroAoMes;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_5;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JMenuBar menuBar;
	private JMenu mnAjuda;
	private JMenuItem mntmSobre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentosGrid frame = new CalculadoraInvestimentosGrid();
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
	public CalculadoraInvestimentosGrid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sobre janelaS = new Sobre();
				janelaS.setVisible(true);
			}
		});
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblDeposito = new JLabel("Depósito mensal R$:");
		panel.add(lblDeposito);
		
		txtDeposito = new JTextField();
		contentPane.add(txtDeposito);
		txtDeposito.setColumns(10);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNumeroDeMeses = new JLabel("Num. de meses:");
		panel_1.add(lblNumeroDeMeses);
		
		txtNumeroDeMeses = new JTextField();
		contentPane.add(txtNumeroDeMeses);
		txtNumeroDeMeses.setColumns(10);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblJuroAoMes = new JLabel("Juros ao mês %:");
		panel_2.add(lblJuroAoMes);
		
		txtJuroAoMes = new JTextField();
		contentPane.add(txtJuroAoMes);
		txtJuroAoMes.setColumns(10);
		
		panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTotalInvestMaisJuros = new JLabel("Total investimento + juros R$: ");
		panel_3.add(lblTotalInvestMaisJuros);
		
		lblNewLabel_5 = new JLabel("");
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double deposito = Double.valueOf(txtDeposito.getText());
				int meses = Integer.valueOf(txtNumeroDeMeses.getText());
				double juros = Double.valueOf(txtJuroAoMes.getText());
				
				Investimento calc = new Investimento(meses, juros, deposito);
				double total = calc.calculaTotal();
				
				 lblTotalInvestMaisJuros.setText(String.format("%.2f", total));
			}
		});
		contentPane.add(btnCalcular);
	}

}
