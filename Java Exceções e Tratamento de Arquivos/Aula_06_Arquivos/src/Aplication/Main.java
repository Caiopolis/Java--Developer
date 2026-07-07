package Aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String caminho = "C:\\temp\\in.txt";
		FileReader fr = null; //FileReader é responsavel por ler os arquivos de maneira mais rápida que o scanner
		BufferedReader br = null; // BufferedReader é usado em conjunto com o FileReader, usando a memória temporaria para aumentar a velocidade da leitura do arquivo 
		
		
		try {
			
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			
			String line = br.readLine(); // readLine lê a primeira linha que possuir caracter
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine(); //Dentro do loop o read vai sempre ler a proxima linha a partir da anterior
			}
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			try {
				
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
