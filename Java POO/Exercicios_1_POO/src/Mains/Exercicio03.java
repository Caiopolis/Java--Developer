package Mains;

import java.util.Scanner;

import Classes.Trimestre;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Trimestre aluno1;
		aluno1 = new Trimestre();
		
		System.out.println("Digite seu nome e suas 3 notas do Trimestre");
		aluno1.nome = sc.next();
		aluno1.nota1 = sc.nextDouble();
		aluno1.nota2 = sc.nextDouble();
		aluno1.nota3 = sc.nextDouble();
		
		System.out.println("Olá " + aluno1.nome);
		aluno1.calculoNota();
		aluno1.validarNota();
	}

}
