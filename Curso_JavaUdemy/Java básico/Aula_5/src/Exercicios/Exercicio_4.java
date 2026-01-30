package Exercicios;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.

		
		Scanner sc = new Scanner(System.in);
		
		int id;
		double numHoras,numPorHora, salario;
		
		System.out.println("Digite seu id:");
		
		id = sc.nextInt();
		
		System.out.println("Digite suas horas trabalhadas:");
		
		numHoras = sc.nextDouble();
		
		System.out.println("Digite o valor por hora:");
		
		numPorHora = sc.nextDouble();			
		
		salario = numHoras * numPorHora;
		
		System.out.println("Number = " + id);
		System.out.println("Salary = " + salario);
		
		sc.close();
	}

}
