import java.util.Scanner;


import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		// Encapsulamento, Getters e Setters.
		
		Scanner sc = new Scanner(System.in);
		Product prod1;
		
		prod1 = new Product("TV");
		
		System.out.println(prod1.getName());//Get retorna o valor do atributo que está como private
		prod1.setName("Celular"); //Set altera o valor do atributo que está como private
		System.out.println(prod1.getName());

	}

}
