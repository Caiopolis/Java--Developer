package entities;

public class Product {
	
	private String name;  //Encapsulamento (Seguindo a norma do encapsulamento todo atributo de uma classe deve ser private)
	private double price;
	private int quantity;
	
	public Product(String name) {
		this.name = name;
	}
	
	public String getName() { //Como os atributos são "inacessiveis" o get retorna os valores.
	return name;
	}
	
	public void setName(String name) { //Como os atributos são "inacessiveis" o set modifica os valores.
	this.name = name;
	}
	
	public double getPrice() {
	return price;
	}
	
	public void setPrice(double price) {
	this.price = price;
	}
	
	public int getQuantity() { //Quantidade só tera o método get, não há possibilidade de alterar a quantidade manualmente, somente com a saida e entrada de produtos
	return quantity;			//Por este motivo somente o get é suficiente.
	}
	
	//OBS: Botão direito -> Source -> Generate Constructor using Fields
	//     Botão direito -> Source -> Generate Getters and Setters
	//     A IDE cria automaticamente os métodos GET, SET e CONSTRUTOR
}
