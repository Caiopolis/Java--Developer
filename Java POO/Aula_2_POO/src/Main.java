import java.util.Scanner;

import Entidade.Estoque;

public class Main {

	public static void main(String[] args) {
		
		//Object toString 
		//OBS: Objetos tem outras funções como GetClass - Retorna o tipo de objeto;
		//equals - Compara objetos;
		//hashCode - Retorna um código em Hash.
		
		Scanner sc = new Scanner(System.in);
		int quantidade; 
		
		Estoque produto;
		produto = new Estoque();
		
		System.out.print("Qual o nome do pruduto: ");
		produto.nome = sc.next();
		System.out.print("Qual o preço da unidade: ");
		produto.preco = sc.nextDouble();
		System.out.print("Qual quantidade no estoque: ");
		produto.quantidadeEstoque = sc.nextInt();
		System.out.println("");
		System.out.println(produto);
		
		System.out.println("");
		
		System.out.println("Digite o numero de itens que deseja adicionar no estoque: ");
		quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println(produto);
		
		System.out.println("");
		
		System.out.println("Digite o numero de itens que deseja remover do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println(produto);

}

}