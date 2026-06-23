package Aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Exceções são eventos anormais que interrompem o fluxo normal da execução de um programa.
		
		Scanner sc = new Scanner(System.in);
		
		try { //Sinaliza que o código dentro das chaves pode retornar uma exceção, try = tentar rodar o código abaixo.
			
		String[] vetor = sc.nextLine().split(" "); //Vetor separado por " "
		
		int posicao = sc.nextInt(); 
		
		System.out.println(vetor[posicao]); // Se posicao for um elemento inexistent5e no vetor ele retornara um erro, uma execeção finalizando o programa.
		
		}
		catch(ArrayIndexOutOfBoundsException e) { //catch fica responsavel por capturar a exceção possivel, nesse caso a posição que não existe
			System.out.println("Posição inexistente");
		}
		catch(InputMismatchException e) {
			System.out.println("Valor digitado não corresponde à um numero do tipo inteiro");
		}
		System.out.println("Fim do programa"); //Anteriormente quando não existia o try essa parte dó código não rodava, por conta do erro de posição que encerrava a aplicação, com o try catch ele funciona normalmente, pois a execeção foi tratada.
		sc.close();	

	}

}
