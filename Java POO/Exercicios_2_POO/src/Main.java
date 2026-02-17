import java.util.Scanner;

import Entidades.Banco;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Banco conta1;
		conta1 = new Banco();
		
		//Set nome
		System.out.println("Qual o seu nome?");
		String nome = sc.nextLine();
		conta1.setNomeTitular(nome);
		
		System.out.println("O código da sua conta é: " + conta1.getNumeroDaConta());
		
		System.out.println("Voce quer iniciar sua conta com um depósito?");
	    String resposta = sc.next().toUpperCase();
	    
	    if("SIM".equalsIgnoreCase(resposta)) {
	    	System.out.println("Qual o valor vocâ deseja depositar?");
	    	double valor = sc.nextDouble();
	    	conta1.deposito(valor);
	    }else {
	    	System.out.println("Sem Problema!!");
	    }
	    System.out.println("Seja Bem-Vindo!!");
	    System.out.println(conta1);
	    
	    System.out.println("Quanto deseja depositar?");
	    double valor = sc.nextDouble();
	    conta1.deposito(valor);
	    System.out.println(conta1);
	    
	    System.out.println("Quanto deseja sacar?");
	    valor = sc.nextDouble();
	    conta1.saque(valor);
	    System.out.println(conta1);
		
		sc.close();
	}
}
