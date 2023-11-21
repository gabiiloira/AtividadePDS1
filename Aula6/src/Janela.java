
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	private JTextField txtTelefone;
	private JTextField txtIdade;
	private JTextField txtAltura;
	private JTextField txtPeso;
	
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnAlterar;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane CampoDeListagem = new JScrollPane();
		CampoDeListagem.setBounds(38, 251, 417, 176);
		contentPane.add(CampoDeListagem);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				JOptionPane.showMessageDialog(null, "Pessoa Selecionada: " + pessoaSelecionada.getNome());
			}
		});
		atualizarJTableModel();  
		CampoDeListagem.setViewportView(table);

		labelNome = new JLabel("Nome");
		labelNome.setBounds(15, 11, 46, 14);
		contentPane.add(labelNome);

		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 146, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(185, 11, 46, 14);
		contentPane.add(lblNewLabel);

		txtCPF = new JTextField();
		txtCPF.setBounds(181, 36, 118, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		JButton bntAdicionar = new JButton("ADICIONAR");
		bntAdicionar.setFont(new Font("Tahoma", Font.BOLD, 11));
		bntAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String cpf = txtCPF.getText();
				Integer telefone = Integer.parseInt(txtTelefone.getText());
				Integer idade = Integer.parseInt(txtIdade.getText());
				Float peso = Float.parseFloat(txtPeso.getText());
				Float altura = Float.parseFloat(txtAltura.getText());

				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(Integer.parseInt(cpf));
				p.setTelefone(telefone);
				p.setIdade(idade);
				p.setPeso(peso);
				p.setAltura(altura);

				listaPessoas.add(p);

				atualizarJTableModel();
				limparCampos();

			}
		});
		bntAdicionar.setBounds(38, 191, 101, 23);
		contentPane.add(bntAdicionar);

		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linhaparaexc = table.getSelectedRow();

				int cpf = (int) table.getValueAt(linhaparaexc, 1);

				for (Pessoa pessoa : listaPessoas) {
					if (pessoa.getCpf() == cpf) {
						listaPessoas.remove(pessoa);
					}
				}

				atualizarJTableModel();
			}
		});
		btnExcluir.setBounds(201, 191, 89, 23);
		contentPane.add(btnExcluir);

		btnAlterar = new JButton("ALTERAR");
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linhaparaexc = table.getSelectedRow();

				int cpf = (int) table.getValueAt(linhaparaexc, 1);

				for (Pessoa pessoa : listaPessoas) {
					if (pessoa.getCpf() == cpf) {
						 // pegar os valores digitados nos campos de texto
						// setar no obj do arraylist
					}
				}

				atualizarJTableModel();
			}
		});
		btnAlterar.setBounds(338, 191, 89, 23);
		contentPane.add(btnAlterar);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(15, 98, 141, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(185, 98, 114, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(327, 36, 128, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		txtPeso = new JTextField();
		txtPeso.setBounds(327, 98, 128, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Telefone");
		lblNewLabel_1.setBounds(15, 81, 62, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(185, 81, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Peso");
		lblNewLabel_3.setBounds(328, 81, 46, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Altura");
		lblNewLabel_4.setBounds(328, 11, 46, 14);
		contentPane.add(lblNewLabel_4);
	}

	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}

	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		txtTelefone.setText("");
		txtIdade.setText("");
		txtPeso.setText("");
		txtAltura.setText("");
	}
}
