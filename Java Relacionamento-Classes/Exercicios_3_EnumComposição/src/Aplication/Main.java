package Aplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Entities.Cliente;
import Entities.Item;
import Entities.Ordem;
import Entities.Produto;
import Entities.Enum.StatusPedido;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter conversor = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime horarioAtual = LocalDateTime.now();
        
        
		System.out.println("Entre com os dados do cliente: ");
		System.out.println("Nome: ");
		String nomeCliente = sc.next();
		System.out.println("Email: ");
		String emailCliente = sc.next();
		System.out.println("Data Aniversario (DD/MM/YYYY): ");
		String dataAniversario = sc.next();
		LocalDate dataFormatadaAniversario = LocalDate.parse(dataAniversario, conversor);
		
		Cliente clinte1 = new Cliente(nomeCliente,emailCliente,dataFormatadaAniversario);
		
		System.out.println("Entre com os dados do pedido: ");
		
		System.out.println("Status: ");
		String status = sc.next();
		System.out.println("Quantos iten deseja inserir? ");
		int quantItens = sc.nextInt();
		
		Ordem ord1 = new Ordem(horarioAtual,StatusPedido.valueOf(status),clinte1);
		
		for(int i =0; i < quantItens;i++) {
			
			System.out.printf("#%d item \n",i+1);
			System.out.println("Nome Produto: ");
			String nomeProduto = sc.next();
			System.out.println("Preço Produto: ");
			double precoProduto = sc.nextDouble();
			System.out.println("Quantidade: ");
			int quantidadeProduto = sc.nextInt();
			
			Item ItemProd = new Item(quantidadeProduto, new Produto(nomeProduto,precoProduto));
			ord1.addItem(ItemProd);
		
			
		}
		
		System.out.println(ord1);
		

	}

}
