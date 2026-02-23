import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
		//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
		//bem como os nomes dessas pessoas caso houver.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão listadas?");
		int quantidadePessoas = sc.nextInt();
		String [] listaNome = new String[quantidadePessoas];
		int [] listaIdade = new int[quantidadePessoas];
		double [] listaAltura = new double[quantidadePessoas];
		double mediaAltura = 0;
		double somaAltura = 0;
		double porcentagemMenoresIdades = 0;
		int quantidadeMenores = 0;
		
		for(int i = 0;quantidadePessoas > i;i++) {
			
			System.out.printf("Digite os dados da %d pessoa %n", i+1);
			System.out.print("Nome: ");
			listaNome[i] = sc.next();
			
			System.out.print("Idade: ");
			listaIdade[i] = sc.nextInt();
	
			System.out.print("Altura: ");
			listaAltura[i] = sc.nextDouble();
			
			somaAltura += listaAltura[i];
			mediaAltura = somaAltura/listaAltura.length;
		}
		
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		
		System.out.println("Pessoas com menos de 16 anos:");
		
		for(int i = 0;quantidadePessoas > i;i++) {
			
			if(listaIdade[i] < 16) {
				
				System.out.println(listaNome[i]);
				quantidadeMenores++;
				
			}
			
		}
		
		double porcentagem = (double) quantidadeMenores / quantidadePessoas * 100.0;
		
		System.out.printf("Porcentagem de menores de idade: %.1f%%", porcentagem);
			
	}
	
}
