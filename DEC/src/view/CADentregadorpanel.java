package view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import control.CtrlCadLoja;
import dao.LojaDAO;
import model.Loja;


import control.CtrlCadCliente;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CADentregadorpanel extends JPanel {
	private JTextField txtNome;
	private JTextField txtCnpj;
	private JTextField txtUsuario;
	private JTextField txtEndereco;
	private JPasswordField txtSenha;
	private JTextField txtRazoSocial;
	private JTextField resultado;

	/**
	 * Create the panel.
	 */
	public CADentregadorpanel() {
		setBackground(new Color(216, 191, 216));
		setLayout(null);
		txtNome = new JTextField();
		txtNome.setBackground(new Color(255, 255, 255));
		txtNome.setBounds(103, 36, 164, 20);
		add(txtNome);
		txtNome.setColumns(10);
		
		txtCnpj = new JTextField();
		txtCnpj.setBounds(103, 61, 164, 20);
		add(txtCnpj);
		txtCnpj.setColumns(10);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(103, 112, 164, 20);
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(103, 84, 164, 20);
		add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblBemVindoAo = new JLabel("Bem vindo ao cadastro de lojas");
		lblBemVindoAo.setBounds(10, 11, 388, 14);
		add(lblBemVindoAo);
		
		JLabel lblDigiteSeuNome = new JLabel("Nome");
		lblDigiteSeuNome.setBounds(10, 39, 100, 14);
		add(lblDigiteSeuNome);
		
		JLabel lblIdade = new JLabel("CNPJ");
		lblIdade.setBounds(10, 64, 46, 14);
		add(lblIdade);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 87, 46, 14);
		add(lblEndereo);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(10, 115, 46, 14);
		add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 146, 46, 14);
		add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(103, 143, 164, 20);
		add(txtSenha);
		
		txtRazoSocial = new JTextField();
		txtRazoSocial.setBounds(103, 174, 164, 20);
		add(txtRazoSocial);
		txtRazoSocial.setColumns(10);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o social");
		lblRazoSocial.setBounds(10, 177, 83, 14);
		add(lblRazoSocial);
		
		JButton btnConfirmar = new JButton("Finalizar cadastro");
		btnConfirmar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
				btnConfirmar.setBounds(207, 215, 164, 23);
				
						add(btnConfirmar);
	
		JCheckBox chckbxEuConcordoCom = new JCheckBox("");
		chckbxEuConcordoCom.setBackground(new Color(221, 160, 221));
		chckbxEuConcordoCom.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				 
				btnConfirmar.addMouseListener(new MouseAdapter() {
					@Override
							public void mouseClicked(MouseEvent arg0) {
						if(chckbxEuConcordoCom.isSelected()){	
							
							CtrlCadLoja ctrlUsu = new CtrlCadLoja();
							String senha = String.valueOf(txtSenha.getPassword());
							int res = ctrlUsu.InsereLoja(txtNome.getText(), txtCnpj.getText(),txtEndereco.getText(), txtUsuario.getText(), senha , txtRazoSocial.getText());
							if (res == 0) {
							resultado.setText("Erro na inclusão");
							} else {
							resultado.setText("Inclusão com sucesso");

							
							
							System.exit(0);}
							
							
							System.exit(0);}
							}
						
						});
				
			}
		});
		chckbxEuConcordoCom.setBounds(10, 215, 21, 23);
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
				Termosdeuso frame = new Termosdeuso();
				frame.setVisible(true);
			}
		});
		lblNewLabel.setBounds(37, 219, 184, 14);
		add(lblNewLabel);
		
		resultado = new JTextField();
		resultado.setBounds(10, 248, 317, 20);
		add(resultado);
		resultado.setColumns(10);
	}

	
}
