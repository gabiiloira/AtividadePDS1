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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class TelaDePedidos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblNome;
	private JTextField txtNome;
	private JLabel lblEmail;
	private JTextField txtEmail;
	ArrayList<Funcionario> listaPedidos = new ArrayList<Funcionario>();
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
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int linha = table.getSelectedRow();
				Funcionario pS = listaPedidos.get(linha);
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
		
		lblEmail = new JLabel("Email");
		
		JLabel lblTelefone = new JLabel("Telefone");
		
		lblQuarto = new JLabel("Quarto");
		
		lblData = new JLabel("Data");
		
		lblDescrição = new JLabel("Descrição do Problema");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		txtQuarto = new JTextField();
		txtQuarto.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		
		txtData = new JTextField();
		txtData.setColumns(10);
		
		txtDescrição = new JTextField();
		txtDescrição.setColumns(10);
		
        lblLocalizacao = new JLabel("Localização do Problema");
		
		lblPrioridade = new JLabel("Prioridade");
		
		lblStatus = new JLabel("Status do Pedido");
		
		txtLocalizacao = new JTextField();
		txtLocalizacao.setColumns(10);
		
		txtPrioridade = new JTextField();
		txtPrioridade.setColumns(10);
		
		txtStatus = new JTextField();
		txtStatus.setColumns(10);
		
		JLabel lblTipoServico = new JLabel("Tipo do Serviço");
		
		txtTipoServico = new JTextField();
		txtTipoServico.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Código do Pedido");
		
		JLabel lblCusto = new JLabel("Custo Estimado");
		
		txtCusto = new JTextField();
		txtCusto.setColumns(10);
		
		JLabel lblTempo = new JLabel("Tempo Estimado");
		
		txtTempo = new JTextField();
		txtTempo.setColumns(10);
		
		JLabel lblComentario = new JLabel("Cometário");
		
		txtComentario = new JTextField();
		txtComentario.setColumns(10);
		
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
				
				listaPedidos.add(f);
				
				atualizarJTableModel();
				JOptionPane.showMessageDialog(null, "O pedido do funcionario " + f.getNome() + " foi adicionada.");
			}
		});
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				Funcionario f = listaPedidos.get(idx_linha);
				String texto = "Você deseja excluir " + f.getNome() + "?";
				String titulo = "Confirmar exclusão";
				int confirmacao = JOptionPane.showConfirmDialog(null, texto, titulo, JOptionPane.YES_NO_OPTION);
				
				if(confirmacao == 0) {
					listaPedidos.remove(idx_linha);
					JOptionPane.showMessageDialog(null, "O pedido do funcionario " + f.getNome()  + " foi excluído.");
				}
				if(confirmacao == 1) {
					JOptionPane.showMessageDialog(null, "O pedido do funcionario " + f.getNome() + " não foi excluído.");
				}
				atualizarJTableModel();
				limparCampos();
			}
		});
		
		btnAlterar = new JButton("ALTERAR");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario f = listaPedidos.get(table.getSelectedRow());
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
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaDePedidos.class.getResource("/Imagem/Listagem.png")));
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TelaDePedidos.class.getResource("/Imagem/Manutenção.png")));
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 1370, GroupLayout.PREFERRED_SIZE)
				.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 1370, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(175)
					.addComponent(lblQuarto, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblData, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtData, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
					.addGap(75)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtQuarto, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipoServico, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTipoServico, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCodigo, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCusto, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCusto, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
					.addGap(59)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 865, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(lblDescrição, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(75)
					.addComponent(lblTempo, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(txtDescrição, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(75)
					.addComponent(txtTempo, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(246)
					.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(106)
					.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(101)
					.addComponent(btnFechar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(lblLocalizacao, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(75)
					.addComponent(lblComentario, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(txtLocalizacao, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(75)
					.addComponent(txtComentario, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(lblPrioridade, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(txtPrioridade, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(90)
					.addComponent(btnAdicionar, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(txtStatus, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(90)
					.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNome)
						.addComponent(lblQuarto))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(lblEmail)
							.addGap(5)
							.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(lblTelefone)
							.addGap(5)
							.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(lblData)
							.addGap(2)
							.addComponent(txtData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(txtQuarto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(lblTipoServico)
							.addGap(5)
							.addComponent(txtTipoServico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(lblCodigo)
							.addGap(5)
							.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(lblCusto)
							.addGap(2)
							.addComponent(txtCusto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescrição)
						.addComponent(lblTempo))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(txtDescrição, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(txtTempo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnAlterar)
						.addComponent(btnExcluir)
						.addComponent(btnFechar))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLocalizacao)
						.addComponent(lblComentario))
					.addGap(1)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtLocalizacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtComentario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addComponent(lblPrioridade)
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtPrioridade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(btnAdicionar)))
					.addGap(1)
					.addComponent(lblStatus)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(txtStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnLimpar)))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	
	public void atualizarJTableModel() {
		table.setModel(new FuncionarioJTableModel(listaPedidos));

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