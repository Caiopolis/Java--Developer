package Exercicios;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D 
		
		Scanner sc = new Scanner(System.in);
		int A,B,C,D, diferenca;
		
		System.out.println("Digite 4 numeros:");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		diferenca = (A*B)-(C*D);
		System.out.printf("Diferença do produto = (%d * %d) - (%d * %d) = %d", A,B,C,D,diferenca);
		
		sc.close();

	}

}
