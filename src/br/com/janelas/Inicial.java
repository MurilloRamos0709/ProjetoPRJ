package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPessoaFisica = new JButton("Pessoa Fisica");
		btnPessoaFisica.setForeground(Color.BLACK);
		btnPessoaFisica.setBackground(Color.WHITE);
		btnPessoaFisica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaPessoaFisica jpf = new JanelaPessoaFisica();
				jpf.setVisible(true);
			}
		});
		btnPessoaFisica.setFont(new Font("Felix Titling", Font.BOLD, 12));
		btnPessoaFisica.setBounds(10, 35, 203, 193);
		contentPane.add(btnPessoaFisica);
		
		JButton btnPessoaJuridica = new JButton("Pessoa Juridica");
		btnPessoaJuridica.setBackground(Color.WHITE);
		btnPessoaJuridica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaPessoaJuridica jpj = new JanelaPessoaJuridica();
				jpj.setVisible(true);
			}
		});
		btnPessoaJuridica.setFont(new Font("Felix Titling", Font.BOLD, 12));
		btnPessoaJuridica.setBounds(221, 35, 203, 193);
		contentPane.add(btnPessoaJuridica);
	}

}
