package Aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Produto> listaProdutos = new ArrayList<>(); 
		
		System.out.println("Digite o caminho do arquivo:");
		String stringCaminhoArquivo = sc.nextLine();
		
		File caminhoArquivo = new File(stringCaminhoArquivo);
		
		String stringCaminhoPasta = caminhoArquivo.getParent();
		
		boolean sucesso = new File(stringCaminhoPasta + "\\out").mkdir();
		
		String arquivo = stringCaminhoPasta + "\\out\\sumarry.cvs";
		
		try(BufferedReader br = new BufferedReader(new FileReader(stringCaminhoArquivo))){
			
			String item = br.readLine();
			while(item != null) {
			
				String[] itens = item.split(",");
				String name = itens[0];
				Integer quantidade = Integer.parseInt(itens[2]);
				Double preco = Double.parseDouble(itens[1]);
				
				listaProdutos.add(new Produto(name, preco, quantidade));
				item = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))){
				
				for(Produto produto : listaProdutos) {
					bw.write(produto.getNome() + "," + String.format("%.2f", produto.subTotal()));
					bw.newLine();
				}
				System.out.println("Arquivo Criado e Editado com sucesso");
				
			}catch (IOException e ) {
				
				System.out.println("Erro: " + e.getMessage());
			}
			
		}catch (IOException e ) {
			
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();

	}

}
