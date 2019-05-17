package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.heranca.PessoaJuridica;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPessoaJuridica extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textRazaoSocial;
	private JTextField textNomeFantasma;
	private JTextField textCnpj;
	private JTextField textEmail;
	private JTextField textTelefone;
	private JTextField textEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPessoaJuridica frame = new JanelaPessoaJuridica();
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
	public JanelaPessoaJuridica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(89, 24, 22, 14);
		contentPane.add(lblId);
		
		JLabel lblRazaoSocial = new JLabel("Razao Social:");
		lblRazaoSocial.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRazaoSocial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRazaoSocial.setBounds(40, 49, 71, 14);
		contentPane.add(lblRazaoSocial);
		
		JLabel lblNomeFantasma = new JLabel("Nome Fantasma:");
		lblNomeFantasma.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomeFantasma.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomeFantasma.setBounds(22, 74, 89, 14);
		contentPane.add(lblNomeFantasma);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCnpj.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCnpj.setBounds(77, 99, 34, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(63, 135, 48, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefone.setBounds(40, 160, 71, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereo.setBounds(52, 198, 59, 14);
		contentPane.add(lblEndereo);
		
		textId = new JTextField();
		textId.setBounds(127, 21, 218, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textRazaoSocial = new JTextField();
		textRazaoSocial.setColumns(10);
		textRazaoSocial.setBounds(127, 46, 218, 20);
		contentPane.add(textRazaoSocial);
		
		textNomeFantasma = new JTextField();
		textNomeFantasma.setColumns(10);
		textNomeFantasma.setBounds(127, 71, 218, 20);
		contentPane.add(textNomeFantasma);
		
		textCnpj = new JTextField();
		textCnpj.setColumns(10);
		textCnpj.setBounds(129, 96, 216, 20);
		contentPane.add(textCnpj);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(129, 132, 216, 20);
		contentPane.add(textEmail);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(129, 157, 216, 20);
		contentPane.add(textTelefone);
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(129, 195, 216, 20);
		contentPane.add(textEndereco);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		PessoaJuridica pj = new PessoaJuridica();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pj.cadastrar();
			}
		});
		btnCadastrar.setBounds(173, 226, 89, 23);
		contentPane.add(btnCadastrar);
	}

}
