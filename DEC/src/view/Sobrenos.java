package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Sobrenos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobrenos frame = new Sobrenos();
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
	public Sobrenos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobrenos.class.getResource("/view/images/LogoMakr_7pFDPr.png")));
		setTitle("Sobre n\u00F3s");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 532, 447);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSomosAUniversal = new JLabel("Somos uma empresa de servi\u00E7o de entrega de diversos produtos");
		lblSomosAUniversal.setBounds(20, 27, 368, 98);
		contentPane.add(lblSomosAUniversal);
		
		JLabel lblNewLabel_1 = new JLabel("SAIBA MAIS...");
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 25, 324, 14);
		contentPane.add(lblNewLabel_1);
	}
}
