package view;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import dao.*
;
import model.*;
import control.*;

import javax.swing.JRadioButton;

import java.awt.FlowLayout;

public class IUPesquisaUsuari extends JFrame {
	private JFrame pesquisarusuario;
	private JTextField textField;
	private JTextField textField_1;
	private boolean eae;
	private JTable tabela;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IUPesquisaUsuari frame = new IUPesquisaUsuari();
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
	public IUPesquisaUsuari() {
		pesquisarusuario = new JFrame();
		pesquisarusuario.getContentPane().setLayout(new BorderLayout(0, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 660, 745);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignOnBaseline(true);
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblCategoria = new JLabel("Categoria");
		panel.add(lblCategoria);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		panel.add(lblNome);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equalsIgnoreCase("Entregador")){
					eae = false;
				} else{
					eae = true;
				}
				
				
				
				if (textField.getText().equalsIgnoreCase("Entregador") || textField.getText().equalsIgnoreCase("Cliente") ){
				CtrlPesquisaCliente ctrlPesquisaCliente = new CtrlPesquisaCliente();
				try {
				ArrayList<Cliente> listaCliente =
				ctrlPesquisaCliente.PesquisaCliente(textField_1.getText(), eae);
				DefaultTableModel modelo = new DefaultTableModel();
				tabela = new JTable(modelo);
				modelo.addColumn("nome");
				modelo.addColumn("idade");
				modelo.addColumn("endereco");
				modelo.addColumn("usuario");
				modelo.addColumn("senha");
				modelo.addRow(new Object[] {"NOME","IDADE","ENDEREÇO","USUARIO","SENHA"});
				
				getContentPane().add(tabela, BorderLayout.CENTER);
				int n = listaCliente.size();
				Cliente u = new Cliente();
				u.setClientetrue(eae);
				for (int i = 0; i<n; i++) {
				u = listaCliente.get(i);
				modelo.addRow(new Object[]
				{u.getNome(),u.getIdade(),u.getEndereco(),u.getUsuario(), u.getSenha()});
				}
			} 
				catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				}
				else if (textField.getText().equalsIgnoreCase("Loja")){
					CtrlPesquisaLoja ctrlPesquisaLoja = new CtrlPesquisaLoja();
					try {
					ArrayList<Loja> listaLoja =
					ctrlPesquisaLoja.PesquisaLoja(textField_1.getText());
					DefaultTableModel modelo = new DefaultTableModel();
					tabela = new JTable(modelo);
					modelo.addColumn("razao_social");
					modelo.addColumn("nome");
					modelo.addColumn("cnpj");
					modelo.addColumn("endereco");
					modelo.addColumn("usuario");
					modelo.addColumn("senha");

					modelo.addRow(new Object[] {"RAZÃO SOCIAL","NOME","CNPJ","ENDEREÇO","USUÁRIO","SENHA"});
					getContentPane().add(tabela, BorderLayout.CENTER);
					//contentPane.add(tabela, BorderLayout.CENTER);
					int n = listaLoja.size();
					Loja u = new Loja();
					for (int i = 0; i<n; i++) {
					u = listaLoja.get(i);
					modelo.addRow(new Object[]
					{u.getRazaosocial(),u.getNome(),u.getCnpj(),u.getEndereco(),u.getUsuario(),u.getSenha()});
					}
				} 
					catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				} else{
					textField_1.setText("Digite uma categoria válida");
				}
			
			
			
			
			}
				
		});
		panel.add(btnNewButton);
		
		tabela = new JTable();
		tabela.setBackground(new Color(216, 191, 216));
		getContentPane().add(tabela, BorderLayout.CENTER);
		}
	
	}
	
