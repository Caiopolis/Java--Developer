package Aplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
		//Finally É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção.
		
		
		File file = new File("C:\\temp\\in.txt"); // Prévia do proximo capitulo de arquivos
		Scanner sc = null;
			
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {  //Aqui o Finally entra em ação, mesmo se ocorrer a exceção ele é executado, neste caso ele fecha o Scanner.
				   // A grooso modo seria como colocar um código fora das {} do método try, a diferença é no tratamento e organização das funçõe no código.
			if (sc != null) {
				sc.close();
			}
		}
	}
}