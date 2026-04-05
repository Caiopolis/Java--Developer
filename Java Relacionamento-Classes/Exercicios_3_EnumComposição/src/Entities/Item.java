package Entities;

public class Item {

	private Integer quant;
	private Double preco;
	private Produto produto;
	
	
	
	
	public Item(Integer quant, Produto produto) {

		this.quant = quant;
		this.produto = produto;
	}

	public Integer getQuant() {
		return quant;
	}

	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public double subTotal() {
		
		return this.preco = produto.getPreco()*this.quant;
		
	}

	@Override
	public String toString() {
		return quant + " " + preco + " " + produto ;
	} 
	
}
