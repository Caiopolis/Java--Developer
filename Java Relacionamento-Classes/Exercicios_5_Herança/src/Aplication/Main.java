package Aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Produto;
import Entities.ProdutoImportado;
import Entities.ProdutoUsado;

public class Main {

	public static void main(String[] args) {
	
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		List<Produto> listaProduto = new ArrayList<>();
		System.out.println("Digite quantos produtos irá armazenar: ");
		
		int quant = sc.nextInt();
		
		for(int i = 0; i<quant;i++) {
			
			System.out.printf("Produto #%d \n",i+1);
			
			System.out.println("Comum, Usado ou Importado? (c/u/i)");
			String response = sc.next();
			
			if(response.equals("c")){
				
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preço: ");
				double preco = sc.nextDouble();
				
				Produto produto = new Produto(nome, preco);
				
				listaProduto.add(produto);
				
				
			}else if(response.equals("u")) {
				
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preço: ");
				double preco = sc.nextDouble();
				System.out.print("Digite a data de criação do produto (dd/mm/aaaa): ");
				String dataString = sc.next();
				LocalDate dataFormatada = LocalDate.parse(dataString,fm1);
				
				Produto produtoUsado = new ProdutoUsado(nome,preco,dataFormatada);
				
				listaProduto.add(produtoUsado);
			}else {
				
				System.out.print("Nome: ");
				String nome = sc.next();
				sc.nextLine();
				System.out.print("Preço: ");
				double preco = sc.nextDouble();
				System.out.print("Preço da taxação: ");
				double precoTaxa = sc.nextDouble();
				
				Produto produtoImportado = new ProdutoImportado(nome,preco,precoTaxa);
				
				ProdutoImportado prod = (ProdutoImportado) produtoImportado;
				prod.calcularTotal();
				listaProduto.add(prod);
				
				
				
				
				
			}
			
		}
		System.out.println("\n");
		for(Produto x : listaProduto) {
			System.out.println(x.tagProduto());
		}

	}

}
