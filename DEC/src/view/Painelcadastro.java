package view;
import dao.*;
import model.Cliente;
import control.CtrlCadCliente;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.Color;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Painelcadastro extends JPanel {
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtUsuario;
	private JTextField txtEndereco;
	private JPasswordField txtSenha;
	private JTextField resultado;
	private boolean clientetrue;
	/**
	 * Create the panel.
	 */
	public Painelcadastro() {
		setBackground(new Color(216, 191, 216));
		setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(108, 36, 164, 20);
		add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(108, 61, 164, 20);
		add(txtIdade);
		txtIdade.setColumns(10);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(108, 115, 164, 20);
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(108, 84, 164, 20);
		add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblBemVindoAo = new JLabel("Bem vindo ao cadastro de clientes e entregadores");
		lblBemVindoAo.setBounds(10, 11, 388, 14);
		add(lblBemVindoAo);
		
		JLabel lblDigiteSeuNome = new JLabel("Digite seu nome");
		lblDigiteSeuNome.setBounds(10, 39, 157, 14);
		add(lblDigiteSeuNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 64, 46, 14);
		add(lblIdade);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 87, 66, 14);
		add(lblEndereo);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(10, 115, 46, 14);
		add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 146, 46, 14);
		add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setEchoChar('*');
		txtSenha.setBounds(108, 143, 164, 20);
		add(txtSenha);

	

			
			
	JCheckBox chckbxEuConcordoCom = new JCheckBox("");
	chckbxEuConcordoCom.setBackground(new Color(221, 160, 221));
	chckbxEuConcordoCom.addMouseListener(new MouseAdapter() {


		@Override
		public void mouseClicked(MouseEvent arg0) {
			
			
		}
	});
	chckbxEuConcordoCom.setBounds(16, 265, 21, 23);
	add(chckbxEuConcordoCom);
	
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
	lblNewLabel.setBounds(43, 274, 184, 14);
	add(lblNewLabel);
	
	JButton btnConfirmar = new JButton("Finalizar cadastro");
	btnConfirmar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	btnConfirmar.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			if(chckbxEuConcordoCom.isSelected()){	
				int idade = Integer.parseInt(txtIdade.getText());				
				
				CtrlCadCliente ctrlUsu = new CtrlCadCliente();
				String senha = String.valueOf(txtSenha.getPassword());
				int res = ctrlUsu.InsereUsuario(txtNome.getText(), idade, txtEndereco.getText(), txtUsuario.getText(), senha, isClientetrue() );
				if (res == 0) {
				resultado.setText("Erro na inclusão");
				} else {
				resultado.setText("Inclusão com sucesso");

				
				
				System.exit(0);}
		
		}
		}});
	btnConfirmar.setBounds(249, 265, 157, 23);
	add(btnConfirmar);
	
	resultado = new JTextField();
	resultado.setBounds(72, 174, 300, 20);
	add(resultado);
	resultado.setColumns(10);
		
	JRadioButton rdbtnCliente = new JRadioButton("cliente");

	JRadioButton rdbtnEntregador = new JRadioButton("entregador");
	rdbtnEntregador.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			rdbtnCliente.setSelected(false);
			setClientetrue(false);
		}
	});
	rdbtnEntregador.setBackground(new Color(216,191,216));
	rdbtnEntregador.setBounds(16, 222, 109, 23);
	add(rdbtnEntregador);
	
	rdbtnCliente.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		rdbtnEntregador.setSelected(false);
		setClientetrue(true);
		}
	});
	rdbtnCliente.setBackground(new Color(216,191,216));
	rdbtnCliente.setBounds(164, 222, 109, 23);
	add(rdbtnCliente);
	}
	
	public boolean isClientetrue() {
		return clientetrue;
	}
	public void setClientetrue(boolean clientetrue) {
		this.clientetrue = clientetrue;
	}
}

