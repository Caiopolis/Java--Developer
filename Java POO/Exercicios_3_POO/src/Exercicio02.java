import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		//- Imprimir todos os elementos do vetor
		//- Mostrar na tela a soma e a média dos elementos do vetor
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros deseja digitar: ");
		int quantidadeNum = sc.nextInt();
		double [] listaNum = new double[quantidadeNum];
		double soma = 0;
		double media = 0;
		
		for(int i = 0;listaNum.length > i;i++) {
			
			System.out.print("Digite os numero: ");
			listaNum[i] = sc.nextDouble();
			soma+=listaNum[i];
			media = soma/listaNum.length;
		}
		
		System.out.print("Os valores são: ");
		
		for(int i = 0;listaNum.length > i;i++) {
			
			System.out.printf("%.2f ",listaNum[i]);
		}
		System.out.printf("%n");
		System.out.printf("A soma dos valores é: %.2f %n",soma);
		System.out.printf("A média dos valores é: %.2f %n",media);
	}

}
