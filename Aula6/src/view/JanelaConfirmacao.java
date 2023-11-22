package view;

	import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

	public class JanelaConfirmacao extends JFrame {

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						JanelaConfirmacao frame = new JanelaConfirmacao();
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
		public JanelaConfirmacao() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			
			String nome = "Amanda";
			JLabel lblPessoa = new JLabel("Excluir pessoa "+ nome);
			
			JButton btnConfirma = new JButton("Confirmar exclusão");
			btnConfirma.setBackground(new Color(255, 182, 193));
			
			JButton btnCancelar = new JButton("Cancelar");
			GroupLayout gl_contentPane = new GroupLayout(contentPane);
			gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(187)
								.addComponent(lblPessoa))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(84)
								.addComponent(btnConfirma)
								.addGap(41)
								.addComponent(btnCancelar)))
						.addContainerGap(85, Short.MAX_VALUE))
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(53)
						.addComponent(lblPessoa)
						.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnConfirma)
							.addComponent(btnCancelar))
						.addGap(66))
			);
			contentPane.setLayout(gl_contentPane);
		}
	}