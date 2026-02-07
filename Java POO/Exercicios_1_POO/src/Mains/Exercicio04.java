package Mains;

import java.util.Scanner;

import Classes.Conversor;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
		//uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
		//que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do dolar hoje em reais: ");
		Conversor.valorUnitarioDolar = sc.nextDouble();
		System.out.println("Digite o valor em dolares que você deseja (calculo é feito sobre immposto de 6%): ");
		Conversor.valorDolar = sc.nextDouble();
		System.out.printf("O valor total que você irá pagar em reais para conseguir $%.2f é de R$%.2f",Conversor.valorDolar,Conversor.convercao()) ;
	}

}
