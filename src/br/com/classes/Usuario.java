package br.com.classes;

public class Usuario {
//Declaraçao dos atributos da classe Usuario
	public String login;
	public String senha;
	
// Declaracao dos metodos da classe Usuario
	public String cadastrar() {
		return("Cadastro realizado com sucesso!");
	}
	
	//Declaraçao do metodo logar para permitir o acesso ao sistema
	public String logar() {
		
		String msg="";
		
		if(login.equals("adm") && senha.equals("123")) {
			msg = "Bem Vindo";
		}else {
			msg ="login ou senha incorreto";
		}
		return msg;
	}
	
	//declaraçao do metodo logout
	public String logout() {
		return"Você saiu do apricativo";
	}
}
