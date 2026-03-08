import java.util.Scanner;

public class Exercicio_complementar_matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os numeros representando a quantidade de linhas e colunas (NxM): ");
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		int[][] matriz = new int[linha][coluna];
		
		System.out.println("Insira os numero da sua matriz: ");
		
		for(int i = 0; i<matriz.length;i++) {
			
			for(int j = 0; j<matriz[i].length;j++) {
				matriz[i][j] = sc.nextInt();
			}	
		}

		System.out.println("Qual numero deseja visualizar a posição: ");
		int numeroEscolhido = sc.nextInt();
		
		for(int i = 0; i<matriz.length;i++) {
			
			for(int j = 0; j<matriz[i].length;j++) {
				if(matriz[i][j] == numeroEscolhido) {
					System.out.println("Posição: " + i + "," + j);
					
					if(j > 0) {
						
						System.out.println("Numero a esquerda: " + matriz[i][j-1]);
						
					}if(i > 0) {
						
						System.out.println("Numero acima: " + matriz[i-1][j]);
						
					}if(i < matriz.length-1) {
						
						System.out.println("Numero abaixo: " + matriz[i+1][j]);
					}if(j < matriz[i].length-1) {
						
						System.out.println("Numero a direita: " + matriz[i][j+1]);
					}
					
					
				}
			}
			
			
		}

	}

}
