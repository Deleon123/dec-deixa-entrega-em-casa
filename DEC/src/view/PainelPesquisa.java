package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PainelPesquisa extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PainelPesquisa() {
		setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(11, 104, 27, 14);
		add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(101, 101, 158, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 70, 254, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(11, 73, 80, 14);
		add(lblCategoria);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(266, 100, 89, 23);
		add(btnPesquisar);

	}

}
