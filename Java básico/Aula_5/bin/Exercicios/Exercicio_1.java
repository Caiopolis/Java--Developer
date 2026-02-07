package bin.Exercicios;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		// soma desses números com uma
		// mensagem explicativa.

		double x, y;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero:");
		x = sc.nextDouble();
		System.out.println("Digite um numero:");
		y = sc.nextDouble();
		
		System.out.printf("a soma de %.2f + %.2f = %.2f", x,y,x+y);
		
		sc.close();

	}

}
