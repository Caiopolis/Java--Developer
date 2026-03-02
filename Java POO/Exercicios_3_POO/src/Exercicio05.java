import java.util.Scanner;

class Exercicio05 {

	public static void main(String[] args) {
		
		// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
		//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
		//considerando a primeira posição como 0 (zero).
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você deseja digitar? ");
		int quantidadeNum = sc.nextInt();
		double [] listaNum = new double[quantidadeNum];
		double maiorValor = listaNum[0];
		int posicao = 0;
		for(int i = 0; i< listaNum.length; i++) {
			
			System.out.println("Digite um numero: ");
			listaNum[i] = sc.nextDouble();
			
			if(maiorValor < listaNum[i]) {
				maiorValor = listaNum[i];
				posicao = i;
			}
		}
		System.out.println("O maior valor é: " + maiorValor);
		System.out.println("A posição dele na lista é: " + posicao);

	}

}
