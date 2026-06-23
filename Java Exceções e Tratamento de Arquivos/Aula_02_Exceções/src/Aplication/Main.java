package Aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		metodo1(); //Nesta aula separamos o código da main e criamos um método especifico para utilizar a lógica que criamos anteriormente
				   // Por boa práticas não tratamos exceções na classe Main.

		System.out.println("Fim do programa");
	}
	
	
	public static void metodo1() {
		System.out.println("Método 1 inicia");
		metodo2();
		System.out.println("Método 1 Finaliza");
		
	}
	
	public static void metodo2() {
		
		System.out.println("Método 2 inicia");
		Scanner sc = new Scanner(System.in);
		
		try { 
			
		String[] vetor = sc.nextLine().split(" "); 
		
		int posicao = sc.nextInt(); 
		
		System.out.println(vetor[posicao]); 
		
		}
		catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("Posição inexistente");
			e.printStackTrace(); //Responsavel por mostrar o mapeamento das chamadas que acarretaram na exceção, FIFO (trabalha na hierarquia de pilha)
								 //Obs: Ele retorna no console a mensagem de erro mas não finaliza a aplicação, se não houvesse essa tratamento de exceção o programa pararia no erro e finalizaria.
		}
		catch(InputMismatchException e) {
			System.out.println("Valor digitado não corresponde à um numero do tipo inteiro");
		}
		sc.close();
		
		System.out.println("Método 2 finaliza");
	}
	
	
	
}
