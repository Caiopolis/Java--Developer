package Aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		
		String path = "C:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){  // new FileWriter(path) cria um arquivo, quando tem um boolean (FileWriter(path, true)) na assinatura ele pega um que já existe.
			
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
			
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}