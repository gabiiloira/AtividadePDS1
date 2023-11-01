import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCampoGasComum1;
	private JTextField txtCampoGasAditivada1;
	private JTextField txtCampoOleoDiesel1;
	private JTextField txtCampoEtanol1;
	private JTextField txtCampoFrasco500mL;
	private JTextField txtCampoFrasco1L;
	private JTextField txtCampoFrasco500mL2;
	private JTextField txtCampoFrasco1L2;
	private JTextField txtCampoQuantidadeLitros;
	private JTextField txtCampoDias;

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
		setBounds(100, 100, 633, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel TabelaDePrecoDoCombustivel = new JPanel();
		TabelaDePrecoDoCombustivel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Preco do Combust\u00EDvel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel TabelaDePrecoDeOleoMotor = new JPanel();
		TabelaDePrecoDeOleoMotor.setBorder(new TitledBorder(null, "Tabela de Preco de Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel TabelaOleoMotor = new JPanel();
		TabelaOleoMotor.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel TabelaAbastecimento = new JPanel();
		TabelaAbastecimento.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel TabelaFormasDePagamento = new JPanel();
		TabelaFormasDePagamento.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnCalcular = new JButton("CALCULAR");
		
		JButton btnNovoCalculo = new JButton("NOVO CALCULO");
		
		JButton btnFechar = new JButton("FECHAR");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(TabelaOleoMotor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(10)
								.addComponent(TabelaDePrecoDoCombustivel, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
								.addGap(10)
								.addComponent(TabelaDePrecoDeOleoMotor, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(TabelaAbastecimento, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(TabelaFormasDePagamento, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(68)
							.addComponent(btnCalcular)
							.addGap(103)
							.addComponent(btnNovoCalculo)
							.addGap(83)
							.addComponent(btnFechar)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(11, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(TabelaDePrecoDoCombustivel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
						.addComponent(TabelaDePrecoDeOleoMotor, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(TabelaOleoMotor, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(TabelaAbastecimento, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
						.addComponent(TabelaFormasDePagamento, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCalcular)
						.addComponent(btnNovoCalculo)
						.addComponent(btnFechar))
					.addGap(29))
		);
		TabelaFormasDePagamento.setLayout(new MigLayout("", "[][][][grow]", "[][][][][]"));
		
		JRadioButton rdbtnAVISTA = new JRadioButton("À vista");
		TabelaFormasDePagamento.add(rdbtnAVISTA, "cell 0 1");
		
		JRadioButton rdbtnAPRAZO = new JRadioButton("À prazo");
		TabelaFormasDePagamento.add(rdbtnAPRAZO, "cell 0 2");
		
		JLabel lblDias = new JLabel("Dias:");
		TabelaFormasDePagamento.add(lblDias, "cell 2 2,alignx trailing");
		
		txtCampoDias = new JTextField();
		TabelaFormasDePagamento.add(txtCampoDias, "cell 3 2,growx");
		txtCampoDias.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a Pagar:");
		TabelaFormasDePagamento.add(lblTotalAPagar, "cell 0 4,alignx right");
		
		JLabel lblSeta5 = new JLabel("-");
		TabelaFormasDePagamento.add(lblSeta5, "cell 2 4,alignx center");
		TabelaAbastecimento.setLayout(new MigLayout("", "[][][][][grow]", "[][][][]"));
		
		JLabel lblCombustivel = new JLabel("Combustível:");
		TabelaAbastecimento.add(lblCombustivel, "cell 1 1");
		
		JComboBox comboBox = new JComboBox();
		TabelaAbastecimento.add(comboBox, "cell 4 1,growx");
		
		JLabel lblQuantidadeLitros = new JLabel("Quantidade Litros:");
		TabelaAbastecimento.add(lblQuantidadeLitros, "cell 1 2");
		
		txtCampoQuantidadeLitros = new JTextField();
		TabelaAbastecimento.add(txtCampoQuantidadeLitros, "cell 4 2,growx");
		txtCampoQuantidadeLitros.setColumns(10);
		
		JLabel lblTotalCombustivel = new JLabel("Total Combustível:");
		TabelaAbastecimento.add(lblTotalCombustivel, "cell 1 3");
		
		JLabel lblSeta4 = new JLabel("-");
		TabelaAbastecimento.add(lblSeta4, "cell 4 3,alignx center");
		TabelaOleoMotor.setLayout(new MigLayout("", "[][][][][][grow][][][][][][][][]", "[][][][][]"));
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		TabelaOleoMotor.add(lblQuantidade, "cell 5 1,alignx center");
		
		JLabel lblValorAPagar = new JLabel("Valor a Pagar");
		TabelaOleoMotor.add(lblValorAPagar, "cell 9 1,alignx center");
		
		JLabel lblTotalOleo = new JLabel("Total Oleo");
		TabelaOleoMotor.add(lblTotalOleo, "cell 13 1,alignx center");
		
		JLabel lblFrasco500mL2 = new JLabel("Frasco 500mL");
		TabelaOleoMotor.add(lblFrasco500mL2, "cell 2 3");
		
		txtCampoFrasco500mL2 = new JTextField();
		TabelaOleoMotor.add(txtCampoFrasco500mL2, "cell 5 3,growx");
		txtCampoFrasco500mL2.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("-");
		TabelaOleoMotor.add(lblNewLabel_11, "cell 9 3,alignx center");
		
		JLabel lblSeta3 = new JLabel("-");
		TabelaOleoMotor.add(lblSeta3, "cell 13 3,alignx center");
		
		JLabel lblFrasco1L2 = new JLabel("Frasco 1L");
		TabelaOleoMotor.add(lblFrasco1L2, "cell 2 4");
		
		txtCampoFrasco1L2 = new JTextField();
		TabelaOleoMotor.add(txtCampoFrasco1L2, "cell 5 4,growx");
		txtCampoFrasco1L2.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("-");
		TabelaOleoMotor.add(lblNewLabel_12, "cell 9 4,alignx center");
		TabelaDePrecoDeOleoMotor.setLayout(new MigLayout("", "[][][][][][grow]", "[][]"));
		
		JLabel lblFrasco500mL1 = new JLabel("Frasco 500mL");
		TabelaDePrecoDeOleoMotor.add(lblFrasco500mL1, "cell 1 0");
		
		txtCampoFrasco500mL = new JTextField();
		TabelaDePrecoDeOleoMotor.add(txtCampoFrasco500mL, "cell 5 0,growx");
		txtCampoFrasco500mL.setColumns(10);
		
		JLabel lblFrasco1L1 = new JLabel("Frasco 1L");
		TabelaDePrecoDeOleoMotor.add(lblFrasco1L1, "cell 1 1");
		
		txtCampoFrasco1L = new JTextField();
		TabelaDePrecoDeOleoMotor.add(txtCampoFrasco1L, "cell 5 1,growx");
		txtCampoFrasco1L.setColumns(10);
		TabelaDePrecoDoCombustivel.setLayout(new MigLayout("", "[][][][][][][grow]", "[][][][]"));
		
		JLabel lblOleoDiesel1 = new JLabel("Oleo Diesel:");
		TabelaDePrecoDoCombustivel.add(lblOleoDiesel1, "cell 1 0");
		
		txtCampoOleoDiesel1 = new JTextField();
		TabelaDePrecoDoCombustivel.add(txtCampoOleoDiesel1, "cell 6 0,growx");
		txtCampoOleoDiesel1.setColumns(10);
		
		JLabel lblGasComum1 = new JLabel("Gas Comum:");
		TabelaDePrecoDoCombustivel.add(lblGasComum1, "cell 1 1,aligny baseline");
		
		txtCampoGasComum1 = new JTextField();
		TabelaDePrecoDoCombustivel.add(txtCampoGasComum1, "cell 6 1,growx");
		txtCampoGasComum1.setColumns(10);
		
		JLabel lblGasAditivada1 = new JLabel("Gas Aditivada:");
		TabelaDePrecoDoCombustivel.add(lblGasAditivada1, "cell 1 2");
		
		txtCampoGasAditivada1 = new JTextField();
		TabelaDePrecoDoCombustivel.add(txtCampoGasAditivada1, "cell 6 2,growx");
		txtCampoGasAditivada1.setColumns(10);
		
		JLabel lblEtanol1 = new JLabel("Etanol:");
		TabelaDePrecoDoCombustivel.add(lblEtanol1, "cell 1 3");
		
		txtCampoEtanol1 = new JTextField();
		TabelaDePrecoDoCombustivel.add(txtCampoEtanol1, "cell 6 3,growx");
		txtCampoEtanol1.setColumns(10);
		contentPane.setLayout(gl_contentPane);
	}
}
