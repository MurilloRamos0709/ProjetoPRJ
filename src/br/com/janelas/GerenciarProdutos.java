package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos extends JFrame{
	
	//Elementos para a categoria
	static JLabel lblIdCat = new JLabel("Id Categoria:");
	static JLabel lblNomeCat = new JLabel("Nome Categoria:");
	static JLabel lblDescCat = new JLabel("Descri��o:");
	
	static JTextField txtIdCat = new JTextField();
	static JTextField txtNomeCat = new JTextField();
	static JTextField txtDescCat = new JTextField();
	
	static JButton btnCadCat = new JButton("Cadastrar Categoria");
	
	//Elementos para o fornecedor
	static JLabel lblIdFor = new JLabel("Id Forncedor:");
	static JLabel lblRS = new JLabel("Raz�o Social:");
	static JLabel lblCnpj = new JLabel("CNPJ:");
			
	static JTextField txtIdFor = new JTextField();
	static JTextField txtRS = new JTextField();
	static JTextField txtCnpj = new JTextField();
	
	static JButton btnCadFor = new JButton("Cadastrar Fornecedor");
	
	//Elementos para produtos
	
	static JLabel lblIdPr = new JLabel("Id Produto");
	static JLabel lblNomePr = new JLabel("Nome do produto");
	static JLabel lblDescPr = new JLabel("Descri��o Produto");
	static JLabel lblCategoria = new JLabel("Selecione uma Categoria");
	static JLabel lblFornecedor = new JLabel("Selecione um Fornecedor");
	static JLabel lblPrecoPr = new JLabel("Pre�o do Produto");
	
	static JTextField txtIdPr = new JTextField();
	static JTextField txtNomePr = new JTextField();
	static JTextField txtDescPr = new JTextField();
	static JTextField txtCategoria = new JTextField();
	static JTextField txtFornecedor = new JTextField();
	static JTextField txtPrecoPr = new JTextField();
	
	static JButton btnCadPr = new JButton("Cadastrar Produto");

	public static void main(String[] args) {
		JFrame gerenciar = new JFrame();
		gerenciar.setTitle("Gerenciar Produtos");
		gerenciar.setSize(715,620);
		gerenciar.setLocationRelativeTo(null);
		gerenciar.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gerenciar.setResizable(false);
		//Definir o gerenciamento do layout como absoluto, ou seja, nulo
		gerenciar.getContentPane().setLayout(null);
		
		lblIdCat.setBounds(10,10,150,30);
		gerenciar.add(lblIdCat);
		
		txtIdCat.setBounds(10,45,100,30);
		gerenciar.add(txtIdCat);
		
		lblNomeCat.setBounds(10,75,150,30);
		gerenciar.add(lblNomeCat);
		
		txtNomeCat.setBounds(10,110,160,30);
		gerenciar.add(txtNomeCat);
		
		lblDescCat.setBounds(10,140,150,30);
		gerenciar.add(lblDescCat);
		
		txtDescCat.setBounds(10,175,160,30);
		gerenciar.add(txtDescCat);
		
		btnCadCat.setBounds(10,220,160,30);
		gerenciar.add(btnCadCat);
		
		//---------------------controle Fornecedor---------------------
		
		
		lblIdFor.setBounds(10, 260, 100, 30);
		gerenciar.add(lblIdFor);
		
		txtIdFor.setBounds(10, 290, 100, 30);
		gerenciar.add(txtIdFor);
		
		lblRS.setBounds(10, 320, 100, 30);
		gerenciar.add(lblRS);
		
		txtRS.setBounds(10, 350, 180, 30);
		gerenciar.add(txtRS);
		
		lblCnpj.setBounds(10, 380, 100, 30);
		gerenciar.add(lblCnpj);
		
		txtCnpj.setBounds(10, 410, 100, 30);
		gerenciar.add(txtCnpj);
		
		btnCadFor.setBounds(10, 480, 165, 30);
		gerenciar.add(btnCadFor);
		
		
		
		
		//------------------------controle Produto----------------------
		
		lblIdPr.setBounds(230, 10, 150, 30);
		gerenciar.add(lblIdPr);
		
		txtIdPr.setBounds(230, 35, 100, 30);
		gerenciar.add(txtIdPr);
		
		lblNomePr.setBounds(230, 75, 150, 30);
		gerenciar.add(lblNomePr);
		
		txtNomePr.setBounds(230, 110, 450, 30);
		gerenciar.add(txtNomePr);
		
		lblDescPr.setBounds(230, 140, 150, 30);
		gerenciar.add(lblDescPr);
		
		
		txtDescPr.setBounds(230, 175, 450, 100);
		gerenciar.add(txtDescPr);
		
		lblCategoria.setBounds(230, 280, 150, 30);
		gerenciar.add(lblCategoria);
		
		txtCategoria.setBounds(230, 310, 450, 30);
		gerenciar.add(txtCategoria);
		
		lblFornecedor.setBounds(230, 350, 150, 30);
		gerenciar.add(lblFornecedor);
		
		txtFornecedor.setBounds(230, 385, 450, 30);
		gerenciar.add(txtFornecedor);
		
		lblPrecoPr.setBounds(230, 420, 150, 30);
		gerenciar.add(lblPrecoPr);
		
		txtPrecoPr.setBounds(230, 450, 180, 30);
		gerenciar.add(txtPrecoPr);
		
		btnCadPr.setBounds(230, 500, 180, 30);
		gerenciar.add(btnCadPr);
		
		
		
		
		
		
		
		//############################Desabilitar os controles textfield do
		//##################### Fornecedor e produto
		//#####################
		
		txtIdFor.setEnabled(false);
		lblRS.setEnabled(false);
		txtCnpj.setEnabled(false);
		btnCadFor.setEnabled(false);
		
		txtIdPr.setEnabled(false);
		txtNomePr.setEnabled(false);
		txtDescPr.setEnabled(false);
		txtFornecedor.setEnabled(false);
		txtCategoria.setEnabled(false);
		txtPrecoPr.setEnabled(false);
		btnCadPr.setEnabled(false);
		
		
		
		//--------- Vasmos criar o objeto categoria e passar os dados doformulario
		//--------- para os dados do formulario para
		//--------- o objeto criado
		Categoria cat = new Categoria();
		
		//---vamos fazer a passagem dos dados para objetos
		//---no momento em cricarmos no botao de cadastro
		btnCadCat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			  cat.setId(Integer.parseInt(txtIdCat.getText()));
			  cat.setNome(txtNomeCat.getText());
			  cat.setDescricao(txtDescCat.getText());
			  
			  //Desabilitar as caixas da categoria
			  txtIdCat.setEnabled(false);
			  txtNomeCat.setEnabled(false);
			  txtDescCat.setEnabled(false);
			  btnCadCat.setEnabled(false);
			  
			  //------------habilitar as caixas do fornecedor
			  
			  txtIdFor.setEnabled(true);
				lblRS.setEnabled(true);
				txtCnpj.setEnabled(true);
				btnCadFor.setEnabled(true);
				
				
			}
		});
		
		//--Vanos intaciar a classe fornecedor e passar os dasos 
		//para objeto no momento que o botao de cadastro
		//for cricado
		
		
		Fornecedor f = new Fornecedor();
		
		btnCadFor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setId(Integer.parseInt(txtIdFor.getText()));
				f.setRazaoSocial(txtRS.getText());
				f.setCnpj(txtCnpj.getText());
				
				//-----desabilitar as caixas fornecedor
				
				txtIdFor.setEnabled(false);
				lblRS.setEnabled(false);
				txtCnpj.setEnabled(false);
				btnCadFor.setEnabled(false);
				
				//--Habilitar os controles produto
				
				txtIdPr.setEnabled(true);
				txtNomePr.setEnabled(true);
				txtDescPr.setEnabled(true);
				txtFornecedor.setEnabled(true);
				txtCategoria.setEnabled(true);
				txtPrecoPr.setEnabled(true);
				btnCadPr.setEnabled(true);
			}
		});
		
		
		//vamos criar um objeto baseado em 
		//produtos para passar os dados no momento do clique
		
		Produto pr = new Produto();
		btnCadPr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pr.setId(Integer.parseInt(txtIdPr.getText()));
				pr.setNome(txtNomePr.getText());
				pr.setDescricao(txtDescPr.getText());
				pr.setCategoria(cat);
				pr.setFornecedor(f);
				pr.setPreco(Double.parseDouble(txtPrecoPr.getText()));
				
				//----Desabilitar os controles do produto
				
				txtIdPr.setEnabled(false);
				txtNomePr.setEnabled(false);
				txtDescPr.setEnabled(false);
				txtFornecedor.setEnabled(false);
				txtCategoria.setEditable(false);
				txtPrecoPr.setEnabled(false);
				btnCadPr.setEnabled(false);
				
				//----Caixa de confirma��o
				
JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
				
				//Habilitar Cateforias
				txtIdCat.setEnabled(true);
				txtNomeCat.setEnabled(true);
				txtDescCat.setEnabled(true);
				btnCadCat.setEnabled(true);
				
			}
		});
		
		
		
		
		
		
		
		gerenciar.setVisible(true);
		
		

	}

}
