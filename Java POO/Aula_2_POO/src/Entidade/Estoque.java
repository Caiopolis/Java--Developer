package Entidade;

public class Estoque {
	
	public String nome;
	public double preco;
	public int quantidadeEstoque;
	
	public double totalValorProduto() {
		return preco * quantidadeEstoque;
	}
	
	public void addProduto(int quantidadeEstoque) {
		
		 
		 this.quantidadeEstoque += quantidadeEstoque; //Utilizando o this, para especificar o atributo da classe.
		
	}
	
	public void removeProduto(int quantidadeEstoque) {
		
		 this.quantidadeEstoque -= quantidadeEstoque;
		 
	}
	
	public String toString() {
		
		return "Nome: " + nome 
				+ " "
				+ "Preço unitário: " + String.format("%.2f", preco) //String.fromat() nome é bem auto-explicativo
				+ " "
				+ "Quantidade em estoque: " + quantidadeEstoque 
				+ " "
				+ "Preço total: " + String.format("%.2f", totalValorProduto());
				
}
}