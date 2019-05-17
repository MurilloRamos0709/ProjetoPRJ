package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.classes.Usuario;

public class GerenciarUsuarios extends JFrame {

	public static void main(String[] args) {
		
		//Instancias da classe JFrame
		JFrame janela = new JFrame();
		janela.setSize(505,400);
		janela.setTitle("Gerenciar Usuario");
		janela.setLocationRelativeTo(null);//alinha a janela ao centro da tela
		//retira a janela da memoria quando clica no botao fechar
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//impede
		janela.setResizable(false);
		
		
		//Vamos configura o gerenciador de lauot do java
		//usaremos o Gerenciador null(nulo). Isso fara com que
		//o gerenciador seja encarado como absolute(absoluto)
		janela.getContentPane().setLayout(null);
		//agora podemos criar nosso componentes e posicionar
		//da maneira que qisermos
		
		JButton btnCadastrar = new JButton("Cadastrar");
 
		
		/*
		 * o fato de voçê ter configurado o genrenciador de layout
		 * como null(absolute) lhe permite posicionar os elementos(
		 * componentes)em qualquer parte da tela usando cordenadas:
		 * x -> posiçao horizoltal
		 * y -> posiçao vertical
		 * width -> largura
		 * height -> altura
		 */
		btnCadastrar.setBounds(10, 320, 150, 30);
		//para adicionar o botao a janela iremos usar
		//o comando add e passar como parametro o componente
		//que neste caso e o btnCadastrar
		janela.add(btnCadastrar);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setBounds(170, 320, 150, 30);
		janela.add(btnLogar);
		
		JButton btnLogout = new JButton("Sair");
		btnLogout.setBounds(330, 320, 150, 30);
		janela.add(btnLogout);
		
		
		//Vamos inseri as labels a janela
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(10, 50, 300, 30);
		janela.add(lblLogin);
		
		//Vamos inseri as labels a janela
		JTextField txtLogin = new JTextField();
		txtLogin.setBounds(120, 50, 330, 30);
		janela.add(txtLogin);
		
		JLabel lblSenha = new JLabel ("Senha");
		lblSenha.setBounds(10, 90, 100, 30);
		janela.add(lblSenha);
		
		JPasswordField txtSenha = new JPasswordField();
		txtSenha.setBounds(120, 90, 330, 30);
		janela.add(txtSenha);
		
		JTextField txtResultado = new JTextField();
		txtResultado.setBounds(120, 150, 330, 130);
		janela.add(txtResultado);
		
		JLabel lblResultado = new JLabel ("Resultado");
		lblResultado.setBounds(10, 150, 100, 30);
		janela.add(lblResultado);
		
		/*
		 * vamos adicionar a acao de click  ao botao cadastrar e realizar 
		 * a chamada do metodo cadastrar que esta na classe Usuario
		 */
		
		Usuario us = new Usuario();
		
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				us.login = txtLogin.getText();//pegar o que foi escrito na caixa do login
				us.senha = txtSenha.getText();//pegar o que foi escrito na caixa do senha
				txtResultado.setText(us.cadastrar());
				
			}
		});
		

		
		
		btnLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(us.logar());
				
			}
		});
		
		
		
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(us.logout());
				
			}
		});
		
		
		janela.setVisible(true);

	}

}
