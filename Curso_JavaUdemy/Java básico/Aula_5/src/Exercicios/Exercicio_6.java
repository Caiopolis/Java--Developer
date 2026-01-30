package Exercicios;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
	//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		//mostre:
			//a) a área do triângulo retângulo que tem A por base e C por altura.
			//b) a área do círculo de raio C. (pi = 3.14159)
			//c) a área do trapézio que tem A e B por bases e C por altura.
			//d) a área do quadrado que tem lado B.
			//e) a área do retângulo que tem lados A e B.

		
		double A,B,C;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite 3 números que retornaremos a área de várias formas geométricas");
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		//Triângulo:
		
			System.out.printf("A área do triângulo é (A valor base, C valor altura) = %.3f%n", (A*C)/2 );
		
		//Circulo
			
			System.out.printf("A área do circulo é (C Raio) = %.3f%n", 3.14159 * (Math.pow(C, 2)) );
			
		//Trapezio
			
			System.out.printf("A área do Trapezio é (C valor altura, A e B valor base) = %.3f%n",  ((A+B)*C)/2);
			
		//Quadrado
			
			System.out.printf("A área do Quadrado é (B valor lado) = %.3f%n", B*4 );
			
		//Retãngulo
			
			System.out.printf("A área do Retângulo é (A lados laterais e B lados frontais ) = %.3f%n", A*B );
		
			
			sc.close();
	}

}
