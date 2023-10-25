import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
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
	public Sobre() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CalcInvest - Calculadora de Investimentos");
		lblNewLabel.setBounds(33, 43, 225, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblVersao = new JLabel("Versão: 1.0");
		lblVersao.setBounds(33, 80, 225, 14);
		contentPane.add(lblVersao);
		
		JLabel lblAutor = new JLabel("Autor: Gabrieli Ribeiro Boettcher");
		lblAutor.setBounds(33, 119, 225, 14);
		contentPane.add(lblAutor);
		
		JLabel lblContato = new JLabel("Contato: gabrieli.rb@aluno.ifsc.edu.br");
		lblContato.setBounds(33, 159, 225, 14);
		contentPane.add(lblContato);
		
		JButton btnBotaoOK = new JButton("Ok");
		btnBotaoOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnBotaoOK.setBounds(101, 201, 120, 23);
		contentPane.add(btnBotaoOK);
	}
}
