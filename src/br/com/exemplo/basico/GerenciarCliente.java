package br.com.exemplo.basico;

import com.constutores.Cliente;

public class GerenciarCliente {

	public static void main(String[] args) {
		//Instacia da classe Cliente
		
		Cliente cl2 = new Cliente();
		cl2.setId(10);
		cl2.setNome("Guilherme");
		cl2.setEmail("guilherme@gmail.com");
		
		System.out.println(cl2.nomePorId(10));

	}

}
