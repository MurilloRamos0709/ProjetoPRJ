package br.com.exemplo.basico;

import com.matematica.funcoes.*;

public class UsarFuncoes {

	public static void main(String[] args) {
		//vamos declarar uma rede de valores
		//do tipo double e passar as funcoes
		
		double[] valores = {15, 32, 56, 80, 11};
		MFuncoes  funcoes = new MFuncoes();
		System.out.println("O Resultado da soma �: "+funcoes.soma(valores));
		System.out.println("O Resultado da media � "+funcoes.media(valores));
		System.out.println("O maior valor � "+funcoes.maximo(valores));

	}

}
