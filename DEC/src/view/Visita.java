package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Visita extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visita frame = new Visita();
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
	public Visita() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 485, 534);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(186, 53, 46, 14);
		contentPane.add(lblEndereo);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 95, 46, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(49, 50, 114, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 53, 46, 14);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(252, 50, 114, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 115, 46, 14);
		contentPane.add(label_1);
		
		JButton btnConfirmar = new JButton("Finalizar pedido");
		btnConfirmar.setBounds(207, 215, 164, 23);
		
		
		JCheckBox chckbxEuConcordoCom = new JCheckBox("");
	chckbxEuConcordoCom.setBackground(new Color(221, 160, 221));
	chckbxEuConcordoCom.addMouseListener(new MouseAdapter() {


		@Override
		public void mouseClicked(MouseEvent arg0) {
			
			getContentPane().add(btnConfirmar); 
			btnConfirmar.addMouseListener(new MouseAdapter() {
				@Override
						public void mouseClicked(MouseEvent arg0) {
								System.exit(0);
						}
					
					});
			
		}
	});	
	chckbxEuConcordoCom.setBounds(97, 106, 21, 23);
	getContentPane().add(chckbxEuConcordoCom);
	
	JLabel lblNewLabel = new JLabel("Li e aceito os termos de uso");
	lblNewLabel.setForeground(new Color(0, 0, 0));
	lblNewLabel.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent arg0) {
		lblNewLabel.setForeground(new Color(0, 0, 255));
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			lblNewLabel.setForeground(new Color(0, 0, 0));
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {
			Termosdeuso a = new Termosdeuso();
			a.setVisible(true);
		}
	});
	lblNewLabel.setBounds(124, 115, 184, 14);
	getContentPane().add(lblNewLabel);
	
	JLabel lblSejaBemVindo = new JLabel("SEJA BEM VINDO VISITANTE ");
	lblSejaBemVindo.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
	lblSejaBemVindo.setBounds(10, 3, 356, 39);
	contentPane.add(lblSejaBemVindo);
}

	}

