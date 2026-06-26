package Aplication;

import java.util.Scanner;

import Model.Entities.ContaBancaria;
import Model.Exceptions.ContaExceptions;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Entre com os dados da conta");
			System.out.print("Numero conta: ");
			int numConta = sc.nextInt();
			System.out.print("Nome colaborador: ");
			String nomeConta = sc.next();
			sc.nextLine();
			System.out.print("Saldo inicial conta: ");
			double saldo = sc.nextDouble();
			System.out.print("limite saque conta: ");
			double limitaSaldo = sc.nextDouble();
			
			ContaBancaria contaBancaria = new ContaBancaria(numConta, nomeConta, saldo, limitaSaldo);
			
			System.out.print("Valor de saque: ");
			double saque = sc.nextDouble();
			contaBancaria.saque(saque);
			System.out.println("Novo saldo: " + contaBancaria.getSaldo());
		}
		catch(ContaExceptions e) {
			System.out.println(e.getMessage());
		}

	}

}
