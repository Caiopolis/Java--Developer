package Exercicios;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Scanner sc = new Scanner(System.in);
		int id1, id2, quant1, quant2;
		double valor1, valor2, total;
		
		
		System.out.println("Digite as informações do item 1 (id, quantidade e valor)");
		
		id1 = sc.nextInt();
		quant1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		System.out.println("Digite as informações do item 2 (id, quantidade e valor)");
		
		id2 = sc.nextInt();
		quant2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		
		total = (quant1*valor1)+(quant2*valor2);
		
		System.out.println("O valor total da compra foi de: " + total + "Reais");
		
	}

}
