import java.util.Scanner;

import Classes.Banco;

public class Main {

	public static void main(String[] args) {
		
		//Introdução aos contrutores
		
		
		Scanner sc = new Scanner(System.in);
		Banco conta1, conta2, conta3;
		
		conta1 = new Banco(1000,"Caio");
		
		System.out.println(conta1); //Chamando o objeto já com o construtor, saldo = 1000 e nome = caio
		
		//Ou podemos instanciar o objeto após a leitura de certas variaveis e coloca-las como paramêtro.
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite o valor que já deseja ter em conta");
		double valor = sc.nextDouble();
		
		conta2 = new Banco (valor,nome);
		System.out.println(conta2);
		
		System.out.println("Digite seu nome (teste sobrecarga): ");
		String titular = sc.next();
		conta3 = new Banco(titular); //Construtor em sobrecarga (diferente dos anteriores este possuí somente 1 paramêtro)
		System.out.println(conta3);
		
		
	}

}
	