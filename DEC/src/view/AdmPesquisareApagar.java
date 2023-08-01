package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import model.*;
import dao.*;
import control.*;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class AdmPesquisareApagar {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtNome1;
	private JTextField txtEndereco;
	private JTextField txtIdade;
	private JTextField txtUsuarioLoja;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private boolean clientetrue;
	private JTextField txtResultado;
	private JTextField txtResultado1;
	private JTextField txtResultadoApagar;
	private JTextField resultadoReset;
	private JTextField ResultadoReset2;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	
	public boolean isClientetrue() {
		return clientetrue;
	}
	public void setClientetrue(boolean clientetrue) {
		this.clientetrue = clientetrue;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmPesquisareApagar window = new AdmPesquisareApagar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdmPesquisareApagar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(216, 191, 216));
		frame.getContentPane().setForeground(new Color(216, 191, 216));
		frame.getContentPane().setLayout(null);
		
		JLabel lblApagarAtualizarE = new JLabel("Apagar, atualizar e pesquisar entregadores e clientes");
		lblApagarAtualizarE.setBounds(10, 11, 442, 14);
		frame.getContentPane().add(lblApagarAtualizarE);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 36, 46, 14);
		frame.getContentPane().add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(66, 33, 256, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Nome");
		lblSenha.setBounds(10, 66, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		txtNome1 = new JTextField();
		txtNome1.setBounds(66, 63, 256, 20);
		frame.getContentPane().add(txtNome1);
		txtNome1.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setBounds(10, 91, 46, 14);
		frame.getContentPane().add(lblEndereco);
		
		JLabel lblNewLabel = new JLabel("Idade");
		lblNewLabel.setBounds(10, 122, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(66, 88, 256, 20);
		frame.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(66, 119, 256, 20);
		frame.getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrlCadCliente ctrlCadUsuario = new CtrlCadCliente();
				try {
				Cliente usuario = ctrlCadUsuario.PesquisaCliente(textField.getText(), isClientetrue() );
				txtNome1.setText(usuario.getNome());
				txtEndereco.setText(usuario.getEndereco());
				
				String idade = String.valueOf(usuario.getIdade());
				txtIdade.setText(idade);
				}
				catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}})
		;
		btnPesquisar.setBounds(28, 198, 89, 23);
		frame.getContentPane().add(btnPesquisar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrlCadCliente ctrCadUsuario = new CtrlCadCliente();
				int i = Integer.parseInt(txtIdade.getText());

				int res = ctrCadUsuario.AlteraCliente(textField.getText(),i , txtNome1.getText(), txtEndereco.getText(), isClientetrue());
				if (res == 0) {
				txtResultado.setText("Erro na Alteração");
				} else {
				txtResultado.setText("Alteração com sucesso");
				}
			}
		});
		btnAtualizar.setBounds(28, 230, 89, 23);
		frame.getContentPane().add(btnAtualizar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrlCadCliente ctrCadUsuario = new CtrlCadCliente();
				int res = ctrCadUsuario.ExcluiUsuario(textField.getText(), isClientetrue());
				if (res == 0) {
					txtResultadoApagar.setText("Erro na Exclusão");
				} else {
					txtResultadoApagar.setText("Exclusão com sucesso");
				}

			}
		});
		btnApagar.setBounds(28, 264, 89, 23);
		frame.getContentPane().add(btnApagar);
		
		JLabel lblDigiteOUsuario = new JLabel("Digite o usuario e aperte para pesquisar as informa\u00E7\u00F5es dele");
		lblDigiteOUsuario.setBounds(127, 202, 297, 14);
		frame.getContentPane().add(lblDigiteOUsuario);
		
		JLabel lblApsAPesquisa = new JLabel("Ap\u00F3s a pesquisa, altere os dados que voc\u00EA quer atualizar");
		lblApsAPesquisa.setBounds(127, 234, 297, 14);
		frame.getContentPane().add(lblApsAPesquisa);
		
		JLabel lblDigiteOUsurio = new JLabel("Digite o usu\u00E1rio que voc\u00EA quer apagar");
		lblDigiteOUsurio.setBounds(127, 268, 271, 14);
		frame.getContentPane().add(lblDigiteOUsurio);
		
				JRadioButton rdbtnCliente = new JRadioButton("Cliente");

		JRadioButton rdbtnEntregador = new JRadioButton("Entregador");
				rdbtnEntregador.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					rdbtnCliente.setSelected(false);
					setClientetrue(false);
					
					}
				});

		rdbtnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			rdbtnEntregador.setSelected(false);
			setClientetrue(true);
			
			}
		});
		rdbtnCliente.setBackground(new Color(216, 191, 216));
		rdbtnCliente.setBounds(50, 166, 109, 23);
		frame.getContentPane().add(rdbtnCliente);
		
		rdbtnEntregador.setBackground(new Color(216, 191, 216));
		rdbtnEntregador.setBounds(195, 166, 109, 23);
		frame.getContentPane().add(rdbtnEntregador);
		
		JButton btnResetSenha = new JButton("Reset senha");
		btnResetSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrlCadCliente ctrCadUsuario = new CtrlCadCliente();
				int i = Integer.parseInt(txtIdade.getText());

				int res = ctrCadUsuario.ResetSenhaCliente(textField.getText(), isClientetrue());
				if (res == 0) {
				resultadoReset.setText("Erro no reset");
				} else {
					resultadoReset.setText("Resetado com sucesso!");
				}
			}
		});
		btnResetSenha.setBounds(28, 312, 117, 23);
		frame.getContentPane().add(btnResetSenha);
		
		JLabel lblEscrevaONome = new JLabel("Escreva o nome do usu\u00E1rio que esqueceu a senha para resetar para 123");
		lblEscrevaONome.setBounds(155, 316, 349, 14);
		frame.getContentPane().add(lblEscrevaONome);
		
		JLabel lblApagarAtualizarE_1 = new JLabel("Apagar, atualizar e pesquisar lojas");
		lblApagarAtualizarE_1.setBounds(10, 385, 442, 14);
		frame.getContentPane().add(lblApagarAtualizarE_1);
		
		JLabel lblUsuario_1 = new JLabel("Usuario");
		lblUsuario_1.setBounds(10, 422, 46, 14);
		frame.getContentPane().add(lblUsuario_1);
		
		txtUsuarioLoja = new JTextField();
		txtUsuarioLoja.setBounds(66, 419, 256, 20);
		frame.getContentPane().add(txtUsuarioLoja);
		txtUsuarioLoja.setColumns(10);
		
		JLabel label = new JLabel("Nome");
		label.setBounds(10, 453, 46, 14);
		frame.getContentPane().add(label);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(66, 450, 256, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblCnpj = new JLabel("cnpj");
		lblCnpj.setBounds(10, 484, 46, 14);
		frame.getContentPane().add(lblCnpj);
		
		textField_6 = new JTextField();
		textField_6.setBounds(66, 481, 256, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblEndereco_1 = new JLabel("Endere\u00E7o");
		lblEndereco_1.setBounds(10, 513, 46, 14);
		frame.getContentPane().add(lblEndereco_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(66, 510, 256, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social");
		lblRazoSocial.setBounds(10, 539, 75, 14);
		frame.getContentPane().add(lblRazoSocial);
		
		textField_8 = new JTextField();
		textField_8.setBounds(95, 536, 227, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JButton button = new JButton("Pesquisar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrlCadLoja ctrlCadUsuario = new CtrlCadLoja();
				try {
				Loja usuario = ctrlCadUsuario.PesquisaLoja(txtUsuarioLoja.getText());
				
				
				textField_5.setText(usuario.getNome());
				textField_6.setText(usuario.getCnpj());
				textField_7.setText(usuario.getEndereco());
				textField_8.setText(usuario.getRazaosocial());
			
				
				}
				catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		button.setBounds(28, 590, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Atualizar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrlCadLoja ctrCadUsuario = new CtrlCadLoja();

				int res = ctrCadUsuario.AlteraLoja(txtUsuarioLoja.getText(), textField_6.getText(), textField_5.getText(), textField_7.getText(),textField_8.getText());
				if (res == 0) {
				txtResultado1.setText("Erro na Alteração");
				} else {
				txtResultado1.setText("Alteração com sucesso");
				}
				
			}
		});
		button_1.setBounds(28, 624, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Apagar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrlCadLoja ctrCadUsuario = new CtrlCadLoja();
				int res = ctrCadUsuario.ExcluiUsuario(txtUsuarioLoja.getText());
				if (res == 0) {
					textField_1.setText("Erro na Exclusão");
				} else {
					textField_1.setText("Exclusão com sucesso");
				}
			}
		});
		button_2.setBounds(28, 656, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Reset senha");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CtrlCadLoja ctrCadUsuario = new CtrlCadLoja();
				int res = ctrCadUsuario.ResetSenhaLoja(txtUsuarioLoja.getText());
				if (res == 0) {
					ResultadoReset2.setText("Erro no reset");
				} else {
					ResultadoReset2.setText("Resetado com sucesso!");
				}
			}
		});
		button_3.setBounds(28, 700, 117, 23);
		frame.getContentPane().add(button_3);
		
		JLabel lblEscrevaOUsuario = new JLabel("Escreva o usuario da loja que esqueceu a senha e clique para resetar para 123");
		lblEscrevaOUsuario.setBounds(165, 704, 421, 14);
		frame.getContentPane().add(lblEscrevaOUsuario);
		
		JLabel lblDigiteALoja_1 = new JLabel("Digite a loja que voc\u00EA quer apagar");
		lblDigiteALoja_1.setBounds(127, 660, 271, 14);
		frame.getContentPane().add(lblDigiteALoja_1);
		
		JLabel label_3 = new JLabel("Ap\u00F3s a pesquisa, altere os dados que voc\u00EA quer atualizar");
		label_3.setBounds(127, 628, 297, 14);
		frame.getContentPane().add(label_3);
		
		JLabel lblDigiteALoja = new JLabel("Digite a loja e aperte para pesquisar as informa\u00E7\u00F5es dela");
		lblDigiteALoja.setBounds(127, 594, 297, 14);
		frame.getContentPane().add(lblDigiteALoja);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(429, 231, 157, 20);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		txtResultado1 = new JTextField();
		txtResultado1.setColumns(10);
		txtResultado1.setBounds(434, 625, 235, 20);
		frame.getContentPane().add(txtResultado1);
		
		txtResultadoApagar = new JTextField();
		txtResultadoApagar.setBounds(366, 265, 157, 20);
		frame.getContentPane().add(txtResultadoApagar);
		txtResultadoApagar.setColumns(10);
		
		resultadoReset = new JTextField();
		resultadoReset.setBounds(524, 313, 195, 20);
		frame.getContentPane().add(resultadoReset);
		resultadoReset.setColumns(10);
		
		ResultadoReset2 = new JTextField();
		ResultadoReset2.setBounds(560, 701, 195, 20);
		frame.getContentPane().add(ResultadoReset2);
		ResultadoReset2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(338, 657, 137, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnPesquisar_1 = new JButton("Procurar tudo");
		btnPesquisar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			IUPesquisaUsuari a = new IUPesquisaUsuari();
			a.setVisible(true);
			}
		});
		btnPesquisar_1.setBounds(403, 7, 206, 23);
		frame.getContentPane().add(btnPesquisar_1);
		frame.setBounds(100, 100, 846, 794);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	
	}
}
