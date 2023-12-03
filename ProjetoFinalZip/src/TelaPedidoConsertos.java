import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Font;

public class TelaPedidoConsertos extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPedidoConsertos frame = new TelaPedidoConsertos();
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
	public TelaPedidoConsertos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPedidoConsertos.class.getResource("/Imagens/LogoSigh.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		getContentPane().setLayout(new MigLayout("", "[50.00][-58.00][140.00,grow]", "[560.00][446.00][29.00][][][][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		getContentPane().add(lblNewLabel_1, "cell 0 0");
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\ProjetoFinalPDS\\src\\Imagens\\ParteDeCimaPedidos.png"));
		getContentPane().add(lblNewLabel_4, "cell 2 0");
		
		JLabel lblNewLabel = new JLabel("       ");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\ProjetoFinalPDS\\src\\Imagens\\FundoPedidoListagem.png"));
		getContentPane().add(lblNewLabel, "cell 2 2");
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\ProjetoFinalPDS\\src\\Imagens\\AfazaresTela.png"));
		getContentPane().add(lblNewLabel_2, "cell 2 5");
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Aluno\\eclipse-workspace\\ProjetoFinalPDS\\src\\Imagens\\Realizados.png"));
		getContentPane().add(lblNewLabel_3, "cell 2 7");
	}

}
