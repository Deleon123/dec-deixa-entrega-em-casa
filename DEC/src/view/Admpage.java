package view;

import java.awt.BorderLayout;

import control.CtrlCadAdmin;

import java.awt.EventQueue;

import dao.*;
import model.Cliente;
import control.CtrlCadCliente;
import control.CtrlCadLoja;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.sql.SQLException;

import model.Admin;
import dao.AdminDAO;
public class Admpage extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField senha;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admpage frame = new Admpage();
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
	public Admpage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Admpage.class.getResource("/view/images/LogoMakr_7pFDPr.png")));
		setBackground(new Color(230, 230, 250));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 544, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHackearUsurios = new JButton("Liberar acesso");
		btnHackearUsurios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		
		btnHackearUsurios.setBackground(Color.WHITE);
	
		btnHackearUsurios.setBounds(128, 91, 162, 23);
		contentPane.add(btnHackearUsurios);
		
		usuario = new JTextField();
		usuario.setBounds(71, 60, 91, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		senha = new JPasswordField();
		senha.setBounds(229, 60, 91, 20);
		contentPane.add(senha);

		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(25, 63, 46, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(184, 63, 46, 14);
		contentPane.add(lblSenha);
		
		btnHackearUsurios.addMouseListener(new MouseAdapter() {
			@Override
			
			
			
			
			public void mouseClicked(MouseEvent arg0) {				
				CtrlCadAdmin ctrlCadUsuario = new CtrlCadAdmin();
				try {
				Admin a = ctrlCadUsuario.PesquisaAdmin(usuario.getText());
				String senhaa = String.valueOf(senha.getPassword());
				
				if((usuario.getText().equals(a.getUsuario()))&&(senhaa.equals(a.getSenha()))){
					AdmPesquisareApagar window = new AdmPesquisareApagar();
				window.main(null);
				resultado.setText("Conexão realizada com sucesso");

				}
				else{
					resultado.setText("Usuário e senha inválidos");
				}
				
				}
				catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				resultado.setText("Usuário e senha inválidos");	
				
			}
			}});
		
		JLabel lblDi = new JLabel("SEJA BEM VINDO ADMINISTRADOR");
		lblDi.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblDi.setBounds(10, 11, 530, 14);
		contentPane.add(lblDi);
		
		resultado = new JTextField();
		resultado.setBounds(71, 36, 244, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
	}
}
