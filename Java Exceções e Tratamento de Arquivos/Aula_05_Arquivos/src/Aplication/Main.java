package Aplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\in.txt"); //Classe File é responsavel por realizar o armazenamento do arquivo requerido.
		
		Scanner sc = null; //Leitor por padrão é null
		
		try {
			sc = new Scanner(file);  // Scanner lê o arquivo
			while (sc.hasNextLine()) { //While para entrar no loop enquanto houver linhas no arquivo
				System.out.println(sc.nextLine()); // Imprimi o conteúdo
			}
		}
		catch(IOException e) { //Exceção padrão para tratamento de arquivos
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
