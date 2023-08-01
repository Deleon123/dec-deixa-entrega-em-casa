package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Toolkit;
import javax.swing.JButton;

public class IUMenuprincipal {

	private JFrame frmDeixaentregaemcasacombr;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IUMenuprincipal window = new IUMenuprincipal();
					window.frmDeixaentregaemcasacombr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IUMenuprincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeixaentregaemcasacombr = new JFrame();
		frmDeixaentregaemcasacombr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeixaentregaemcasacombr.setTitle("DeixaEntregaemCasa.com.br");
		frmDeixaentregaemcasacombr.setIconImage(Toolkit.getDefaultToolkit().getImage(IUMenuprincipal.class.getResource("/view/images/LogoMakr_7pFDPr.png")));
		frmDeixaentregaemcasacombr.setResizable(false);
		frmDeixaentregaemcasacombr.setBounds(100, 100, 569, 460);
		frmDeixaentregaemcasacombr.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 128));
		frmDeixaentregaemcasacombr.getContentPane().add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 128));
		frmDeixaentregaemcasacombr.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setForeground(new Color(255, 255, 255));
		panel_1.add(lblUsurio);
		
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textField.setBackground(new Color(255,255,210));
			}
			
			@Override
			public void focusLost(FocusEvent arg0) {
				textField.setBackground(new Color(255,255,255));
			}
		});
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(255, 255, 255));
		panel_1.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_1.setBackground(new Color(255,255,210));
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				textField_1.setBackground(new Color(255,255,255));
			}
		});
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 0, 128));
		frmDeixaentregaemcasacombr.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 0, 128));
		frmDeixaentregaemcasacombr.getContentPane().add(panel_3, BorderLayout.EAST);
		painel panel_4 = new painel();
		panel_4.setBackground(new Color(128, 0, 128));
		frmDeixaentregaemcasacombr.getContentPane().add(panel_4, BorderLayout.CENTER);
	}

}
