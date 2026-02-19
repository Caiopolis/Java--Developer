import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		//Introdução aos Vetores padrões (sem variaveis do tipo classe)
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double [] lista = new double[num]; //Declarando um vetor. obs: É necessario instanciar um vetor.
		double media = 0;
				
		for(int i = 0; i < num; i++) {
			
			lista[i] = sc.nextDouble();
			media += (lista[i]) / num;
		}
		System.out.printf("Sua média é: %.2f %n",media);
		
		
		

		//Vetores referenciados (com variaveis do tipo classe)
		
		double soma = 0;
		double mediaPreco = 0;
				
		System.out.println("Digite a quantidade de produtos que deseja cadastrar: ");
		int quantidadeProd = sc.nextInt();
		
		Produto[] listaProd = new Produto[quantidadeProd]; //Tipo do vetor é a própra classe.
		
		for(int i = 0; i < listaProd.length; i++) { //Utilizando length
			
			System.out.println("Digite o nome: ");
			String nome = sc.next();
			
			System.out.println("Digite o preco: ");
			double preco = sc.nextDouble();

			listaProd[i] = new Produto(nome,preco); //Instanciando cada objeto no vetor
			
			soma += listaProd[i].getPreco(); //Somando cada preço dos objetos cadastrados (produtos)
		}
		
		mediaPreco = soma/quantidadeProd;
		
		System.out.printf("A média dos produtos cadastrados é: %.2f", mediaPreco);
	
	}

}
