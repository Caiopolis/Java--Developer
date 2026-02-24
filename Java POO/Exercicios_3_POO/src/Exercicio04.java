import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
		// tela todos os números pares, e também a quantidade de números pares. 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você deseja digitar? ");
		int quantidadeNum = sc.nextInt();
		int [] listaNum = new int[quantidadeNum];
		int quantidadePares = 0;
		
		for(int i = 0; listaNum.length > i;i++) {
			
			System.out.print("Digite o numero: ");
			listaNum[i] = sc.nextInt();
			
		}
		
		System.out.println("Numeros pares:");
		
		for(int i = 0; listaNum.length > i;i++) {
			
			if(listaNum[i] % 2 == 0) {
				
				System.out.print(" " + listaNum[i]);
				quantidadePares++;
			}
			
		}
		System.out.println(" ");
		System.out.printf("Quantidade de pares: %d", quantidadePares);

	}

}
