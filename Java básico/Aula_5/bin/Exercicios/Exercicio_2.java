package bin.Exercicios;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.

		double raio,area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio:"); 
		raio = sc.nextDouble();
		
		area = 3.14159 * (Math.pow(raio, 2));		
		
		System.out.printf("A área do seu círculo é: %.4f", area);
		
		sc.close();
	}

}
