package models;

public class ProdutoBebida extends Produto{
	
	public ProdutoBebida(String nome, String quantidade, String categoria) {
		super(nome, quantidade, categoria);
	}

	public String categ(){
		
		return "2";
	}
}
