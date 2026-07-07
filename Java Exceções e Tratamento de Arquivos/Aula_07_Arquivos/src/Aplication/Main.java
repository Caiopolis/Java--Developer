package Aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		//Nessa aula utilizamos a mesma lógica da anterior, somente a sixtaxe será alterada, incluindo boas práticas.
		
		String caminho = "C:\\temp\\in.txt";
		//FileReader fr = null; 
		//BufferedReader br = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){ // Aqui alteramos a necessidade de criar 2 variaveis e manipula-las
		
			//fr = new FileReader(caminho);
			//br = new BufferedReader(fr);
			
			String line = br.readLine(); 
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine(); 
			}
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		}
	}


