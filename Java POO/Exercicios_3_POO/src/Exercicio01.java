import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros deseja digitar: ");
		int quantidadeNum = sc.nextInt();
		int [] listaNum = new int[quantidadeNum];
		
		for(int i = 0;quantidadeNum > i;i++) {
			
			System.out.print("Digite um numero: ");
			listaNum[i] = sc.nextInt();
			
		}
		
		System.out.println("Numeros negativos: ");
		for(int i = 0;listaNum.length > i;i++) {
			
			if(listaNum[i] < 0) {
				System.out.println(listaNum[i]);
			}
			
		}
		sc.close();
			
	}

}
