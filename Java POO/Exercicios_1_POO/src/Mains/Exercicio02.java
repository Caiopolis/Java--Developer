package Mains;

import java.util.Scanner;

import Classes.Funcionario;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//Ler as informações de um funcioanrio (nome, salario, taxa)
		//Retornar salario liquido e reajuste no salario.
		
		double taxaAumento;
		Scanner sc = new Scanner(System.in);
		Funcionario func1;
		func1 = new Funcionario();

		System.out.println("Digite seu nome, salário bruto e a taxa de imposto (em real)");
		func1.nome = sc.next();
		func1.salarioBruto = sc.nextDouble();
		func1.taxa =sc.nextDouble();
		
		System.out.printf("Funcionario %s, seu salário liquido é %.2f%n", func1.nome, func1.salarioLiquido());
		
		System.out.println("Digite a porcentagem que será aderida ao seu salário bruto: ");
		taxaAumento = sc.nextDouble();
		func1.calculoAumentoSalario(taxaAumento);
		
		System.out.printf("Atualização de ficha: %s, %.2f", func1.nome, func1.calculoAumentoSalario(taxaAumento));
	
				
	}

}
