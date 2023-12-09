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

import model.Funcionario;
import model.FuncionarioJTableModel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class TelaDePedidos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblNome;
	private JTextField txtNome;
	private JLabel lblEmail;
	private JTextField txtEmail;
	ArrayList<Funcionario> listaPessoas = new ArrayList<Funcionario>();
	private JButton btnAlterar;
	private JLabel lblQuarto;
	private JLabel lblData;
	private JLabel lblDescrição;
	private JTextField txtQuarto;
	private JTextField txtTelefone;
	private JTextField txtData;
	private JTextField txtDescrição;
	private JLabel lblLocalizacao;
	private JLabel lblPrioridade;
	private JLabel lblStatus;
	private JTextField txtLocalizacao;
	private JTextField txtPrioridade;
	private JTextField txtStatus;
	private JTextField txtTipoServico;
	private JTextField txtCodigo;
	private JTextField txtCusto;
	private JTextField txtTempo;
	private JTextField txtComentario;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDePedidos frame = new TelaDePedidos();
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
	public TelaDePedidos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Gabrieli\\Downloads\\Imagens\\Logo.png"));
		setTitle("Pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(474, 175, 841, 190);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int linha = table.getSelectedRow();
				Funcionario pS = listaPessoas.get(linha);
				txtNome.setText(pS.getNome());
				txtEmail.setText(String.valueOf(pS.getEmail()));
				txtTelefone.setText(String.valueOf(pS.getTelefone()));
				txtData.setText(String.valueOf(pS.getData()));
				txtDescrição.setText(String.valueOf(pS.getDescricao()));
				txtLocalizacao.setText(String.valueOf(pS.getLocalizacao()));
				txtPrioridade.setText(String.valueOf(pS.getPrioridade()));
				txtStatus.setText(String.valueOf(pS.getStatus()));
				txtTipoServico.setText(String.valueOf(pS.getTipoServico()));
				txtQuarto.setText(String.valueOf(pS.getNumQuarto()));
				txtCodigo.setText(String.valueOf(pS.getCodigoServico()));
				txtCusto.setText(String.valueOf(pS.getCusto()));
				txtTempo.setText(String.valueOf(pS.getTempo()));
				txtComentario.setText(String.valueOf(pS.getComentario()));
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		lblNome = new JLabel("Nome");
		lblNome.setBounds(48, 161, 46, 14);
		contentPane.add(lblNome);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(48, 219, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(48, 279, 86, 14);
		contentPane.add(lblTelefone);
		
		lblQuarto = new JLabel("Quarto");
		lblQuarto.setBounds(269, 161, 46, 14);
		contentPane.add(lblQuarto);
		
		lblData = new JLabel("Data");
		lblData.setBounds(48, 329, 46, 14);
		contentPane.add(lblData);
		
		lblDescrição = new JLabel("Descrição do Problema");
		lblDescrição.setBounds(48, 378, 146, 14);
		contentPane.add(lblDescrição);
		
		txtNome = new JTextField();
		txtNome.setBounds(48, 179, 146, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(48, 238, 146, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtQuarto = new JTextField();
		txtQuarto.setBounds(269, 179, 146, 20);
		contentPane.add(txtQuarto);
		txtQuarto.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(48, 298, 146, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtData = new JTextField();
		txtData.setBounds(48, 345, 146, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		txtDescrição = new JTextField();
		txtDescrição.setBounds(48, 398, 146, 20);
		contentPane.add(txtDescrição);
		txtDescrição.setColumns(10);
		
		JButton btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String email = txtEmail.getText();
				
				int telefone = 0; 
				try {
					telefone = Integer.parseInt(txtTelefone.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do telefone precisa ser numérico inteiro.");
					return;
				}
				
				int data = 0; 
				try {
					data = Integer.parseInt(txtData.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do data precisa ser numérico inteiro.");
					return;
				}
				
				String descricao = txtDescrição.getText();
				String localizacao = txtLocalizacao.getText();
				String prioridade = txtPrioridade.getText();
				String status = txtStatus.getText();
				String tipoServico = txtTipoServico.getText();
				
				int Quarto = 0;
				try {
					Quarto = Integer.parseInt(txtQuarto.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do número do quarto precisa ser numérico inteiro.");
					return;
				}
				
				int codigoServico = 0;
				try {
					codigoServico = Integer.parseInt(txtCodigo.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do código do serviço precisa ser numérico.");
					return;
				}
				
				int custo = 0;
				try {
					custo = Integer.parseInt(txtCusto.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do custo estimado precisa ser numérico.");
					return;
				}
				
				int tempo = 0;
				try {
					tempo = Integer.parseInt(txtTempo.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do tempo estimado precisa ser numérico.");
					return;
				}
				
				String comentario = txtComentario.getText();
				
				Funcionario f = new Funcionario();
				f.setNome(nome);
				f.setEmail(email);
				f.setTelefone(telefone);
				f.setData(data);
				f.setDescricao(descricao);
				f.setLocalizacao(localizacao);
				f.setPrioridade(prioridade);
				f.setStatus(status);
				f.setTipoServico(tipoServico);
				f.setNumQuarto(Quarto);
				f.setCodigoServico(codigoServico);
				f.setCusto(custo);
				f.setTempo(tempo);
				f.setComentario(comentario);
				
				listaPessoas.add(f);
				
				atualizarJTableModel();
				JOptionPane.showMessageDialog(null, "O pedido do funcionario " + f.getNome() + " foi adicionada.");

				
			}
		});
		btnAdicionar.setBounds(279, 520, 108, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				Funcionario f = listaPessoas.get(idx_linha);
				String texto = "Você deseja excluir" + f.getNome() + "?";
				String titulo = "Confirmar exclusão";
				int confirmacao = JOptionPane.showConfirmDialog(null, texto, titulo, JOptionPane.YES_NO_OPTION);
				
				if(confirmacao == 0) {
					listaPessoas.remove(idx_linha);
					JOptionPane.showMessageDialog(null, "O pedido do funcionario " + f.getNome() + " foi excluído.");
				}
				if(confirmacao == 1) {
					JOptionPane.showMessageDialog(null, "O pedido do funcionario " + f.getNome() + " não foi excluído.");
				}
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnExcluir.setBounds(856, 397, 89, 23);
		contentPane.add(btnExcluir);
		
		btnAlterar = new JButton("ALTERAR");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario f = listaPessoas.get(table.getSelectedRow());
				String nome = txtNome.getText();
				String email = txtEmail.getText();
				
				int telefone = 0; 
				try {
					telefone = Integer.parseInt(txtTelefone.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do telefone precisa ser numérico inteiro.");
					return;
				}
				
				int data = 0; 
				try {
					data = Integer.parseInt(txtData.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do data precisa ser numérico inteiro.");
					return;
				}
				
				String descricao = txtDescrição.getText();
				String localizacao = txtLocalizacao.getText();
				String prioridade = txtPrioridade.getText();
				String status = txtStatus.getText();
				String tipoServico = txtTipoServico.getText();
				
				int Quarto = 0;
				try {
					Quarto = Integer.parseInt(txtQuarto.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do número do quarto precisa ser numérico inteiro.");
					return;
				}
				
				int codigoServico = 0;
				try {
					codigoServico = Integer.parseInt(txtCodigo.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do código do serviço precisa ser numérico.");
					return;
				}
				
				int custo = 0;
				try {
					custo = Integer.parseInt(txtCusto.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do custo estimado precisa ser numérico.");
					return;
				}
				
				int tempo = 0;
				try {
					tempo = Integer.parseInt(txtTempo.getText());
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "O tipo do tempo estimado precisa ser numérico.");
					return;
				}
				
				String comentario = txtComentario.getText();
				
				f.setNome(nome);
				f.setEmail(email);
				f.setTelefone(telefone);
				f.setData(data);
				f.setDescricao(descricao);
				f.setLocalizacao(localizacao);
				f.setPrioridade(prioridade);
				f.setStatus(status);
				f.setTipoServico(tipoServico);
				f.setNumQuarto(Quarto);
				f.setCodigoServico(codigoServico);
				f.setCusto(custo);
				f.setTempo(tempo);
				f.setComentario(comentario);
				
				atualizarJTableModel();
				JOptionPane.showMessageDialog(null, "O pedido do funcionario " + f.getNome() + " foi atualizado.");
				limparCampos();
				
			}
		});
		btnAlterar.setBounds(661, 397, 89, 23);
		contentPane.add(btnAlterar);
		
		lblLocalizacao = new JLabel("Localização do Problema");
		lblLocalizacao.setBounds(48, 438, 146, 14);
		contentPane.add(lblLocalizacao);
		
		lblPrioridade = new JLabel("Prioridade");
		lblPrioridade.setBounds(48, 490, 86, 14);
		contentPane.add(lblPrioridade);
		
		lblStatus = new JLabel("Status do Pedido");
		lblStatus.setBounds(48, 544, 133, 14);
		contentPane.add(lblStatus);
		
		txtLocalizacao = new JTextField();
		txtLocalizacao.setBounds(48, 453, 146, 20);
		contentPane.add(txtLocalizacao);
		txtLocalizacao.setColumns(10);
		
		txtPrioridade = new JTextField();
		txtPrioridade.setBounds(48, 508, 146, 20);
		contentPane.add(txtPrioridade);
		txtPrioridade.setColumns(10);
		
		txtStatus = new JTextField();
		txtStatus.setBounds(48, 559, 146, 20);
		contentPane.add(txtStatus);
		txtStatus.setColumns(10);
		
		JLabel lblTipoServico = new JLabel("Tipo do Serviço");
		lblTipoServico.setBounds(269, 219, 118, 14);
		contentPane.add(lblTipoServico);
		
		txtTipoServico = new JTextField();
		txtTipoServico.setBounds(269, 238, 146, 20);
		contentPane.add(txtTipoServico);
		txtTipoServico.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(269, 298, 146, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Código do Pedido");
		lblCodigo.setBounds(269, 279, 118, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblCusto = new JLabel("Custo Estimado");
		lblCusto.setBounds(269, 329, 118, 14);
		contentPane.add(lblCusto);
		
		txtCusto = new JTextField();
		txtCusto.setBounds(269, 345, 146, 20);
		contentPane.add(txtCusto);
		txtCusto.setColumns(10);
		
		JLabel lblTempo = new JLabel("Tempo Estimado");
		lblTempo.setBounds(269, 378, 118, 14);
		contentPane.add(lblTempo);
		
		txtTempo = new JTextField();
		txtTempo.setBounds(269, 398, 146, 20);
		contentPane.add(txtTempo);
		txtTempo.setColumns(10);
		
		JLabel lblComentario = new JLabel("Cometário");
		lblComentario.setBounds(269, 438, 96, 14);
		contentPane.add(lblComentario);
		
		txtComentario = new JTextField();
		txtComentario.setBounds(269, 453, 146, 20);
		contentPane.add(txtComentario);
		txtComentario.setColumns(10);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnFechar.setBounds(1046, 397, 89, 23);
		contentPane.add(btnFechar);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaDePedidos.class.getResource("/Imagem/Listagem.png")));
		lblNewLabel_1.setBounds(0, 0, 1370, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TelaDePedidos.class.getResource("/Imagem/Manutenção.png")));
		lblNewLabel_2.setBounds(0, 42, 1370, 78);
		contentPane.add(lblNewLabel_2);
		
	}
	
	public void atualizarJTableModel() {
		table.setModel(new FuncionarioJTableModel(listaPessoas));

	}
	
	public void limparCampos() {
		txtNome.setText("");
		txtEmail.setText("");
		txtTelefone.setText("");
		txtData.setText("");
		txtDescrição.setText("");
		txtLocalizacao.setText("");
		txtPrioridade.setText("");
		txtStatus.setText("");
		txtQuarto.setText("");
		txtTipoServico.setText("");
		txtCodigo.setText("");
		txtCusto.setText("");
		txtTempo.setText("");
		txtComentario.setText("");
	}
}