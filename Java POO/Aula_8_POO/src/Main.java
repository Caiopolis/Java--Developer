import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Matrizes
		//""Nessa aula ele explicou o conceito de matrizes por meio de um exercício""
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qual tamanho da matriz desejada: ");
		int tamanho = sc.nextInt();
		
		int[][] matriz = new int[tamanho][tamanho]; //declarando uma matriz [][] significa que ela é bidimensional sendo [n] linhas e [n] colunas
		
		
		for(int i = 0; i < tamanho; i++) {    //Primeiro for que percorre as linhas da matriz
			for(int j = 0; j<tamanho; j++) {  //Segundo for que percorre as colunas da matriz
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("A diagonal principal da matriz é: "); 
		for(int i = 0; i<tamanho; i++) { // Percorrendo a diagonal principal da matriz 0,0   1,1   2,2 etc
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println(" ");
		int quantNumNegativo = 0;
				
				for(int i = 0; i < matriz.length; i++) {    //Utilizando o length (i = linhas)
					
					for(int j = 0; j<matriz[i].length; j++) {   //Já o length nas colunas é diferente, para vericar as quantidades de coluna, primeiro vc precisa fixar uma linha i
																//Como se fosse em um vetor padrão com uma unica linha, ele retorna as colunas, então matriz[i] seleciona a linha .length retorna a quantidade de posições dessa linha (as colunas)
						if(matriz[i][j] < 0) {
							
							quantNumNegativo++;
							
						}
					}
				}
				System.out.println("A quantidade de numeros negativos é: " + quantNumNegativo);
				
		
		sc.close();
	}

}
