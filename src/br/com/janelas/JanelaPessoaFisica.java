package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.heranca.PessoaFisica;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPessoaFisica extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textTelefone;
	private JTextField textEndereco;
	private JTextField textCpf;
	private JTextField textRg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPessoaFisica frame = new JanelaPessoaFisica();
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
	public JanelaPessoaFisica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblId.setBounds(27, 11, 48, 14);
		contentPane.add(lblId);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(27, 36, 48, 14);
		contentPane.add(lblNome);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereo.setBounds(15, 118, 60, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(15, 61, 60, 14);
		contentPane.add(lblEmail);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCpf.setBounds(15, 151, 60, 14);
		contentPane.add(lblCpf);
		
		JLabel lblRg_1 = new JLabel("RG:");
		lblRg_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRg_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRg_1.setBounds(15, 176, 60, 14);
		contentPane.add(lblRg_1);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefone.setBounds(15, 93, 60, 14);
		contentPane.add(lblTelefone);
		
		textId = new JTextField();
		textId.setHorizontalAlignment(SwingConstants.CENTER);
		textId.setBounds(85, 9, 244, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(85, 34, 244, 20);
		contentPane.add(textNome);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(85, 59, 244, 20);
		contentPane.add(textEmail);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(85, 91, 244, 20);
		contentPane.add(textTelefone);
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(85, 116, 244, 20);
		contentPane.add(textEndereco);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(85, 149, 244, 20);
		contentPane.add(textCpf);
		
		textRg = new JTextField();
		textRg.setColumns(10);
		textRg.setBounds(85, 174, 244, 20);
		contentPane.add(textRg);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		PessoaFisica pf = new PessoaFisica();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pf.cadastrar();
			}
		});
		btnCadastrar.setBounds(172, 215, 89, 23);
		contentPane.add(btnCadastrar);
	}
}
