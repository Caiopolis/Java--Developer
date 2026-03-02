import java.util.Scanner;

public class Exercicios06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qauntos valores teram cada vetor: ");
		int tamanhoVetor = sc.nextInt();
		
		int [] lista01 = new int[tamanhoVetor];
		int [] lista02 = new int[tamanhoVetor];
		int [] lista03 = new int[tamanhoVetor];

		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < tamanhoVetor;i++) {
			
			lista01[i] = sc.nextInt();
			
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < tamanhoVetor;i++) {
			
			lista02[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < tamanhoVetor;i++) {
			
		lista03[i] = lista01[i] + lista02[i];
			
		}
		
		System.out.println("o Vetor resultante é: ");
		
		for(int i = 0; i < tamanhoVetor;i++) {
			
			System.out.println(lista03[i]);
				
			}
		
	}

}
