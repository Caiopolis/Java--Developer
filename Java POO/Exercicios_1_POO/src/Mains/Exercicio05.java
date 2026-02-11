package Mains;

import java.util.Scanner;

import Classes.Banco;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Banco conta1;
		
		conta1 = new Banco();
		
	
		
		System.out.println("Digite seu nome: ");
		conta1.titular = sc.next();
		
		System.out.println("Digite o valor que deseja depositar: ");
		conta1.valor = sc.nextDouble();
		conta1.depositar(conta1.valor);
		
		
		System.out.println("Digite o valor que deseja sacar: ");
		conta1.valor = sc.nextDouble();
		conta1.sacar(conta1.valor);
		
		System.out.println(conta1);
		
		
		

	}

}
