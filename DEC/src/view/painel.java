package view;

import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

import javax.swing.border.EmptyBorder;

public class painel extends JPanel {

	/**
	 * Create the panel.
	 */
	public painel() {
		setBorder(new EmptyBorder(1, 1, 1, 1));
		setBackground(new Color(221, 160, 221));
		setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton_1 = new JButton("Cliente");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(216, 191, 216));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_1.setIcon(new ImageIcon(painel.class.getResource("/view/images/people-icon.png")));

			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton_1.setIcon(new ImageIcon(painel.class.getResource("/view/images/peoplesmall.png")));

			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ClienteCadastro frame = new ClienteCadastro();
				frame.setVisible(true);
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(painel.class.getResource("/view/images/peoplesmall.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Visitante");
		btnNewButton_3.setBackground(new Color(216, 191, 216));
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_3.setIcon(new ImageIcon(painel.class.getResource("/view/images/Users-Guest-icon.png")));

				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton_3.setIcon(new ImageIcon(painel.class.getResource("/view/images/guestpequeno.png")));

			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Visita n = new Visita();
				n.setVisible(true);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(painel.class.getResource("/view/images/guestpequeno.png")));
		add(btnNewButton_3);
		CADEntregador frame = new CADEntregador();

		JButton btnNewButton_4 = new JButton("Loja");
		btnNewButton_4.setBackground(new Color(216, 191, 216));
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_4.setIcon(new ImageIcon(painel.class.getResource("/view/images/shopgrande.png")));

			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton_4.setIcon(new ImageIcon(painel.class.getResource("/view/images/shoppequeno.png")));

			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(true);
				
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(painel.class.getResource("/view/images/shoppequeno.png")));
		add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("Sobre n\u00F3s");
		btnNewButton_2.setBackground(new Color(216, 191, 216));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton_2.setIcon(new ImageIcon(painel.class.getResource("/view/images/infopequeno.png")));

				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_2.setIcon(new ImageIcon(painel.class.getResource("/view/images/info-icon.png")));

			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Sobrenos b = new Sobrenos();
				b.setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(painel.class.getResource("/view/images/infopequeno.png")));
		add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Entregador");
		btnNewButton.setBackground(new Color(216, 191, 216));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon(painel.class.getResource("/view/images/truck-icon.png")));

			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon(painel.class.getResource("/view/images/trucksmall.png")));

			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ClienteCadastro frame = new ClienteCadastro();
				frame.setVisible(true);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(painel.class.getResource("/view/images/trucksmall.png")));
		add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("Administrador");
		btnNewButton_5.setBackground(new Color(216, 191, 216));
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_5.setIcon(new ImageIcon(painel.class.getResource("/view/images/Users-Administrator-2-icon.png")));

			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton_5.setIcon(new ImageIcon(painel.class.getResource("/view/images/Users-Administratorpequeno.png")));

			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Admpage a = new Admpage();
				a.setVisible(true);
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(painel.class.getResource("/view/images/Users-Administratorpequeno.png")));
		add(btnNewButton_5);

	}

}
