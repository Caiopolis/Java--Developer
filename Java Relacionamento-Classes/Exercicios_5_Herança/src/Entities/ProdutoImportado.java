package Entities;

public class ProdutoImportado extends Produto {

	private Double taxaAlfandega;
	
	
	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado (String nome, Double preco, Double taxaAlfandega) {
		super(nome,preco);
		this.taxaAlfandega = taxaAlfandega;
		
	}
	
	

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public double calcularTotal() {
		
		return getPreco() + this.taxaAlfandega;
		
	}
	@Override
     public String tagProduto() {
		
		return  this.getNome()+ " R$ " + this.getPreco() + " Taxa Alfandega: " + this.taxaAlfandega + " Total: " + this.calcularTotal();
		
	}
	
	
	
	
	
	
}
