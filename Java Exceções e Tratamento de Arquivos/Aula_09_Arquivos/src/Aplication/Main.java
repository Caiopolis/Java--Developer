package Aplication;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho do arquivo: ");
		String strCaminho = sc.nextLine();
		
		File caminho = new File(strCaminho);
		
		File[] pastas = caminho.listFiles(File::isDirectory); //Faz uma lista de pastas de acordo com o caminho inserido
		
		System.out.println("PASTAS:");
		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		
		File[] files = caminho.listFiles(File::isFile);  //Faz uma lista de arquivos de acordo com o caminho inserido
		System.out.println("ARQUIVOS:");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean sucesso = new File(strCaminho + "\\subpasta").mkdir(); //Cria uma pasta de acordp com o caminho inserido
		
		if(sucesso != true) {
			System.out.println("Erro ao adicionar arquivo");
		}else {
			System.out.println("Arquivo criado com sucesso " + sucesso);
		}
		
		
		System.out.println("getName: " + caminho.getName()); //Há varios tipo de funções que podemos usar, essa por exeplo pega o nome da pasta do caminho.
		System.out.println("getParent: " + caminho.getParent()); //Retorna o caminho.

		sc.close();
		
	}

}
