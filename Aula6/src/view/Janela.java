package view;

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

import model.Pessoa;
import model.PessoaJTableModel;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblNome;
	private JTextField txtNome;
	private JLabel lblCPF;
	private JTextField txtCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnAlterar;
	private JLabel lblIdade;
	private JLabel lblAltura;
	private JLabel lblPeso;
	private JTextField txtIdade;
	private JTextField txtTelefone;
	private JTextField txtAltura;
	private JTextField txtPeso;

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
		setTitle("Lista de Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 160, 422, 146);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int linha = table.getSelectedRow();
				Pessoa pS = listaPessoas.get(linha);
				txtNome.setText(pS.getNome());
				txtCPF.setText(String.valueOf(pS.getCpf()));
				txtTelefone.setText(String.valueOf(pS.getTelefone()));
				txtIdade.setText(String.valueOf(pS.getIdade()));
				txtAltura.setText(String.valueOf(pS.getAltura()));
				txtPeso.setText(String.valueOf(pS.getPeso()));
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 11, 46, 14);
		contentPane.add(lblNome);
		
		lblCPF = new JLabel("CPF");
		lblCPF.setBounds(176, 11, 46, 14);
		contentPane.add(lblCPF);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(304, 11, 86, 14);
		contentPane.add(lblTelefone);
		
		lblIdade = new JLabel("Idade");
		lblIdade.setBounds(20, 67, 46, 14);
		contentPane.add(lblIdade);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(176, 67, 46, 14);
		contentPane.add(lblAltura);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setBounds(304, 67, 46, 14);
		contentPane.add(lblPeso);
		
		txtNome = new JTextField();
		txtNome.setBounds(20, 36, 146, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(176, 36, 118, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(20, 92, 86, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(304, 36, 118, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(176, 92, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(304, 92, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				int cpf = 0;
				try {
					cpf = Integer.parseInt(txtCPF.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do CPF precisa ser numérico inteiro.");
					return;
				}
				int telefone = 0; 
				try {
					telefone = Integer.parseInt(txtTelefone.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do telefone precisa ser numérico inteiro.");
					return;
				}
				int idade = 0; 
				try {
					idade = Integer.parseInt(txtIdade.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do idade precisa ser numérico inteiro.");
					return;
				}
				float altura = 0;
				try {
					altura = Float.parseFloat(txtAltura.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do altura precisa ser numérico inteiro.");
					return;
				}
				float peso = 0;
				try {
					peso = Float.parseFloat(txtPeso.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do peso precisa ser numérico.");
					return;
				}
				
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(cpf);
				p.setTelefone(telefone);
				p.setIdade(idade);
				p.setPeso(peso);
				p.setAltura(altura);
				
				listaPessoas.add(p);
				
				atualizarJTableModel();
				JOptionPane.showMessageDialog(null, "A pessoa " + p.getNome() + " foi adicionada.");
				limparCampos();
				
			}
		});
		btnAdicionar.setBounds(32, 126, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				Pessoa p = listaPessoas.get(idx_linha);
				String texto = "Você deseja excluir a pessoa " + p.getNome() + "?";
				String titulo = "Confirmar exclusão";
				int confirmacao = JOptionPane.showConfirmDialog(null, texto, titulo, JOptionPane.YES_NO_OPTION);
				if(confirmacao == 0) {
					listaPessoas.remove(idx_linha);
					JOptionPane.showMessageDialog(null, "A pessoa " + p.getNome() + " foi excluída.");
				}
				if(confirmacao == 1) {
					JOptionPane.showMessageDialog(null, "A pessoa " + p.getNome() + " não foi excluída.");
				}
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnExcluir.setBounds(162, 126, 89, 23);
		contentPane.add(btnExcluir);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoa p = listaPessoas.get(table.getSelectedRow());
				String nome = txtNome.getText();
				int cpf = 0;
				try {
					cpf = Integer.parseInt(txtCPF.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do CPF precisa ser numérico inteiro.");
					return;
				}
				int telefone = 0; 
				try {
					telefone = Integer.parseInt(txtTelefone.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do telefone precisa ser numérico inteiro.");
					return;
				}
				int idade = 0; 
				try {
					idade = Integer.parseInt(txtIdade.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do idade precisa ser numérico inteiro.");
					return;
				}
				float peso = 0;
				try {
					peso = Float.parseFloat(txtPeso.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do peso precisa ser numérico.");
					return;
				}
				float altura = 0;
				try {
					altura = Float.parseFloat(txtAltura.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do altura precisa ser numérico inteiro.");
					return;
				}
				
				p.setNome(nome);
				p.setCpf(cpf);
				p.setTelefone(telefone);
				p.setIdade(idade);
				p.setPeso(peso);
				p.setAltura(altura);
				
				atualizarJTableModel();
				
				JOptionPane.showMessageDialog(null, "A pessoa " + p.getNome() + " foi atualizada.");
				
				limparCampos();
				
			}
		});
		btnAlterar.setBounds(289, 126, 89, 23);
		contentPane.add(btnAlterar);
		
		
		
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
