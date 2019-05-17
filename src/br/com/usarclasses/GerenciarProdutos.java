package br.com.usarclasses;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos {

	public static void main(String[] args) {
		/*3
		 * Vamos criar um vetor (array|Coleçao) de categoria
		 * 
		 */
		 
		 Categoria[] cat = {
				 		new Categoria(11,"Informatica" , "Tecnologia"),
				 		new Categoria(12,"Suprimentos","Diversos"),
				 		new Categoria(13,"Escolar","Para o estudo")
		 };
		
		 
		 Fornecedor[] fornecedor = {
				 new Fornecedor(51,"Microsoft","1111"),
				 new Fornecedor(52,"Logitec","556"),
				 new Fornecedor(53,"Tilibra","55487")
		 };
		 Produto pr = new Produto();
		 pr.setNome("Mouse");
		 pr.setDescricao("mouse sem fio");
		 pr.setCategoria(cat[0]);
		 pr.setFornecedor(fornecedor[0]);
		 pr.setPreco(20);
	}

}
