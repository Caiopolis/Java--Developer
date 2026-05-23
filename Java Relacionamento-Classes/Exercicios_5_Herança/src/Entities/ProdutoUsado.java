package Entities;

import java.time.LocalDate;

public class ProdutoUsado extends Produto {

	private LocalDate dataCriacao;

	
	public ProdutoUsado() {
	
	}


	public ProdutoUsado(String nome, Double preco, LocalDate dataCriacao) {
		super(nome, preco);
		this.dataCriacao = dataCriacao;
	}


	public LocalDate getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
	@Override
    public String tagProduto() {
		
		return  this.getNome()+ " (Usado)" + " R$ " + this.getPreco() + " (Data de criação: " + this.dataCriacao + ")";
		
	}
	
	
}
