package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import modelo.CalcularOleo;
import modelo.Combustivel;
import modelo.CombustivelEnum;
import modelo.TotalFinal;
import net.miginfocom.swing.MigLayout;

public class janelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtQuantFrasco500ML;
	private JTextField txtQuantFrasco1L;
	private JTextField txtQuantLitros;
	private JTextField txtOleoDisel;
	private JTextField txtGasComum;
	private JTextField txtGasAditivada;
	private JTextField txtEtanol;
	private JTextField txtPrecoFrasco500ML;
	private JTextField txtPrecoFrasco1L;
	private JTextField txtDias;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaPrincipal frame = new janelaPrincipal();
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
	public janelaPrincipal() {
		setTitle("Posto de Combustivel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow]", "[grow][grow][grow][grow]"));
		
		JPanel TabelaPrecoCombustivel = new JPanel();
		TabelaPrecoCombustivel.setBorder(new TitledBorder(null, "Tabela de Preco Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		TabelaPrecoCombustivel.setToolTipText("");
		contentPane.add(TabelaPrecoCombustivel, "cell 0 0,grow");
		TabelaPrecoCombustivel.setLayout(new MigLayout("", "[][][][grow]", "[][][][]"));
		
		JLabel lblOleo = new JLabel("Oleo Disel");
		TabelaPrecoCombustivel.add(lblOleo, "cell 1 0");
		
		txtOleoDisel = new JTextField();
		TabelaPrecoCombustivel.add(txtOleoDisel, "cell 3 0,growx");
		txtOleoDisel.setColumns(10);
		
		JLabel lblGasComum = new JLabel("Gas. Comum");
		TabelaPrecoCombustivel.add(lblGasComum, "cell 1 1");
		
		txtGasComum = new JTextField();
		TabelaPrecoCombustivel.add(txtGasComum, "cell 3 1,growx");
		txtGasComum.setColumns(10);
		
		JLabel lblGasAditivada = new JLabel("Gas. Aditivada");
		TabelaPrecoCombustivel.add(lblGasAditivada, "cell 1 2");
		
		txtGasAditivada = new JTextField();
		TabelaPrecoCombustivel.add(txtGasAditivada, "cell 3 2,growx");
		txtGasAditivada.setColumns(10);
		
		JLabel lbEtanol = new JLabel("Etanol");
		TabelaPrecoCombustivel.add(lbEtanol, "cell 1 3");
		
		txtEtanol = new JTextField();
		TabelaPrecoCombustivel.add(txtEtanol, "cell 3 3,growx");
		txtEtanol.setColumns(10);
		
		JPanel TabelaPrecoOleo = new JPanel();
		TabelaPrecoOleo.setBorder(new TitledBorder(null, "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(TabelaPrecoOleo, "cell 1 0,grow");
		TabelaPrecoOleo.setLayout(new MigLayout("", "[][][][]", "[][][][][]"));
		
		JLabel lblFrascoML = new JLabel("Frasco 500ml");
		TabelaPrecoOleo.add(lblFrascoML, "cell 2 1");
		
		txtPrecoFrasco500ML = new JTextField();
		TabelaPrecoOleo.add(txtPrecoFrasco500ML, "cell 3 1,alignx center");
		txtPrecoFrasco500ML.setColumns(10);
		
		JLabel lblFrascoL = new JLabel("Frasco 1L");
		TabelaPrecoOleo.add(lblFrascoL, "cell 2 3");
		
		txtPrecoFrasco1L = new JTextField();
		TabelaPrecoOleo.add(txtPrecoFrasco1L, "cell 3 3,alignx left");
		txtPrecoFrasco1L.setColumns(10);
		
		JPanel TabelaOleo = new JPanel();
		TabelaOleo.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(TabelaOleo, "cell 0 1 2 1,grow");
		TabelaOleo.setLayout(new MigLayout("", "[][][][][][][grow][][][][][][][][]", "[][][]"));
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		TabelaOleo.add(lblQuantidade, "cell 6 0,alignx center");
		
		JLabel lblValorAPagar = new JLabel("Valor a Pagar");
		TabelaOleo.add(lblValorAPagar, "cell 9 0");
		
		JLabel lblTotalOl = new JLabel("Total Oleo");
		TabelaOleo.add(lblTotalOl, "cell 13 0");
		
		JLabel lblFrascoML2 = new JLabel("Frasco de 500ml");
		TabelaOleo.add(lblFrascoML2, "cell 1 1 5 1,alignx right");
		
		JLabel lblValorFrascoML = new JLabel("-");
		TabelaOleo.add(lblValorFrascoML, "cell 9 1,alignx center");
		
		JLabel lblTotalOleo = new JLabel("-");
		TabelaOleo.add(lblTotalOleo, "cell 13 1,alignx center");
		
		
		txtQuantFrasco500ML = new JTextField();
		txtQuantFrasco500ML.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String precoFrascoML = txtPrecoFrasco500ML.getText();
				String quantFrascoML = txtQuantFrasco500ML.getText();
				
				Float precoFrascoMLF = Float.valueOf(precoFrascoML);
				Float quantFrascoMLF = Float.valueOf(quantFrascoML);
				
				CalcularOleo calc = new CalcularOleo();
				
				float calculoML = calc.frascoML(precoFrascoMLF, quantFrascoMLF);

				lblValorFrascoML.setText(""+calculoML);
				
				
			}
		});
		TabelaOleo.add(txtQuantFrasco500ML, "cell 6 1,alignx center");
		txtQuantFrasco500ML.setColumns(10);
		
		
		
		JLabel lblFrascoL2 = new JLabel("Frasco de 1L");
		TabelaOleo.add(lblFrascoL2, "cell 1 2 5 1,alignx right");
		
		JLabel lblValorFrascoL = new JLabel("-");
		TabelaOleo.add(lblValorFrascoL, "cell 9 2,alignx center");
		
		txtQuantFrasco1L = new JTextField();
		txtQuantFrasco1L.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String precoFrascoL = txtPrecoFrasco500ML.getText();
				String quantFrascoL = txtQuantFrasco500ML.getText();
				
				Float precoFrascoLF = Float.valueOf(precoFrascoL);
				Float quantFrascoLF = Float.valueOf(quantFrascoL);
				
				CalcularOleo calc = new CalcularOleo();
				
				float calculoL = calc.frascoML(precoFrascoLF, quantFrascoLF);

				lblValorFrascoL.setText(""+calculoL);
				
				String precoFrascoML = txtPrecoFrasco500ML.getText();
				String quantFrascoML = txtQuantFrasco500ML.getText();
				
				Float precoFrascoMLF = Float.valueOf(precoFrascoML);
				Float quantFrascoMLF = Float.valueOf(quantFrascoML);
				
				
				float calculoML = calc.frascoML(precoFrascoMLF, quantFrascoMLF);

				float totalOleo = calculoML+calculoL;
				
				lblTotalOleo.setText(""+totalOleo);
				
			}
		});
		TabelaOleo.add(txtQuantFrasco1L, "cell 6 2,alignx center");
		txtQuantFrasco1L.setColumns(10);
		
		
		
		JPanel TabelaAbastecimento = new JPanel();
		TabelaAbastecimento.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(TabelaAbastecimento, "cell 0 2,grow");
		TabelaAbastecimento.setLayout(new MigLayout("", "[][][][][grow][grow]", "[][][]"));
		
		JLabel lblCombustivel = new JLabel("Combustivel");
		TabelaAbastecimento.add(lblCombustivel, "cell 1 0");
		
		JComboBox<CombustivelEnum> comboBox = new JComboBox<CombustivelEnum>();
		TabelaAbastecimento.add(comboBox, "cell 4 0,growx");
		comboBox.addItem(CombustivelEnum.DIESEL);
		comboBox.addItem(CombustivelEnum.ADITIVADA);
		comboBox.addItem(CombustivelEnum.COMUM);
		comboBox.addItem(CombustivelEnum.ETANOL);
		
		JLabel lblQuantidadeLitro = new JLabel("Quantidade Litros:");
		TabelaAbastecimento.add(lblQuantidadeLitro, "cell 1 1");
		
		JLabel lblTotalCombustivel = new JLabel("-");
		TabelaAbastecimento.add(lblTotalCombustivel, "cell 4 2,alignx center");
		
		txtQuantLitros = new JTextField();
		txtQuantLitros.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String oleoDisel = txtOleoDisel.getText();
				String gasComum = txtGasComum.getText();
				String gasAditivada = txtGasAditivada.getText();
				String Etanol = txtEtanol.getText();
				String quantLitros = txtQuantLitros.getText();
				
				Float oleoDiselF = Float.valueOf(oleoDisel);
				Float gasComumF = Float.valueOf(gasComum);
				Float gasAditivadaF = Float.valueOf(gasAditivada);
				Float etanolF = Float.valueOf(Etanol);
				Float quantLitrosF = Float.valueOf(quantLitros);
				
				Combustivel calcC = new Combustivel();
				
				int posicao = comboBox.getSelectedIndex();
				
				
				if (posicao==0) {
					float totalCob = calcC.total(oleoDiselF, quantLitrosF);
					lblTotalCombustivel.setText(""+totalCob);
				} else if (posicao==1) {
					float totalCob = calcC.total(gasComumF, quantLitrosF);
					lblTotalCombustivel.setText(""+totalCob);
				} else if (posicao==2) {
					float totalCob = calcC.total(gasAditivadaF, quantLitrosF);
					lblTotalCombustivel.setText(""+totalCob);
				} else if (posicao==3) {
					float totalCob = calcC.total(etanolF, quantLitrosF);
					lblTotalCombustivel.setText(""+totalCob);
				}
				
			}
		});
		TabelaAbastecimento.add(txtQuantLitros, "cell 4 1,growx");
		txtQuantLitros.setColumns(10);
		
		JLabel lblTotalCom = new JLabel("Total Combustivel:");
		TabelaAbastecimento.add(lblTotalCom, "cell 1 2");
		

		
		JPanel TabelaFormasPagamento = new JPanel();
		TabelaFormasPagamento.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(TabelaFormasPagamento, "cell 1 2,grow");
		TabelaFormasPagamento.setLayout(new MigLayout("", "[][][grow]", "[][][]"));
		
		JRadioButton rdbtAVista = new JRadioButton("A vista");
		buttonGroup.add(rdbtAVista);
		TabelaFormasPagamento.add(rdbtAVista, "cell 0 0");
		
		JLabel lblDias = new JLabel("Dias:");
		TabelaFormasPagamento.add(lblDias, "cell 1 0,alignx trailing");
		
		txtDias = new JTextField();
		TabelaFormasPagamento.add(txtDias, "cell 2 0,alignx left");
		txtDias.setColumns(10);
		
		JRadioButton rdbtnAPrazo = new JRadioButton("A prazo");
		buttonGroup.add(rdbtnAPrazo);
		TabelaFormasPagamento.add(rdbtnAPrazo, "cell 0 1");
		
		JLabel lblTotalaAPagar = new JLabel("Total a pagar");
		TabelaFormasPagamento.add(lblTotalaAPagar, "cell 0 2,alignx right");
		
		JLabel lblTotalPagar = new JLabel("-");
		TabelaFormasPagamento.add(lblTotalPagar, "cell 1 2");
		
		JPanel PainelDeBotoes = new JPanel();
		contentPane.add(PainelDeBotoes, "cell 0 3 2 1,alignx center,aligny top");
		PainelDeBotoes.setLayout(new MigLayout("", "[][][][][][][][][][][][][][]", "[][]"));
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String totComb = lblTotalCombustivel.getText();
				String totOleo = lblTotalOleo.getText();
				String dias = txtDias.getText();
				
				Float totCombF = Float.valueOf(totComb);
				Float totOleoF = Float.valueOf(totOleo);
				Integer diasF = Integer.valueOf(dias);
				
				TotalFinal calc = new TotalFinal();
				
				if(rdbtAVista.isSelected()) {
					Float resp = calc.aVista(totCombF, totOleoF);
					lblTotalPagar.setText(""+resp);
					
				}else if(rdbtnAPrazo.isSelected()) {
					Float resp = calc.aPrazo(totCombF, totOleoF, diasF);
					lblTotalPagar.setText(""+resp);
				}
				
			}
		});
		PainelDeBotoes.add(btnCalcular, "cell 3 1,alignx center,aligny center");
		
		JButton btnNovoCalculo = new JButton("Novo Calculo");
		btnNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOleoDisel.setText("");
				txtGasComum.setText("");
				txtGasAditivada.setText("");
				txtEtanol.setText("");
				txtPrecoFrasco500ML.setText("");
				txtPrecoFrasco1L.setText("");
				txtQuantFrasco500ML.setText("");
				txtQuantFrasco1L.setText("");
				lblValorFrascoML.setText("-");
				lblValorFrascoL.setText("-");
				lblTotalOleo.setText("-");
				txtQuantLitros.setText("");
				lblTotalCombustivel.setText("-");
				txtDias.setText("");
				lblTotalPagar.setText("-");
			}
		});
		PainelDeBotoes.add(btnNovoCalculo, "cell 6 1,alignx center,aligny center");
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		PainelDeBotoes.add(btnFechar, "cell 9 1,alignx center,aligny center");
	}

}